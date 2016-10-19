package com.synisys.go.controler;

import com.synisys.go.dom.User;

/**
 * Created by zaven.chilingaryan on 10/18/2016.
 */
public class UserControler {
    public String saveUser(User user){
        System.out.println(user);
        return user.getAge() > 25 ? "Hello" : "asdasd";
    }

    public String saveUser(){

        return "Hello";
    }
}
