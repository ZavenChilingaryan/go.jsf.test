package com.synisys.go.filter;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/**
 * Created by meruzhan.gasparyan on 21-Oct-16.
 */
public interface Filter<T> {

     void setFilters(Collection<?> filters, Collection<T> value );

}
