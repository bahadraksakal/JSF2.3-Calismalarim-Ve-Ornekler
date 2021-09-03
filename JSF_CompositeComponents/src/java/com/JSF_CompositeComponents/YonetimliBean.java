package com.JSF_CompositeComponents;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named(value = "yb")
@RequestScoped
public class YonetimliBean {

    private String kullaniciAdi, adiSoyadi, eposta, parola;

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }
//------------------------------------------- 

    public String getAdiSoyadi() {
        return adiSoyadi;
    }

    public void setAdiSoyadi(String adiSoyadi) {
        this.adiSoyadi = adiSoyadi;
    }
//------------------------------------------- 

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }
//------------------------------------------- 

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }
//------------------------------------------- 

    public String kayitOlActionMetodu() {
        return "Sonuc";
    }
}

