
package com.ajaxBeansp;

import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author bahad
 */
@Named(value = "sayacBean")
@ViewScoped //ajax ile çalışırken  viewsCope kullanmak daha faydalı
public class ajaxBean_1 implements Serializable{
    private int sayi;
   //-------------------------
    public int getSayi() {
        return sayi;
    }

    public void setSayi(int sayi) {
        this.sayi = sayi;
    }
    //-------------------------
    public void arttir() {
        sayi++;
    }

    public void azalt() {
        sayi--;
    }
}
