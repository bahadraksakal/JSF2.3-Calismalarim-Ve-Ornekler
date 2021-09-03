/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ajaxBeansp;

import java.io.Serializable;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.model.SelectItem;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author bahad
 */
@Named(value = "marketBean")
@ViewScoped
public class ajaxBean_2 implements Serializable{
    
    private SelectItem[] urunler;
    private String firma_adi="firma_adi";
    private String urun_no;

    public ajaxBean_2() {
        this.urunler = firma1_in_urunleri;
    }
    
    private SelectItem[] firmalar=new SelectItem[]{
        new SelectItem("firma1", "Firma Adı 1"),
        new SelectItem("firma2", "Firma Adı 2"),
        new SelectItem("firma3", "Firma Adı 3")
    };
    
    private SelectItem[] firma1_in_urunleri=new SelectItem[]{
        new SelectItem("urun1","ÜRÜN  Adı 001"),
        new SelectItem("urun2","ÜRÜN  Adı 002")  
    };
    
    private SelectItem[] firma2_nin_urunleri=new SelectItem[]{
        new SelectItem("urun3","ÜRÜN ADI 003"),
        new SelectItem("urun4","ÜRÜN ADI 004"), 
    };
    
    private SelectItem[] firma3_un_urunleri=new SelectItem[]{
        new SelectItem("urun7","ÜRÜN ADI 007"),
        new SelectItem("urun8","ÜRÜN ADI 008")
    };
    
    public void setUrunler(AjaxBehaviorEvent evt) {
       if(firma_adi.equalsIgnoreCase("firma1")) {
            this.urunler =firma1_in_urunleri;
        }
       else if(firma_adi.equalsIgnoreCase("firma2")) {
            this.urunler =firma2_nin_urunleri;
        }
       else if(firma_adi.equalsIgnoreCase("firma3")) {
            this.urunler =firma3_un_urunleri;
        }
    }    
    // getter_setterler
    public SelectItem[] getFirmalar() {
        return firmalar;
    }

    public void setFirmalar(SelectItem[] firmalar) {
        this.firmalar = firmalar;
    }

    public SelectItem[] getFirma1_in_urunleri() {
        return firma1_in_urunleri;
    }

    public void setFirma1_in_urunleri(SelectItem[] firma1_in_urunleri) {
        this.firma1_in_urunleri = firma1_in_urunleri;
    }

    public SelectItem[] getFirma2_nin_urunleri() {
        return firma2_nin_urunleri;
    }

    public void setFirma2_nin_urunleri(SelectItem[] firma2_nin_urunleri) {
        this.firma2_nin_urunleri = firma2_nin_urunleri;
    }

    public SelectItem[] getFirma3_un_urunleri() {
        return firma3_un_urunleri;
    }

    public void setFirma3_un_urunleri(SelectItem[] firma3_un_urunleri) {
        this.firma3_un_urunleri = firma3_un_urunleri;
    }

    public String getFirma_adi() {
        return firma_adi;
    }
    public void setFirma_adi(String firma_adi) {
        this.firma_adi = firma_adi;
    }

    public String getUrun_no() {
        return urun_no;
    }
    public void setUrun_no(String urun_no) {
        this.urun_no = urun_no;
    }
    public SelectItem[] getUrunler() {
        return urunler;
    }
}
