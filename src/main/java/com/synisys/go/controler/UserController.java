package com.synisys.go.controler;

import com.synisys.go.dom.Team;
import com.synisys.go.dom.User;

/**
 * Created by zaven.chilingaryan on 10/18/2016.
 */
public class UserController {
    private Team teamField;

    public String addUser(User user) {
        teamField.addTeamMember(user);
        return "OK";
    }

    public void setTeamField(Team teamField) {
        this.teamField = teamField;
    }
}
