package com.synisys.go.converter;

import com.synisys.go.dom.Gender;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import java.util.List;

/**
 * Created by zaven.chilingaryan on 10/19/2016.
 */
public class GenderConverter implements Converter {
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) throws ConverterException {
        List<Gender> genders = (List<Gender>) component.getAttributes().get("genders");
        for (Gender gender : genders) {
            if (gender.getNameValue().equals(value)) {
                return gender;
            }
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) throws ConverterException {
        if (value == null) {
            return "";
        }
        return ((Gender) value).toString();
    }
}
