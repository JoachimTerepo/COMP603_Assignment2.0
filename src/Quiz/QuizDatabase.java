package Quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class QuizDatabase {
    private static final String USER_NAME = "quiz";
    private static final String PASSWORD = "quiz";
    private static final String URL = "jdbc:derby:QuizDatabase;create=true";
    Connection conn;
    
    public QuizDatabase(){
        establishConnection();
    }
    
    public static void main(String[] args) {
        QuizDatabase qd = new QuizDatabase();
        qd.establishConnection();
        qd.createUserTable();
        qd.createQuestionTable();
    }

    private void establishConnection() {
        if (this.conn == null) {
            try {
                conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD); 
        }   catch (SQLException ex) {
                Logger.getLogger(QuizDatabase.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}
    
    public Connection getConnection() {
        return this.conn;
    }
    
    public void closeConnections() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(QuizDatabase.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
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
