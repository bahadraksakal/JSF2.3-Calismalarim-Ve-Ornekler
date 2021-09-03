package com.eventhandler;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;
import javax.inject.Named;

@Named(value = "YonetimliBeanActionListener")
@SessionScoped
public class YonetimliBeanActionListener implements ActionListener,Serializable{

    private String adiSoyadi;
    private static String mesaj="none";

    public String getMesaj() {
        return mesaj;
    }

    public void setMesaj(String mesaj) {
        this.mesaj = mesaj;
    }
    public YonetimliBeanActionListener() {
    }
    //-------------------------------------     
   
    //-------------------------------------  

    public String getAdiSoyadi() {
        return adiSoyadi;
    }

    public void setAdiSoyadi(String adiSoyadi) {
        this.adiSoyadi = adiSoyadi;
    }

    @Override
    public void processAction(ActionEvent event) throws AbortProcessingException {
       System.out.println("Gönder2 düğmesine tıklandı.");
       setMesaj("action algılandı");
    }
}
