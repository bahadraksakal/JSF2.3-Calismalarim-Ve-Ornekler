package com.eventhandler;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.event.ValueChangeEvent;
import javax.inject.Named;
 
@Named(value = "personel")
@SessionScoped
public class PersonelBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private static Map<String, String> kisiler;
    private static Map<String, String> kisiler_2;
    private String hakkinda = "Fırat Üniversitesi"; //varsayılan değer
    private String hakkinda_2 = "Fırat Üniversitesi"; //varsayılan değer

    public String getHakkinda_2() {
        return hakkinda_2;
    }

    public void setHakkinda_2(String hakkinda_2) {
        this.hakkinda_2 = hakkinda_2;
    }

    static {
        kisiler = new LinkedHashMap<String, String>();
                                  //label, value
        kisiler.put("Burak Cagatay Alkan", "Fırat Üniversitesi");
        kisiler.put("Furkan Uzun", "Ondokuz Mayıs Üniversitesi");
        kisiler.put("Veysel Hyung Ece", "Bilgisayar Mühensisi - Oracle DBA");
        kisiler.put("Metin Dinibütünoğlu", "Hyundai Assan Otomotiv'de Stajyer");
        kisiler.put("Tanju Bozok", "Azerbaijan Technical University");
        kisiler.put("Burakhan Sinal", "Gstcranes");
        kisiler.put("Ferid Mövsümov", "Ankara Üniversitesi");
        kisiler.put("Fatih Aktürk", "Medieval II : Total War'da Stajyer");
        
        kisiler_2 = new LinkedHashMap<String, String>();
                                  //label, value
        kisiler_2.put("Burak Cagatay Alkan_2", "Fırat Üniversitesi_2");
        kisiler_2.put("Furkan Uzun_2", "Ondokuz Mayıs Üniversitesi_2");
        kisiler_2.put("Veysel Hyung Ece_2", "Bilgisayar Mühensisi - Oracle DBA_2");
        kisiler_2.put("Metin Dinibütünoğlu_2", "Hyundai Assan Otomotiv'de Stajyer_2");
        kisiler_2.put("Tanju Bozok_2", "Azerbaijan Technical University_2");
        kisiler_2.put("Burakhan Sinal_2", "Gstcranes_2");
        kisiler_2.put("Ferid Mövsümov_2", "Ankara Üniversitesi_2");
        kisiler_2.put("Fatih Aktürk_2", "Medieval II : Total War'da Stajyer_2");
    }

    public void personelHakkindaChanged(ValueChangeEvent e) {
        //personel bilgisine yeni bir değer atanıyor
        hakkinda = e.getNewValue().toString();
        // o anki contexteki nesnenin valuesi hakkindaya atanır.
    }
//    public void personelHakkindaChanged_2(ValueChangeEvent e) {
//        //personel bilgisine yeni bir değer atanıyor
//        hakkinda_2 = e.getNewValue().toString();
//        // o anki contexteki nesnenin valuesi hakkindaya atanır.
//    }

    public Map<String, String> getPersonelInMap() {
        return PersonelBean.kisiler;
    }
    public Map<String, String> getPersonelInMap_2() {
        return PersonelBean.kisiler_2;
    }

    public String getHakkinda() {
        return hakkinda;
    }

    public void setHakkinda(String hakkinda) {
        this.hakkinda = hakkinda;
    }
}
