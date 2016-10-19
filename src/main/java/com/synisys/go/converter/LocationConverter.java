package com.synisys.go.converter;

import com.synisys.go.dom.Location;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import java.util.List;

/**
 * Created by zaven.chilingaryan on 10/19/2016.
 */
public class LocationConverter implements Converter {
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) throws ConverterException {
        List<Location> locations = (List<Location>) component.getAttributes().get("locations");
        for (Location location : locations ){
            if (location.getName().equals(value)){
                return location;
            }
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) throws ConverterException {
        if (value == null){
            return "";
        }
        return ((Location)value).getName();
    }
}
