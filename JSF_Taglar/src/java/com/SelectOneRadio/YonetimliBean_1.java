package com.SelectOneRadio;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named(value = "yb_1") // başka bir beanle  aynı olursa program patlar
@RequestScoped
public class YonetimliBean_1 implements Serializable{

    private String programlamadili;
    //getter and setter metotları

    public String getProgramlamadili() {
        return programlamadili;
    }

    public void setProgramlamadili(String programlamadili) {
        this.programlamadili = programlamadili;
    }
    
//--------------------------------   
    private String ders;
 

    public String getDers() {
        return ders;
    }
    public void setDers(String ders) {
        this.ders = ders;
    }

    //--------------------------------
    private String egitmen;
       
    public String getEgitmen() {
        return egitmen;
    }
    public void setEgitmen(String egitmen) {
        this.egitmen = egitmen;
    }
//--------------------------------
    //Map Haritalama ile değerleri hazırlıyoruz.
    private static Map<String, Object> dersAdi;
    static {
        dersAdi = new LinkedHashMap<>();
        dersAdi.put("iPhone ve iPad Programlama Eğitim Seti", "Apple"); //etiket, değer
        dersAdi.put("Android Uygulama Geliştirme Seti", "Android");
        dersAdi.put("Java SE Eğitim Seti", "JavaSE");
        dersAdi.put("JavaServer Pages Eğitim Seti", "JSP");
        dersAdi.put("JavaServer Faces Eğitim Seti", "JSF");//label, value

    }

    public Map<String, Object> dersAdlariniAl() {
        return dersAdi;
    }
//--------------------------------  
    //Sınıf ile nesne aracılığı ile değerleri hazırlıyoruz.
    public class Egitmen {

        private String egitmenAdi;
        private String egitmenNo;

        public Egitmen(String egitmenAdi, String egitmenNo) {
            this.egitmenAdi = egitmenAdi;
            this.egitmenNo = egitmenNo;
        }

        public String getEgitmenAdi() {
            return egitmenAdi;
        }

        public String getEgitmenNo() {
            return egitmenNo;
        }
    }
     

    public Egitmen[] getEgitmenBilgileriniAl() {

        Egitmen[]  egitmenBilgisi = new Egitmen[5];
        egitmenBilgisi[0] = new Egitmen("Mimar ASLAN", "1453");
        egitmenBilgisi[1] = new Egitmen("Numan Tuğrul ERTUĞRUL ", "1299");
        egitmenBilgisi[2] = new Egitmen("Orhan ERİPEK", "1517");
        egitmenBilgisi[3] = new Egitmen("Kürşat KÖSE", "1326");
        egitmenBilgisi[4] = new Egitmen("Mustafa ÖZSERDAR", "1518");

        return egitmenBilgisi;
    }
}
