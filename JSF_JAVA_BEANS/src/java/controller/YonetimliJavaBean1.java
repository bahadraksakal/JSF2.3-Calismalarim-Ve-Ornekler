package controller;

import java.io.Serializable;
import javax.faces.event.ActionEvent;

// oto import yapmadık şuan faces-config.xml  üzerinden beanlerimi jsf ile bağlıyorum.
public class YonetimliJavaBean1 implements Serializable{
    
    String sonuc;

    public String getSonuc() {
        return sonuc;
    }

    public void setSonuc(String sonuc) {
        this.sonuc = sonuc;
    }
    public String onayVerAction(){
        System.out.println("--Debug: Onay ver metodu çalıştırıldı--");        
        return sonuc; // sonuc şuan null ?
    }
    
    public void onayVerActionListener(ActionEvent event){
        System.out.println("action listener metodu çalıştırıldı");
        String gelenParameteAdi = (String)event.getComponent().getAttributes().get("textfield_ad2");
        // jsf çekirdeğine erişip attiributenin name inden get  eder  attribude name == id gibi
        String gelenParameteSoyAdi = (String)event.getComponent().getAttributes().get("textfield_soyad2");
        this.sonuc="ADI: "+gelenParameteAdi+"   SOYADI: "+gelenParameteSoyAdi;
        System.out.println("--Debug: ---"+sonuc);
    }
    
}
