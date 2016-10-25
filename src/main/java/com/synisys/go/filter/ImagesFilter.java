package com.synisys.go.filter;

import com.synisys.go.system.ApplicationInitializer;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.IOException;

/**
 * Created by meruzhan.gasparyan on 25-Oct-16.
 */
public class ImagesFilter implements javax.servlet.Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String path = ((HttpServletRequest)request).getRequestURI();
        path = path.substring(path.lastIndexOf("/"));
        request.getRequestDispatcher( ApplicationInitializer.getUsersImagesFolder() + "/" + path).forward(request,response);
    }

    @Override
    public void destroy() {

    }
}
