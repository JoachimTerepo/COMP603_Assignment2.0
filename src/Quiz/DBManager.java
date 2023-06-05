package Quiz;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBManager {
    private static final String USER_NAME = "quiz";
    private static final String PASSWORD = "quiz";
    private static final String URL = "jdbc:derby:QuizDatabase;create=true";
    Connection conn;
    
    private void establishConnection() {
        if (this.conn == null) {
            try {
                conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD); 
        }   catch (SQLException ex) {
                Logger.getLogger(QuizDatabase.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void createTable()
    {
        try {
            Statement statement=conn.createStatement();
            String newTableName="Users";
            String sqlCreate="create table "+newTableName+" (ID int,"
                    + "FirstName varchar(30), LastName varchar(30),"
                    + "Score int)";
            statement.executeUpdate(sqlCreate);
            
            
            String sqlInsert="insert into "+newTableName+" values("
                     + "1, 'Joachim', 'Terepo', 0),"
                     + "("
                     + "2, 'Beedrix', 'Huch', 100000),"
                     + "("
                     + "3, 'Joel', 'Macidas', 200000)";
            statement.executeUpdate(sqlInsert);
            
            //statement.close();
            System.out.println("Table created");
            
        } catch (SQLException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
