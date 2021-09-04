package com.ParamCore;

import java.io.Serializable;
import java.util.Map;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named(value = "pcb_1")
@RequestScoped
public class ParamCoreBean implements Serializable {
    
    private String adi, soyadi, bolumu;
    
    public String getAdi() {
        return adi;
    }
    
    public void setAdi(String adi) {
        this.adi = adi;
    }
//---------------------------------
    public String getSoyadi() {
        return soyadi;
    }
    
    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }
//---------------------------------
    public String getBolumu() {
        return bolumu;
    }
    
    public void setBolumu(String bolumu) {
        this.bolumu = bolumu;
    }
//---------------------------------
    
 public String yonelenilecekSayfaGit() { // butona tıkladığında bir bu fonksiyon actionda yazılığı olduğu için çalışmaya başlayacak

        FacesContext facesContext = FacesContext.getCurrentInstance();       
        // bu aşamada muhtemelen command button içindeki tüm  paramları facecontexe alıyoruz.
        
        this.bolumu = getBolumuParametresiniAl(facesContext); //59. satırda çektiğimiz valueyi bolumu isimli class değişkenine atıyoruz.
        /*class değişkeni 'bolumu'  ifadesi ile paramın name olan  bolumu  (dolayasıyla mape key olarak verilen 'bolumu')
        ifadesi , birbirindden bağımsızdır */
        return "ParamCore_1";
    }

    // "f:param" ile gelen değerler alınıyor.
    public String getBolumuParametresiniAl(FacesContext facesContext) {

        Map<String, String> params = facesContext.getExternalContext().getRequestParameterMap();
        // bu bölümde çektiğimiz tüm paramların  value ve name lerini bir map yardımıyla alıyoruz.
        /* yukardaki metotlar ile  <f:param name="..." value"..... " /> ifadesindeki
        'name' -- value'  ikilileri map şeklinde alınıyor.*/        

        return params.get("bolumu"); // key i 'bolumu' ifadesi olan map elemanın valuesini çekiyoruz.
    }
    
}

