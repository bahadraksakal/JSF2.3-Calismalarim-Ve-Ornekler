package com.siteAdi;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named(value = "yb")
@RequestScoped        
public class YönetimliBean implements Serializable{
    
    private String adiSoyadi;
    private String buttonYazisi = "UI_Remove_1'e Gönder";
    
     public String yonelenilecekSayfaGit(){
     
		return "UI_Composition_define_insert_include_1";
                
    }   

    public String getAdiSoyadi() {
        return adiSoyadi;
    }

    public void setAdiSoyadi(String adiSoyadi) {
        this.adiSoyadi = adiSoyadi;
    }

    public String getButtonYazisi() {
        return buttonYazisi;
    }

    public void setButtonYazisi(String buttonYazisi) {
        this.buttonYazisi = buttonYazisi;
    }

    public String yonelenilecekSayfaGit_uiRemove() {
        return "UI_Remove_1";
    }
}
