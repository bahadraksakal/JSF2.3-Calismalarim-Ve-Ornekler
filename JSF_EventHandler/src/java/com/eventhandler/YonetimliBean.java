package com.eventhandler;


import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named(value = "yb")
@RequestScoped
public class YonetimliBean implements Serializable{

    public YonetimliBean() {
    }
    //-------------------------------------     
    private String adiSoyadi;
    //-------------------------------------  

    public String getAdiSoyadi() {
        return adiSoyadi;
    }

    public void setAdiSoyadi(String adiSoyadi) {
        this.adiSoyadi = adiSoyadi;
    }
    
}



