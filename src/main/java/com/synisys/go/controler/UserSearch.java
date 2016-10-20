package com.synisys.go.controler;

import com.synisys.go.dom.Location;
import com.synisys.go.dom.User;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by meruzhan.gasparyan on 20-Oct-16.
 */


public class UserSearch {

    private List<User> filteredUsers;
    private String userName;
    private Location location;
    private UserController userController;

    @PostConstruct
    private void init(){
        filteredUsers = userController.getUsers();
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void filterUsers() {
        if (searchUserNameFiledIsNotSet() && searchLocationFieldIsNotSet()) {
            filteredUsers = userController.getUsers();
        } else if (!searchUserNameFiledIsNotSet() && !searchLocationFieldIsNotSet()){
            filteredUsers = userController.getUsers().stream().filter(user -> (user.getName().contains(userName))&&(user.getLocation().equals(location))).collect(Collectors.toList());
        }else if (!searchUserNameFiledIsNotSet() && searchLocationFieldIsNotSet()){
            filteredUsers = userController.getUsers().stream().filter(user -> (user.getName().contains(userName))).collect(Collectors.toList());
        }else if (searchUserNameFiledIsNotSet() && !searchLocationFieldIsNotSet()){
            filteredUsers = userController.getUsers().stream().filter(user -> (user.getLocation().equals(location))).collect(Collectors.toList());
        }
    }

    private boolean searchLocationFieldIsNotSet() {
        return location == null;
    }

    private boolean searchUserNameFiledIsNotSet() {
        return userName == null || userName.isEmpty();
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }


    public void setUserController(UserController userController) {
        this.userController = userController;
    }

    public List<User> getFilteredUsers() {
        return filteredUsers;
    }
}
