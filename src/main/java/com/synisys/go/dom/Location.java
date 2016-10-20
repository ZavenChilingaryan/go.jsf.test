package com.synisys.go.dom;

/**
 * Created by meruzhan.gasparyan on 10/19/2016.
 */
public class Location {

    private final Integer id;
    private final String name;

    public Location(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Location location = (Location) o;

        if (id != location.id) return false;
        return name.equals(location.name);

    }


    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
