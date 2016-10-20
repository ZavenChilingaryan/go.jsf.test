package com.synisys.go.controler;

import com.synisys.go.dom.Location;
import com.synisys.go.dom.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by zaven.chilingaryan on 10/18/2016.
 */
public class UserController {

    private ArrayList<User> users = new ArrayList<>();

    public String saveUser(User user) {
        users.add(user);
        return "ok";
    }

    public void deleteUser(User user){
        this.users.remove(user);
    }

    public List<User> getUsers() {
        return Collections.unmodifiableList(users);
    }


}
