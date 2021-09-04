package com.resources;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import javax.faces.event.ValueChangeEvent;
import javax.inject.Named;

@Named(value = "dilBean")
@javax.enterprise.context.SessionScoped
public class DillerBean implements Serializable {

    private String yerelKod;
    private String yeniYerelKodDegeri;

    public String getYeniYerelKodDegeri() {
        return yeniYerelKodDegeri;
    }

    public void setYeniYerelKodDegeri(String yeniYerelKodDegeri) {
        this.yeniYerelKodDegeri = yeniYerelKodDegeri;
    }

    public DillerBean(String yeniYerelKodDegeri) {
        this.yeniYerelKodDegeri = yeniYerelKodDegeri;
    }
    private static final Map<String, Object> ulkeler;

    static { // tum class tan önce derlenirler
        ulkeler = new LinkedHashMap<>();
        ulkeler.put("English", Locale.ENGLISH); //label, value // default eng
        ulkeler.put("Deutsch", Locale.GERMANY); //label, value
        ulkeler.put("中國的", Locale.SIMPLIFIED_CHINESE);        
    }

    public DillerBean() {
        this.yeniYerelKodDegeri ="en";
    }

    public Map<String, Object> getUlkerinHaritasi() {
        return ulkeler;
    }

    public String getYerelKod() {
        return yerelKod;
    }

    public void setYerelKod(String yerelKod) {
        this.yerelKod = yerelKod;
    }

    //değer değişimi olay dinleyicisi
    public String ulkeninYerelKoduDegisti(ValueChangeEvent e) {

        yeniYerelKodDegeri = e.getNewValue().toString();

        return yeniYerelKodDegeri;
    }
}
