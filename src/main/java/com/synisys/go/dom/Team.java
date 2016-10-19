package com.synisys.go.dom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by zaven.chilingaryan on 10/19/2016.
 */
public class Team {
    private List<User> users = new ArrayList<>();

   public void addTeamMember(User user){
       users.add(user);
   }
   public List<User> getTeamMember(){
       return Collections.unmodifiableList(users);
   }
}
