package com.synisys.go.controler;

import com.synisys.go.dom.Location;

import javax.faces.bean.ApplicationScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by meruzhan.gasparyan on 10/19/2016.
 */
@ApplicationScoped
@FacesConverter(value = "convertLocation")
public class LocationConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) throws ConverterException {
        ArrayList<Location> locations = (ArrayList<Location>) uiComponent.getAttributes().get("locations");
        return findLocationByName(s, locations);
    }


    /**
     * returns location matching the location name parameter or null in case if there is no match
     * @param locationName
     * @param allLocations
     * @return
     */
    private Location findLocationByName(String locationName, List<Location> allLocations){
        Location location = null;
        for (Location currentLocation : allLocations) {
            if(currentLocation.getName().equals(locationName)){
                location = currentLocation;
                break;
            }
        }
        return location;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object o) throws ConverterException {
        if (o == null) {
            return "";
        }
        return ((Location) o).getName();
    }
}
