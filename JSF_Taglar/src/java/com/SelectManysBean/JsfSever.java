package com.SelectManysBean;

import java.io.Serializable;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named(value = "jS")
@RequestScoped
public class JsfSever implements Serializable{
    private String[] jsfSeverIsim;

    public String[] getJsfSeverIsim() {
        return jsfSeverIsim;
    }

    public void setJsfSeverIsim(String[] jsfSeverIsim) {
        this.jsfSeverIsim = jsfSeverIsim;
    }

    public JsfSever(){
        jsfSeverIsim=new String[6];
        jsfSeverIsim[0]="Bahadır";
        jsfSeverIsim[1]="Rana";
        jsfSeverIsim[2]="Hüda";
        jsfSeverIsim[3]="Çağla";
        jsfSeverIsim[4]="Furkan";
        jsfSeverIsim[5]="Elif";
    }
   
    
    public List<String> yazdir(){
        List<String> stringList=new LinkedList<>();
        stringList.addAll(Arrays.asList(jsfSeverIsim));
        return stringList ;
    }
    
    
}
