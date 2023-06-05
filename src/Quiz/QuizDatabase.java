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
        System.out.println(qd.getConnection());
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
