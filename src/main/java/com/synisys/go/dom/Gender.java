package com.synisys.go.dom;

/**
 * Created by zaven.chilingaryan on 10/19/2016.
 */
public enum Gender {
    MALE("male"),
    FEMALE("female");

    private final String nameValue;

    Gender(String nameValue) {
        this.nameValue = nameValue;
    }

    public String getNameValue() {
        return nameValue;
    }
}
