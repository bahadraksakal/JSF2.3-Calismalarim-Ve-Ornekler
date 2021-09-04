package com.jsfYeVeriCekmek;

import com.JDBC_baglantisi.DbHelper;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class Personel_with_JDBC implements Serializable{
    

    public Personel_with_JDBC() {
    }
    
//    public static void main(String[] args) {
//        Personel_with_JDBC jdbc = new Personel_with_JDBC();
//        List<Personel> listem=jdbc.getPersoneller_list();
//        ListIterator liT=listem.listIterator();
//        while (liT.hasNext()) {
//            Personel next = (Personel)liT.next();
//            System.out.println(next.getAd());
//            
//        }        
//    }

    public static List<Personel> getPersoneller_list(){ // throws fırlatan bir donksiyonu jsf sayfasının içinde EL ile ifade edemiyoruz.
        
        DbHelper dbHelper=null;
        Connection connect=null;
        Statement statement=null;
        List<Personel> personeller_list = new ArrayList<>();;
        System.out.println("girdi");
        try{     
//            Class.forName("com.mysql.jdbc.Driver");
//            System.out.println("try-catch girdi");
            dbHelper = new DbHelper();
            connect = dbHelper.getConnection();
            statement = connect.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM database_tablo.personel");
//            System.out.println("\n\n--start oldu--\n\n");

            while (resultSet.next()) {
                Personel personel = new Personel();
                personel.setAd(resultSet.getString(2));
                personel.setId(resultSet.getInt(1));
                personel.setMaas(resultSet.getInt(5));
                personel.setMail(resultSet.getString(4));
                personel.setSoyad(resultSet.getString(3));
                personeller_list.add(personel);

            }
            resultSet.close();
            statement.close();
            connect.close();
        }catch(SQLException ex){
            dbHelper.showError((SQLException)ex);
        }
//        System.out.println("işlem başarıyla tamamlandı");
        return personeller_list;
    }
     
}
