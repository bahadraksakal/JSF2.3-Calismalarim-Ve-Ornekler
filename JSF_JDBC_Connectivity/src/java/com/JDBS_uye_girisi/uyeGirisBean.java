package com.JDBS_uye_girisi;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;

@Named(value = "uyegirisbean")
@RequestScoped
public class uyeGirisBean implements Serializable{
    private int uyeid;
    private String uyekullaniciadi, uyeparola;
//    private String dbuyeparola;

    public int getUyeid() {
        return uyeid;
    }

    public void setUyeid(int uyeid) {
        this.uyeid = uyeid;
    }

    public String getUyekullaniciadi() {
        return uyekullaniciadi;
    }

    public void setUyekullaniciadi(String uyekullaniciadi) {
        this.uyekullaniciadi = uyekullaniciadi;
    }

    public String getUyeparola() {
        return uyeparola;
    }

    public void setUyeparola(String uyeparola) {
        this.uyeparola = uyeparola;
    }
//-------------------------------------------- 
 
//    public String getDbuyeparola() {
//        return dbuyeparola;
//    }
//
// private String dbuyekullaniciadi;
//    public String getDbuyekullaniciadi() {
//        return dbuyekullaniciadi;
//    }

//--------------------------------------------
Connection con = null;
ResultSet resultSet = null;
PreparedStatement preparedStatement = null;

public String bigileriOnayla() {
    boolean flag=false;
    try
    {
        Class.forName("com.mysql.jdbc.Driver");
        con =DriverManager.getConnection("jdbc:mysql://localhost:3306/database_tablo?useSSL=false", "root", "Levent_1315");

        String kullaniciGirisSorgusu = "SELECT * FROM uye WHERE usarname = ? AND passworld = ?";

        preparedStatement = con.prepareStatement(kullaniciGirisSorgusu);
        preparedStatement.setString(1, this.uyekullaniciadi);
        preparedStatement.setString(2, this.uyeparola);

        resultSet =preparedStatement.executeQuery();

        if (resultSet.next()) {
            flag=true;
           System.out.println("Kullanıcı adı ve parolası doğrulandı.");
         } else {
           System.err.println("Giriş işlemi başarısız!");
         }

//        dbuyekullaniciadi=resultSet.getString(2).toString();
//        dbuyeparola=resultSet.getString(3).toString();

        uyeid=resultSet.getInt("uye_id");
        uyekullaniciadi=resultSet.getString("uyekullaniciadi").toString();
        uyeparola=resultSet.getString("uyeparola").toString();
    }catch(Exception e){
        System.err.println("Hata :" + e);
    }
    return (flag? "Basarili":"Basarisiz");
}

//--------------------------------------------

//    public String uyeGirisiniDenetle()
//    {
//        bigileriOnayla(uyekullaniciadi , uyeparola);
//
//        if(uyekullaniciadi.equalsIgnoreCase(dbuyekullaniciadi) && uyeparola.equals(dbuyeparola) ){
//            return "gecerli";
//        }
//        else {
//            return "gecersiz";
//        }
//    }


     public String uyeCikisiniDenetle(){

//      FacesContext context = FacesContext.getCurrentInstance();
//      ExternalContext ec = context.getExternalContext();
//      final HttpServletRequest request = (HttpServletRequest)ec.getRequest();
//      request.getSession( false ).invalidate();

       FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
       //kill the session

      return "uyeCikis?faces-redirect=true";
   }
}
