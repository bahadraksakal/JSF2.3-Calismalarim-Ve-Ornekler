/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ajaxBeansp;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author bahad
 */
@Named(value = "ab_0")
@RequestScoped
public class ajaxBean_0 implements Serializable{
    private String ad;
    private String soyad;

    public ajaxBean_0() {
        this.ad="null";
        this.soyad="null";
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
    
    
    
}
