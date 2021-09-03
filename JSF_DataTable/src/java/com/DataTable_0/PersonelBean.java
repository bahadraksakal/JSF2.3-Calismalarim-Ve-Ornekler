package com.DataTable_0;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named(value = "personel")
@RequestScoped
public class PersonelBean implements Serializable{

    private String numarasi;
    private String adiSoyadi;
    private BigDecimal maasi;
    private int yasi;  
    private boolean duzenle;
    private static boolean artanSiralama;
    private static List<PersonelBean> Personeller=new LinkedList<>();
    
    public void siralaPersonelAdiSoyadi() {

	   if(!(artanSiralama)){
		//adan zeye azdan çoğa siralama
		Collections.sort(Personeller, new Comparator<PersonelBean>() {
		    @Override
		    public int compare(PersonelBean  o1, PersonelBean  o2) {
			return o1.getAdiSoyadi().compareTo(o2.getAdiSoyadi());
		    }
		});
		artanSiralama = true;
	   }else{
		//zeden aya, çoktan aza siralama
		Collections.sort(Personeller, new Comparator<PersonelBean>() {
                    @Override
                    public int compare(PersonelBean  o1, PersonelBean  o2) {

                    return o2.getAdiSoyadi().compareTo(o1.getAdiSoyadi());
                    }
		});
		artanSiralama = false;
	   }	  
	}
    
//-------------------------------------------   
   //adan zeye, azdan çoğa siralama
    public void siralaPersonelMaasi() {

        if(!(artanSiralama)){
             //adan zeye, azdan çoğa siralama
             Collections.sort(Personeller, new Comparator<PersonelBean>() {
                     @Override
                     public int compare(PersonelBean  o1, PersonelBean  o2) {
                             return o1.getMaasi().compareTo(o2.getMaasi());
                     }
             });
             artanSiralama = true;
        }else{
             //zeden aya, çoktan aza siralama
             Collections.sort(Personeller, new Comparator<PersonelBean>() {
                     @Override
                     public int compare(PersonelBean  o1, PersonelBean  o2) {

                             return o2.getMaasi().compareTo(o1.getMaasi());
                     }
             });
             artanSiralama = false;
        }
	   
    }
    public boolean isArtanSiralama() {
        return artanSiralama;
    }

    public void setArtanSiralama(boolean artanSiralama) {
        this.artanSiralama = artanSiralama;
    }

    public void personelduzenle(){
        this.duzenle=true;
    }
    public void personelkaydet(){
        this.duzenle=false;
    }
    public boolean isDuzenle() {
        return duzenle;
    }

    public void setDuzenle(boolean duzenle) {
        this.duzenle = duzenle;
    }

    
    static {
        new PersonelBean("10000","Bahadır",new BigDecimal("2500"),20);    
        new PersonelBean("9000","levent",new BigDecimal("3500"),30); 
        new PersonelBean("8000","rana",new BigDecimal("4500"),40); 
        new PersonelBean("7000","hüda",new BigDecimal("5500"),50); 
        new PersonelBean("6000","furkan",new BigDecimal("6500"),60); 
    }

    public List<PersonelBean> getPersoneller() {
        return Personeller;
    }

    public void setPersoneller(List<PersonelBean> Personeller) {
        PersonelBean.Personeller = Personeller;
    }
    public void addPersoneller() {  
        //Personeller.add(new PersonelBean(numarasi,adiSoyadi,maasi,yasi));
        // iki kere nesne oluşuyor biri boş  performan 2x daha kötü
        Personeller.add(this);  //eğer elemanları sonra değiştiriceksek bu patlar neden mi ? bilmiyorum :)
        //add this demek performans için daha iyi bunu  reet butonu otoya getirerek yapabiliriz.
//        adiSoyadi="";
//        numarasi="";
//        yasi=0;
//        maasi=null;
    }
    public void deletePersoneller() {
        Personeller.remove(this);
    }
//---------------------------
    public PersonelBean() {       

    }
    public PersonelBean(String numarasi, String adiSoyadi, BigDecimal maasi, int yasi) {
        this.numarasi = numarasi;
        this.adiSoyadi = adiSoyadi;
        this.maasi = maasi;
        this.yasi = yasi; 
        Personeller.add(this);
        
    }
//---------------------------
    public String getAdiSoyadi() {
        return adiSoyadi;
    }
    public void setAdiSoyadi(String adiSoyadi) {
        this.adiSoyadi = adiSoyadi;
    } 
//---------------------------

    public BigDecimal getMaasi() {
        return maasi;
    }

    public void setMaasi(BigDecimal maasi) {
        this.maasi = maasi;
    }

//---------------------------
    public String getNumarasi() {
        return numarasi;
    }
    public void setNumarasi(String numarasi) {
        this.numarasi = numarasi;
    }
//---------------------------
    public int getYasi() {
        return yasi;
    }
    public void setYasi(int yasi) {
        this.yasi = yasi;
    }
//---------------------------
}
