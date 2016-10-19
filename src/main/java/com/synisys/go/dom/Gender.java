package com.synisys.go.dom;

/**
 * Created by zaven.chilingaryan on 10/19/2016.
 */
public enum Gender  {
    MALE("male"),
    FEMALE("female");

    private final String name;

    Gender(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
