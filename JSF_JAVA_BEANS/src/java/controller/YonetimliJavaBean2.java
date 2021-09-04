package controller;

import java.io.Serializable;
import java.util.LinkedList;

//@Named
//@SessionScoped İŞE YARAMAZ faces config açtık
public class YonetimliJavaBean2 implements Serializable{
    String isim;
    LinkedList<String> deneyim;
    String yas;

    public String getIsim() {
        return isim;
    }

    public LinkedList<String> getDeneyim() {
        return deneyim;
    }

    public void setDeneyim(LinkedList<String> deneyim) {
        this.deneyim = deneyim;
    }
    
    public String ekranaBas(){        
        return "Üye ismi: "+isim+" Üyenin Mesleği: "+deneyim+"   Üyenin yaşı: "+yas;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getYas() {
        return yas;
    }

    public void setYas(String yas) {
        this.yas = yas;
    }
    
}
