package com.SelectOneMenu;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named(value = "somb")
@RequestScoped
public class SelectOneMenuBean implements Serializable {

    private String secenek1 = "Saltanatı: 1512-1520";

    public String getSecenek1() {
        return secenek1;
    }

    public void setSecenek1(String secenek1) {
        this.secenek1 = secenek1;
    }
//---------------------------
    private String secenek2;

    public String getSecenek2() {
        return secenek2;
    }

    public void setSecenek2(String secenek2) {
        this.secenek2 = secenek2;
    }
    //Map Haritalama ile değerleri hazırlama
    private static Map<String, Object> secenek2Degeri;

    static {
        secenek2Degeri = new LinkedHashMap<>();
        secenek2Degeri.put("Yıldırım Beyazıt Han Hazretleri", "Saltanatı: 1389-1402"); //label, value
        secenek2Degeri.put("Fatih Sultan Mehmet Han Hazretleri","Saltanatı: 1451-1481");// etiketi, değeri
        secenek2Degeri.put("Yavuz Sultan Selim Han Hazretleri","Saltanatı: 1512-1520");
        secenek2Degeri.put("Kanuni Sultan Süleyman Han Hazretleri", "Saltanatı: 1520-1566");

        secenek2Degeri.put("Ulu Hakan "
                + "Cennet Mekân "
                + "Sultan II. Abdülhamid Han Hazretleri",
                "Saltanatı: 1876-1908");
    }

    public Map<String, Object> getSecenek2DegerleriniAl() {
        return secenek2Degeri;
    }
    //---------------------------     
    private String secenek3;

    public String getSecenek3() {
        return secenek3;
    }

    public void setSecenek3(String secenek3) {
        this.secenek3 = secenek3;
    }

    //Bir sınıf ile nesne üzerinden değerleri hazırlama
    public static class SanliSoyumuz {

        private String sultanAdi;
        private String saltanatSuresi;

        public SanliSoyumuz(String sultanAdi, String saltanatSuresi) {
            this.sultanAdi = sultanAdi;
            this.saltanatSuresi = saltanatSuresi;
        }

        public String getSultanAdi() {
            return sultanAdi;
        }

        public String getSaltanatSuresi() {
            return saltanatSuresi;
        }
    }
    private SanliSoyumuz[] sultanlarListesi;

    public SanliSoyumuz[] getSecenek3DegerleriniAl() {

        sultanlarListesi = new SanliSoyumuz[5];

        sultanlarListesi[0] = new SanliSoyumuz(
                "Yıldırım Beyazıt Han Hazretleri",
                "Saltanatı: 1389-1402"); //label, value

        sultanlarListesi[1] = new SanliSoyumuz(
                "Fatih Sultan Mehmet Han Hazretleri",
                "Saltanatı: 1451-1481");
        //Ekitette yazan isim, ve değer karşılığı

        sultanlarListesi[2] = new SanliSoyumuz(
                "Yavuz Sultan Selim Han Hazretleri",
                "Saltanatı: 1512-1520");

        sultanlarListesi[3] = new SanliSoyumuz(
                "Kanuni Sultan Süleyman Han Hazretleri",
                "Saltanatı: 1520-1566");

        sultanlarListesi[4] = new SanliSoyumuz("Ulu Hakan "
                + "Cennet Mekân "
                + "Sultan II. Abdülhamid Han Hazretleri",
                "Saltanatı: 1876-1908");

        return sultanlarListesi;
    }
}
