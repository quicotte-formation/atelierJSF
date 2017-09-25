/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import streaming.entity.Pays;

/**
 *
 * @author tom
 */
@FacesConverter(value = "paysConverter")
public class PaysConverter implements Converter{

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        
        Pays p = new Pays();
        
        p.setId( Long.valueOf(string) );
        
        return p;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        Pays p = (Pays) o;
        
        return p.getId().toString();
    }
    
}
