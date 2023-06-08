package Quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class QuizDatabase {
    //This is our database, the database has been created inside the COMP603_Assignment2.0 folder.
    //This is the username and password to access these.
    private static final String USER_NAME = "quiz";
    private static final String PASSWORD = "quiz";
    private static final String URL = "jdbc:derby:QuizDatabase;create=true";
    Connection conn;
    
    //Constructor on which establishes the connection and creates the different tables.
    public QuizDatabase(){
        establishConnection();
        createUserTable();
        createQuestionTable();
    }

    //Establish connection method.
    public void establishConnection() {
        if (this.conn == null) {
            try {
                conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
                System.out.println("Connection Established!");
        }   catch (SQLException ex) {
                Logger.getLogger(QuizDatabase.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }   
    
    //Return method that returns the connection.
    public Connection getConnection() {
        return this.conn;
    }
    
    //Close the connection method.
    public void closeConnections() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(QuizDatabase.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    //Create userTable method.
    //This creates a user table inside the database.
    //If the table exist, it will drop and give the user a friendly print statement stating it has already been created.
    public void createUserTable() {
        try (Connection conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD)) {
            try (Statement statement = conn.createStatement()) {
                String createTableSQL = "CREATE TABLE USERS("
                        + "FIRSTNAME VARCHAR(50) NOT NULL, "
                        + "LASTNAME VARCHAR(50) NOT NULL, "
                        + "EARNED VARCHAR(50) NOT NULL"
                        + ")";
                statement.executeUpdate(createTableSQL);
                System.out.println("User Table created successfully.");
            }
        } catch (SQLException e) {
            if (e.getSQLState().equals("X0Y32")) {
                // X0Y32 stops the program from creating more tables.
                System.out.println("Table already exists.");
            } else {
                e.printStackTrace();
            }
        }
    }
    
    //Create questionTable method.
    //This creates a question table inside the database.
    //If the table exist, it will drop and give the user a friendly print statement stating it has already been created.
    public void createQuestionTable() {
        try (Connection conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD)) {
            try (Statement statement = conn.createStatement()) {
                String createTableSQL = "CREATE TABLE QUESTIONS("
                        + "QUESTION VARCHAR(200) NOT NULL, "
                        + "FIRSTANSWER VARCHAR(30) NOT NULL, "
                        + "SECONDANSWER VARCHAR(30) NOT NULL, "
                        + "THRIDANSWER VARCHAR(30) NOT NULL, "
                        + "CORRECTANSWER VARCHAR(30) NOT NULL"
                        + ")";
                statement.executeUpdate(createTableSQL);
                System.out.println("Question Table created successfully.");
            }
        } catch (SQLException e) {
            if (e.getSQLState().equals("X0Y32")) {
                // X0Y32 stops the program from creating more tables.
                System.out.println("Table already exists.");
            } else {
                e.printStackTrace();
            }
        }
    }
    
    //Insert or update method.
    //This is a insert methods which writes into the database.
    //There's a if statement on which checks if the user has entered a already existing firstName and lastName.
    //If they exist, the method will instead update the database, rather inserting or writing to it.
    //If not, it will insert instead.
    public void insertOrUpdateUserData(String firstName, String lastName, int earned) {
    try {
        String selectSQL = "SELECT * FROM USERS WHERE FIRSTNAME = '" + firstName
                + "' AND LASTNAME = '" + lastName + "'";
        
        ResultSet resultSet = myQuery(selectSQL);
        
        if (resultSet.next()) {
            // User already exists, update the earned variable
            String updateSQL = "UPDATE USERS SET EARNED = '" + earned
                    + "' WHERE FIRSTNAME = '" + firstName + "' AND LASTNAME = '" + lastName + "'";
            
            myUpdate(updateSQL);
            
            System.out.println("User data updated successfully.");
        } else {
            // User does not exist, insert new user data
            String insertSQL = "INSERT INTO USERS (FIRSTNAME, LASTNAME, EARNED) VALUES ('"
                    + firstName + "', '" + lastName + "', '" + earned + "')";
            
            myUpdate(insertSQL);
            
            System.out.println("User data inserted successfully.");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}
    
    //Query method which querrys the database.
    public ResultSet myQuery(String sql) {

        Connection connection = this.conn;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultSet;
    }
    
    //Update method which updates the database.
    public void myUpdate(String sql) {

        Connection connection = this.conn;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connection.createStatement();
            statement.executeUpdate(sql);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
}
