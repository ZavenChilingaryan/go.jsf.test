package com.synisys.go.controler;

import com.synisys.go.dao.Team;
import com.synisys.go.dom.Location;
import com.synisys.go.dom.User;
import com.synisys.go.filter.LocationFilter;
import com.synisys.go.filter.NameFilter;
import com.synisys.go.filter.TeamMemberFilter;

import javax.annotation.PostConstruct;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by zaven.chilingaryan on 10/20/2016.
 */
public class TeamMemberFilterController implements Serializable{

    private final TeamMemberFilter<String> filterName = new NameFilter();
    private final TeamMemberFilter<Location> filterLocation = new LocationFilter();
    private List<User> filteredUsers;

    private Team team;

    private List<TeamMemberFilter> filters = new ArrayList<>();

    @PostConstruct
    private void init() {
        filteredUsers = team.getTeamMembers();
        filters.add(filterName);
        filters.add(filterLocation);
    }


    public void filterTeamMembers() {
        //create all matching default predicate
        Predicate<User> userPredicate = user -> true;
        for (TeamMemberFilter filter : filters) {
            if (filter.isFilterSet()) {
                userPredicate = userPredicate.and(filter.getPredicate());
            }
        }
        filteredUsers = team.getTeamMembers().stream().filter(userPredicate).collect(Collectors.toList());
    }

    public List<User> getFilteredUsers() {
        return filteredUsers;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public TeamMemberFilter<String> getFilterName() {
        return filterName;
    }

    public TeamMemberFilter<Location> getFilterLocation() {
        return filterLocation;
    }
}
