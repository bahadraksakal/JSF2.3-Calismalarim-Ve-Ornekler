package com.eventhandler;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;
import javax.inject.Named;

@Named(value = "PersonelValueListener")
@SessionScoped
public class PersonelValueListener implements ValueChangeListener,Serializable {

    @Override
    public void processValueChange(ValueChangeEvent event) throws AbortProcessingException{

     // personel bean'e doğrudan erişim
     //o anki contecx içinde bulunan nesnenin kendisi alır  key+value(node)
     PersonelBean personel = (PersonelBean) FacesContext.getCurrentInstance().
             getExternalContext().getSessionMap().get("personel");
     // get("personel");  dememizin sebebi  personelbeani tanıttığımız ismi yazmalıyız. 
     // facescontext o an hangi nesne varsa onu çekip
     //valuesini hakkindaya set ediyoruz. 
  
        personel.setHakkinda_2(event.getNewValue().toString());

    }
}




