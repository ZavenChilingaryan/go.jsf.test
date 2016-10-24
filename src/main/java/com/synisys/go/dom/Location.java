package com.synisys.go.dom;

import java.io.Serializable;

/**
 * Created by zaven.chilingaryan on 10/19/2016.
 */
public class Location implements Serializable {
    private Integer id;
    private String name;

    public Location(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Location location = (Location) o;

        return id.equals(location.id);

    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
