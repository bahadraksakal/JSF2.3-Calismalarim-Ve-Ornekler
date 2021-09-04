package com.JDBC_baglantisi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
    static final String username="root";
    static final String passworld="******";
    static final String dbUrl="jdbc:mysql://localhost:3306/database_tablo?useSSL=false";
    
    public static Connection getConnection() throws SQLException{
        Connection connect = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect=DriverManager.getConnection(dbUrl,username,passworld);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }        
        return connect ;
    }
    public static void showError(SQLException exception){
        System.out.println("Error helper: "+ exception.getMessage());
        System.out.println("Error Code helper: "+ exception.getErrorCode());
    }
            
    
}
