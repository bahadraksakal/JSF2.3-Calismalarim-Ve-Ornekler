package com.SelectOneListBox;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named(value = "solb")
@RequestScoped
public class SelectOneListBoxBean implements Serializable {
    private String tarih1,tarih2,tarih3;
//-----------------------------------
    public String getTarih1() {
        return tarih1;
    }
    public void setTarih1(String tarih1) {
        this.tarih1 = tarih1;
    }
//-----------------------------------
    public String getTarih2() {
        return tarih2;
    }
    public void setTarih2(String tarih2) {
        this.tarih2 = tarih2;
    }
//-----------------------------------
    public String getTarih3() {
        return tarih3;
    }
    public void setTarih3(String tarih3) {
        this.tarih3 = tarih3;
    }
//-----------------------------------

    //Map Haritalama ile 
    private static Map<String, String> tarih2Degeri;

    static {
        tarih2Degeri = new LinkedHashMap<>();
        tarih2Degeri.put("Sol Bek", "4"); //label, value
        tarih2Degeri.put("Kaleci", "1");
        tarih2Degeri.put("Forvet", "10");
    }

    public Map<String, String> getTarih2DegerleriniAl() {
        return tarih2Degeri;
    }
//-----------------------------------

    public class Yil {    //Bir sınıf ve nesne ile 

        public String yilEtiketi;
        public String yilDegeri;

        public Yil(String yilEtiketi, String yilDegeri) {
            this.yilEtiketi = yilEtiketi;
            this.yilDegeri = yilDegeri;
        }

        public String getYilEtiketi() {
            return yilEtiketi;
        }

        public String getYilDegeri() {
            return yilDegeri;
        }
    }
    private Yil[] tarih3Listesi;

    public Yil[] getTarih3DegerleriniAl() {

        tarih3Listesi = new Yil[3];
        tarih3Listesi[0] = new Yil("Osmanlı "
                + "İmparatorluğunun "
                + "Kuruluş "
                + "Tarihi", "1299");
        tarih3Listesi[1] = new Yil("İstanbul'un "
                + "Fetih Tarihi","1453");
        tarih3Listesi[2] = new Yil("Mısır'ın "
                + "Fetih Tarihi", "1517");

        return tarih3Listesi;
    }
}
