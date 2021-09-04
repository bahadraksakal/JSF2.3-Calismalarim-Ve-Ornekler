
package controller;


import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.validation.constraints.NotNull;

/**
 *
 * @author bahad
 */
@Named(value = "yonetimliJavaBean")
//@RequestScoped // java sınıfını bean sınıfına çevirmek için yapılamsı gerek implementasyonlar
// sınıf serileştirilebilir olmalıdır.
// request  bir işlem boyunca çalışacağım demek session bir oturum boyunca çalışacağım demek.
@SessionScoped
public class YonetimliJavaBean implements Serializable{
    @NotNull(message = "hatacık")
    private String Soyad;
    private String Ad;
    private String Yazdir;
 // not geyYazdir gibi isimlendirmeler oldukça matbulaştırmıştır jfs 2.3 ile yazımlara dikkat .
    public String getYazdir() {
        System.out.println("AD: "+ Ad + "Soyad: "+Soyad);
        return "--------- ad: "+Ad + " Soyad: "+Soyad+" ----------";
    }

    public void setYazdir(String Yazdir) {
        this.Yazdir = Yazdir;
    }

    public String getSoyad() {     
        return Soyad;
    }

    public void setSoyad(String Soyad) {
        this.Soyad = Soyad;
    }    
    
    public YonetimliJavaBean() {
        this.Ad="Hello";
        this.Soyad="World";
    }

    public String getAd() {       
        return Ad;
    }

    public void setAd(String Ad) {
        this.Ad = Ad;
    }
    public String yazdir(){
        System.out.println("AD: "+ Ad + "Soyad: "+Soyad);
        return "YonetimliBean_0.xhtml";
    }
}
