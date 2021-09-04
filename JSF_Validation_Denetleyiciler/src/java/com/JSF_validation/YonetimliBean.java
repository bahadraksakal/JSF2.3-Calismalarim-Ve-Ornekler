/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.JSF_validation;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named(value = "yb")
@RequestScoped
public class YonetimliBean implements Serializable{

    private String adi;
    private String soyadi;
    private String eposta;
    private String eposta_2;

    public String getEposta_2() {
        return eposta_2;
    }

    public void setEposta_2(String eposta_2) {
        this.eposta_2 = eposta_2;
    }
    private int tamsayi; 
    private double virgullusayi;
    private String Cumle;

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
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

    public String getCumle() {
        return Cumle;
    }

    public void setCumle(String Cumle) {
        this.Cumle = Cumle;
    }
    public YonetimliBean() {
    
    }
    public int getTamsayi() {
        return tamsayi;
    }

    public void setTamsayi(int tamsayi) {
        this.tamsayi = tamsayi;
    }
    
    public double getVirgullusayi() {
        return virgullusayi;
    }

    public void setVirgullusayi(double virgullusayi) {
        this.virgullusayi = virgullusayi;
    }
    
    
    
    
}
