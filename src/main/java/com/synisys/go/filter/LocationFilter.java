package com.synisys.go.filter;

import com.synisys.go.dom.Location;
import com.synisys.go.dom.User;

import java.util.function.Predicate;

/**
 * Created by zaven.chilingaryan on 10/20/2016.
 */
public class LocationFilter implements TeamMemberFilter<Location> {

    private Location locationFilter;

    @Override
    public Location getFilterValue() {
        return locationFilter;
    }

    @Override
    public void setFilterValue(Location filterValue) {
        this.locationFilter = filterValue;
    }

    public boolean isFilterSet() {
        return locationFilter != null;
    }

    public Predicate<User> getPredicate() {
        return user -> user.getLocation().equals(locationFilter);
    }

}
