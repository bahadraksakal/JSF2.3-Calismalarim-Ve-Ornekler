package com.PanelGrid;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named(value = "pgb_1")
@RequestScoped
public class PanelGridBean implements Serializable{
    private String adi;
    private String soyadi;
    private int numarasi;

    public int getNumarasi() {
        return numarasi;
    }

    public void setNumarasi(int numarasi) {
        this.numarasi = numarasi;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public PanelGridBean() {
    }
}
