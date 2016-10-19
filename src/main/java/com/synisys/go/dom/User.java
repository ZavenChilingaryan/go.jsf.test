package com.synisys.go.dom;

/**
 * Created by zaven.chilingaryan on 10/19/2016.
 */
public class User {
    private String firstName;
    private String lastName;
    private Integer age;
    private Gender gender;
    private boolean married;
    private Location location;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }


    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Gender getGender() {
        return this.gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public boolean isMarried() {
        return this.married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }
}
