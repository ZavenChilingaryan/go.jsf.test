package com.synisys.go.controler;

import com.synisys.go.dom.Location;

import javax.annotation.PostConstruct;
import java.util.ArrayList;

/**
 * Created by meruzhan.gasparyan on 10/19/2016.
 */
public class LocationDAO {

    private final ArrayList<Location> locations;

    public LocationDAO() {
        locations = new ArrayList<>();
    }

    @PostConstruct
    public void init() {
        for (int i = 1; i < 6; i++) {
            locations.add(new Location(i, "Location Name" + i));
        }
    }

    public ArrayList<Location> getLocations() {
        return locations;
    }

}
