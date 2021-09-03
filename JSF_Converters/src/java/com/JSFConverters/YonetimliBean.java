package com.JSFConverters;

import java.io.Serializable;
import java.util.Date;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named(value = "yb")
@RequestScoped
public class YonetimliBean implements Serializable{
    private float urunfiyati;
    private Date dogumtarihi;
    private String siteAdresi;

    public String getSiteAdresi() {
        return siteAdresi;
    }

    public void setSiteAdresi(String siteAdresi) {
        this.siteAdresi = siteAdresi;
    }
    public Date getDogumtarihi() {
        return dogumtarihi;
    }

    public void setDogumtarihi(Date dogumtarihi) {
        this.dogumtarihi = dogumtarihi;
    }
//---------------------------------
    public YonetimliBean() {
    }
//---------------------------------     
  //double 
  
//---------------------------------  
    public float getUrunfiyati() {
        return urunfiyati;
    }

    public void setUrunfiyati(float urunfiyati) {
        this.urunfiyati = urunfiyati;
    }
    
}
