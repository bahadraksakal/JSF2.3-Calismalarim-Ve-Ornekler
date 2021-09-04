package com.OutPutText;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named(value = "optb_1")
@RequestScoped
public class OutPutTextBean implements Serializable{

    private String adi;
    private String soyadi;

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
    
//---------------------------  
     
    private String mesaj = "Güzel gören güzel düşünür.\n Güzel düşünen hayatından lezzet alır.<br/> B.S.N.";

        public String getMesaj() {
        return mesaj;
    }

    public void setMesaj(String mesaj) {
        this.mesaj = mesaj;
    }

//---------------------------
    
    private String htmlInputYaziKutusu = "<input type='text' size='40' />";   
    private String htmlInputRadioKutusu =
                    "<h:selectOneRadio value=\"---JSF Kullanamıyoruz---\">"
                    +"<f:selectItem itemValue=\"Java Platform, Standard Edition\" itemLabel=\"Java SE\"/>"
                    +"<f:selectItem itemValue=\"JavaServer Pages\" itemLabel=\"JSP\" />"
                    +"<f:selectItem itemValue=\"JavaServer Faces\" itemLabel=\"JSF\" />"
                    +"<f:selectItem itemValue=\"Apple\" itemLabel=\"iPhone ve iPad Programlama\" />"
                    +"<f:selectItem itemValue=\"Android\" itemLabel=\"Android Uygulama Geliştirme\" />"
                    +"</h:selectOneRadio>";
    private String htmlInputCheckboxKutusu =
            "<input type='checkbox' name='egitimseti' value='JavaSE' /> "
            + "JAVA SE EĞİTİM SETİ <br />"
            + "<input type='checkbox' name='egitimseti' value='JSF' /> "
            + "JSP-JSF EĞİTİM SETİ";

//--------------------------
    public String getHtmlInputCheckboxKutusu() {
        return htmlInputCheckboxKutusu;
    }
    public void setHtmlInputCheckboxKutusu(String htmlInputCheckboxKutusu) {
        this.htmlInputCheckboxKutusu = htmlInputCheckboxKutusu;
    }
//--------------------------
    public String getHtmlInputRadioKutusu() {
        return htmlInputRadioKutusu;
    }
    public void setHtmlInputRadioKutusu(String htmlInputRadioKutusu) {
        this.htmlInputRadioKutusu = htmlInputRadioKutusu;
    }
//--------------------------
    public String getHtmlInputYaziKutusu() {
        return htmlInputYaziKutusu;
    }
    public void setHtmlInputYaziKutusu(String htmlInputYaziKutusu) {
        this.htmlInputYaziKutusu = htmlInputYaziKutusu;
    }   
}
