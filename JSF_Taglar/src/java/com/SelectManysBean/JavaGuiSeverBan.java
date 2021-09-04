package com.SelectManysBean;

import java.io.Serializable;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named(value = "jgs")
@RequestScoped
public class JavaGuiSeverBan implements Serializable{
    private String[] javaGuiSeverler;    
    private final static Map<String,Object> javaGuiSeverlerAdSoyad;
    
    static {
        javaGuiSeverlerAdSoyad = new LinkedHashMap<>();
        javaGuiSeverlerAdSoyad.put("Emre Kaçan", "1"); //label, value
        javaGuiSeverlerAdSoyad.put("Ahmet Müngen", "2"); //etiket , değer
        javaGuiSeverlerAdSoyad.put("Mustafa Özserdar", "3");
        javaGuiSeverlerAdSoyad.put("Hüseyin Varol", "4");
        javaGuiSeverlerAdSoyad.put("Veysel Toprak", "5");
        javaGuiSeverlerAdSoyad.put("Meherrem Memmedov", "6");
        
    }
    public Map<String, Object> getJavaGuiSeverlerAdSoyad() {
        return javaGuiSeverlerAdSoyad;
    }

    public String[] getJavaGuiSeverler() {
        return javaGuiSeverler;
    }

    public void setJavaGuiSeverler(String[] javaGuiSeverler) {
        this.javaGuiSeverler = javaGuiSeverler;
    }
    public List<String> yazdir(){
        List<String> stringList=new LinkedList<>();
        stringList.addAll(Arrays.asList(javaGuiSeverler));
        return stringList ;
    }
    
}
