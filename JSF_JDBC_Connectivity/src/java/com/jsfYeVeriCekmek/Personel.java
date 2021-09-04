package com.jsfYeVeriCekmek;

import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named(value = "personel")
@RequestScoped
public class Personel {
    private String ad,soyad,mail;
    private int id,maas;
    private static List<Personel> personeller_list;

    public List<Personel> getPersoneller_list() {
        this.personeller_list=Personel_with_JDBC.getPersoneller_list();
        return personeller_list;
    }

    public void setPersoneller_list(List<Personel> personeller_list) {
        this.personeller_list=personeller_list;
    }
    public Personel() {
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }
    
}
