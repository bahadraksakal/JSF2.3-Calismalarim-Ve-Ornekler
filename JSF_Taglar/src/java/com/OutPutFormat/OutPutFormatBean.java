package com.OutPutFormat;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named(value = "opfb")
@RequestScoped
public class OutPutFormatBean implements Serializable{
    
    
    private String htmlInput = "<input type=\"{0}\" {1} />";

    public String getHtmlInput() {
        return htmlInput;
    }

    public void setHtmlInput(String htmlInput) {
        this.htmlInput = htmlInput;
    }
    
//-------------------------------
 
    private  String adi, soyadi;
    private  String selam = "Selamlar, {0}";
    
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
   
    public String getSelam() {
        return selam;
    }
    public void setSelam(String selam) {
        this.selam = selam;
    }

}
