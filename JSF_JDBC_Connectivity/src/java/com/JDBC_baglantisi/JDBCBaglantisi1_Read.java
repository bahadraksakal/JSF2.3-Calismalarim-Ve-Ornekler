
package com.JDBC_baglantisi;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCBaglantisi1_Read {
    
    public static void main(String[] args) throws SQLException {
        
        DbHelper dp = new DbHelper();
        try {            
            Connection connection = dp.getConnection();  
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM database_tablo.personel");
            
            while (resultSet.next()) {                
                System.out.print(resultSet.getString("personelAdi"));
                System.out.println(" : "+resultSet.getString(5));
            }
        } catch (SQLException e) {
            dp.showError(e);
        }

    }
    
}
