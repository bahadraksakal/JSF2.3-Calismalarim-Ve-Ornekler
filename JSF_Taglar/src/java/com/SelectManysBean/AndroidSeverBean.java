
package com.SelectManysBean;

import java.io.Serializable;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named(value = "asb")
@RequestScoped
public class AndroidSeverBean implements Serializable{
    private String[] androidsevenler;

    public String[] getAndroidsevenler() {
        return androidsevenler;
    }

    public void setAndroidsevenler(String[] androidsevenler) {
        this.androidsevenler = androidsevenler;
    }

    public AndroidSeverBean() {
    }
    public List<String> yazdir(){
        List<String> stringList=new LinkedList<>();
        stringList.addAll(Arrays.asList(androidsevenler));
        return stringList ;
    }
}
