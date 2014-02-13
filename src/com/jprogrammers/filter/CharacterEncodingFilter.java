package com.jprogrammers.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by EN20 on 2/7/14.
 */
public class CharacterEncodingFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
