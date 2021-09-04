package com.JDBC_baglantisi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCBaglantisi4_Delete {
    public static void main(String[] args) {
        DbHelper dbHelper=new DbHelper();
        try {
            String silmeSorugusu="DELETE FROM `database_tablo`.`personel` WHERE (`idpersonel` = ?);";
            Connection connection=dbHelper.getConnection();
            PreparedStatement statement = connection.prepareStatement(silmeSorugusu);
            statement.setString(1, "2");
            statement.executeUpdate();
          
            System.out.println("İşlem başarıyla tamamlandı");
        } catch (SQLException e) {
            dbHelper.showError(e);
        }
    }
}
