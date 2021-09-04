package com.managedBean;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named(value = "yb")
@SessionScoped
public class YonetimliBean implements Serializable{
    String verilecekMesaj;

    public YonetimliBean() {
        this.verilecekMesaj="Günde 15 saat JSF ...";
    }

    public String getVerilecekMesaj() {
        return verilecekMesaj;
    }

    public void setVerilecekMesaj(String verilecekMesaj) {
        this.verilecekMesaj = verilecekMesaj;
    }
}
