package com.synisys.go.controler;

import com.synisys.go.dom.Gender;
import com.synisys.go.dom.Location;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zaven.chilingaryan on 10/19/2016.
 */
public class ItemsHolder {
    private List<Location> locations;
    private List<Gender> genders;

    public ItemsHolder() {
        //init();
    }

    public List<Location> getLocations() {
        return locations;
    }

    public List<Gender> getGenders() {
        return genders;
    }

    @PostConstruct
    private void init() {
        initLocations();
        initGenders();
    }

    private void initLocations() {
        locations = new ArrayList<Location>() {{
            add(new Location(1, "Gyumri"));
            add(new Location(2, "Erevan"));
            add(new Location(3, "Vanadzor"));
        }};

    }

    private void initGenders() {
        genders = Arrays.asList(Gender.values());

    }
}
