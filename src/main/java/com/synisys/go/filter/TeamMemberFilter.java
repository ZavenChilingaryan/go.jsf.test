package com.synisys.go.filter;

import com.synisys.go.dom.User;

import java.util.function.Predicate;

/**
 * Created by zaven.chilingaryan on 10/20/2016.
 */
public interface TeamMemberFilter<T> {

    T getFilterValue();

    void setFilterValue(T filterValue);

    boolean isFilterSet();

    Predicate<User> getPredicate();


}
