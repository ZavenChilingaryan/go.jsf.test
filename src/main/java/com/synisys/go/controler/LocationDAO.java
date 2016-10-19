package com.synisys.go.controler;

import com.synisys.go.dom.Location;

import java.util.ArrayList;

/**
 * Created by meruzhan.gasparyan on 10/19/2016.
 */
public class LocationDAO {

    private static ArrayList<Location> locations = new ArrayList<>();

    static {

        locations.add(new Location());
        locations.add(new Location());
        locations.add(new Location());
        locations.add(new Location());
        locations.add(new Location());
        locations.get(0).setId(1);
        locations.get(1).setId(2);
        locations.get(2).setId(3);
        locations.get(3).setId(4);
        locations.get(4).setId(5);
        locations.get(0).setName("location 1");
        locations.get(1).setName("location 2");
        locations.get(2).setName("location 3");
        locations.get(3).setName("location 4");
        locations.get(4).setName("location 5");

    }

    public ArrayList<Location> getLocations(){
        return locations;
    }

    public static void setLocations(ArrayList<Location> locations) {
        LocationDAO.locations = locations;
    }
}
