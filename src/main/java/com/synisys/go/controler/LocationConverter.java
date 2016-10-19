package com.synisys.go.controler;

import com.synisys.go.dom.Location;

import javax.faces.bean.ApplicationScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
import java.util.ArrayList;

/**
 * Created by meruzhan.gasparyan on 10/19/2016.
 */
@ApplicationScoped
@FacesConverter(value = "convertLocation")
public class LocationConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) throws ConverterException {
       ArrayList<Location> locations = (ArrayList<Location>) uiComponent.getAttributes().get("locations");

        for ( Location loc: locations) {
            if(loc.getName().equals(s)){
                return loc;
            }
        }

        return null;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object o) throws ConverterException {

        if (o == null) {
            return "";
        }
            Location loc = (Location) o;
            return loc.getName();

    }
}
