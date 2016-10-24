package com.synisys.go.dao;

import com.synisys.go.dom.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by zaven.chilingaryan on 10/19/2016.
 */
public class Team {
    private List<User> users = new ArrayList<>();

    public boolean deleteTeamMember(User user) {
        return users.remove(user);
    }

    public void addTeamMember(User user) {
        users.add(user);
    }

    public List<User> getTeamMembers() {
        return Collections.unmodifiableList(users);
    }
}
