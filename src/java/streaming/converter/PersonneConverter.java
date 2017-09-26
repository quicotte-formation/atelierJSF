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
import streaming.entity.Personne;

/**
 *
 * @author tom
 */
@FacesConverter(value="personneConverter")
public class PersonneConverter implements Converter{

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        Personne p = new Personne();
        p.setId( Long.parseLong(string) );
        
        return p;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        
        Personne p = (Personne) o;
        
        return String.valueOf( p.getId() );
    }
    
}
