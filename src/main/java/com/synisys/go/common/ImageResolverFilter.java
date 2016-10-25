package com.synisys.go.common;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by zaven.chilingaryan on 10/25/2016.
 */
public class ImageResolverFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String path = ((HttpServletRequest) servletRequest).getRequestURI();
        servletRequest.getRequestDispatcher("uploads/" + path).forward(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
