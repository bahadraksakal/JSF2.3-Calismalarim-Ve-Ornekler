package com.SelectManysBean;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named(value = "ob")
@RequestScoped
public class OnayBean implements Serializable{
    private boolean seviyormu;

    public boolean isSeviyormu() {
        return seviyormu;
    }

    public void setSeviyormu(boolean seviyormu) {
        this.seviyormu = seviyormu;
    }


    public OnayBean(){
        
    }
}
