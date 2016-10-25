package com.synisys.go.dom;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by zaven.chilingaryan on 10/18/2016.
 */
public class User {
    private String name;
    private String lastName;
    private Integer age;
    private String phone;
    private String login;
    private String password;
    private Date birthDate = new Date();
    private boolean married;
    private String genders;
    private Location location;
    private  String description;
    private  ArrayList<String> images = new ArrayList<>();

    public ArrayList<String> getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images.add(images) ;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public Location getLocation() {
        return location;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getBirthDate() {

        return birthDate;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isMarried() {
        return married;
    }

    public String getGenders() {
        return genders;
    }

    public void setGenders(String genders) {
        this.genders = genders;
    }

    public void setMarried(boolean marrid) {
        this.married = marrid;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", birthDate=" + birthDate +
                ", married=" + married +
                ", genders='" + genders + '\'' +
                ", location=" + location +
                ", description='" + description + '\'' +
                '}';
    }
}
