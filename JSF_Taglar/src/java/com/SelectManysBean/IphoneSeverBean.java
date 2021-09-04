package com.SelectManysBean;

import java.io.Serializable;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named(value = "ip")
@RequestScoped
public class IphoneSeverBean implements Serializable{
    private String[] iphoneSeverler;

    public String[] getIphoneSeverler() {
        return iphoneSeverler;
    }

    public void setIphoneSeverler(String[] iphoneSeverler) {
        this.iphoneSeverler = iphoneSeverler;
    }

    public IphoneSeverBean() {
       this.iphoneSeverler = new String[6];
       
       this.iphoneSeverler[0] = "Birdal Özcan";
       this. iphoneSeverler[1] = "Mustafa Onur Aydın";
       this. iphoneSeverler[2] = "Rihan Güneş";
       this. iphoneSeverler[3] = "Serdar Türkmen";
       this. iphoneSeverler[4] = "Meltem Akdemir";
       this. iphoneSeverler[5] = "Hüseyin Kaplay";
    }
    public List<String> yazdir(){
        List<String> stringList=new LinkedList<>();
        stringList.addAll(Arrays.asList(iphoneSeverler));
        return stringList ;
    }
}
