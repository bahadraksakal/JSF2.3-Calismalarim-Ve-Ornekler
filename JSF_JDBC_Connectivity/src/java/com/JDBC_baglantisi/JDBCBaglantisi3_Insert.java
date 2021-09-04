package com.JDBC_baglantisi;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCBaglantisi3_Insert {
    
    public static void main(String[] args) {
        System.out.println("başladı");
        try {
            JDBCBaglantisi3_Insert insertNesnesi = new JDBCBaglantisi3_Insert();
            insertNesnesi.Insert();
        } catch (Exception e) {
            System.out.println("e : " + e);
        }
    }
    public void Insert() throws SQLException{
        
        Connection connect=null;
        DbHelper db = new DbHelper();
        PreparedStatement statement=null;
        try {
            connect=db.getConnection();
            String sql ="insert into database_tablo.personel (personelAdi, personelSoyadi, personelEposta, personelMaasi)"+
                    "value (?, ?, ?, ?)";
            // soru işaretleri yalın olarak yazılmalıdır.
            statement=connect.prepareStatement(sql);            
            System.out.println("pass");
            statement.setString(1, "remzi");
            System.out.println("pass1");
            statement.setString(2, "can");
            System.out.println("pass2");
            statement.setString(3, "remzican@gmail.com");
            System.out.println("pass3");
            statement.setString(4, "6000");
            
            statement.executeUpdate();
            System.out.println("Kayit Başariyla Eklendi");
        } catch (SQLException e) {
            db.showError(e);
        }finally{
            statement.close();
            connect.close();
        }
    }
}
