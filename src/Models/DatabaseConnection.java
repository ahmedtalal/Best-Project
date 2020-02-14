package Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DatabaseConnection {
    
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver" ;
    private static final String DB_URL = "jdbc:mysql://localhost:3306/ElfikySys";
    private static final String UNICODE = "?useUnicode=yes&characterEncoding=UTF-8";
    private static final String USERNAME = "root" ;
    private static final String PASSWORD = "" ;
    
    private DatabaseConnection(){
        
    }
    
    
    public static final Connection getconnection(){
        Connection conn = null  ;
        try {
            Class.forName(JDBC_DRIVER) ;
            try {
                conn = DriverManager.getConnection(DB_URL + UNICODE , USERNAME, PASSWORD) ;
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return conn ;
        
    }
    
    
    
}
