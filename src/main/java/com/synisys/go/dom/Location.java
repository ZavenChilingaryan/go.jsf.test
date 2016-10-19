package com.synisys.go.dom;

/**
 * Created by meruzhan.gasparyan on 10/19/2016.
 */
public class Location {

    private int id;
    private String name;

    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
