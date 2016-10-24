package com.synisys.go.filter;

import com.synisys.go.dom.User;

import java.util.function.Predicate;

/**
 * Created by zaven.chilingaryan on 10/20/2016.
 */
public class NameFilter implements TeamMemberFilter<String> {

    private String filterValue;

    public String getFilterValue() {
        return filterValue;
    }

    public void setFilterValue(String filterValue) {
        this.filterValue = filterValue;
    }

    public boolean isFilterSet() {
        return filterValue != null && !filterValue.isEmpty();
    }

    public Predicate<User> getPredicate() {
        return user -> user.getFirstName().contains(filterValue);
    }


}
