package com.example.t2009m1helloworld.middleware;

import com.example.t2009m1helloworld.entity.Account;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class AdminFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpSession session = request.getSession();
        boolean havePermisstion = false;
        if (session.getAttribute("currentAccount") != null) {
            Account account = (Account) session.getAttribute("currentAccount");
            if (account.getRoleID() == 2) {
                havePermisstion = true;
            }
        }
        if (havePermisstion) {
            filterChain.doFilter(request, response);
        } else {
            response.sendRedirect("/");
        }
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
