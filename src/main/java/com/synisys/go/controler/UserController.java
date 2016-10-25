package com.synisys.go.controler;

import com.synisys.go.dao.Team;
import com.synisys.go.dom.User;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by zaven.chilingaryan on 10/18/2016.
 */
public class UserController {
    private Team teamField;

    public String addUser(User user) {
        teamField.addTeamMember(user);
        return "OK";
    }

    public void deleteUser(User user) {
        teamField.deleteTeamMember(user);
    }


    public void setTeamField(Team teamField) {
        this.teamField = teamField;
    }
}
