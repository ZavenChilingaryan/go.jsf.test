package com.synisys.go.controler;

import com.synisys.go.dom.Location;

/**
 * Created by meruzhan.gasparyan on 20-Oct-16.
 */
public class SearchController {
    private Location searchLocation;
    private String searchName;

    public Location getSearchLocation() {
        return searchLocation;
    }

    public void setSearchLocation(Location searchLocation) {
        this.searchLocation = searchLocation;
    }

    public String getSearchName() {
        return searchName;
    }

    public void setSearchName(String searchName) {
        this.searchName = searchName;
    }
}
