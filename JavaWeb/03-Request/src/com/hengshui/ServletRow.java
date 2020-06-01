package com.hengshui;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/*
1.获取请求方式			String getMethod()
2.获取虚拟目录			String getContextPath()
3.获取Servlet路径			String getServletPath()
4.获取get请求参数			String getQueryString()
5.获取请求的URI			String getRequestURI()
6.获取请求的URL			StringBuffer getRequestURL()
7.获取协议及版本			String getProtocol()
8.获取客户机的IP地址		String getRemoteAddr()
* */
//获取请求行
@WebServlet("/servletRow")
public class ServletRow extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("servletRow被访问了");
        String method = req.getMethod();
        System.out.println(method);
        String contextPath = req.getContextPath();
        System.out.println(contextPath);
        String servletPath = req.getServletPath();
        System.out.println(servletPath);
        String queryString = req.getQueryString();
        System.out.println(queryString);
        String requestURI = req.getRequestURI();
        System.out.println(requestURI);
        StringBuffer requestURL = req.getRequestURL();
        System.out.println(requestURL);
        String protocol = req.getProtocol();
        System.out.println(protocol);
        String remoteAddr = req.getRemoteAddr();
        System.out.println(remoteAddr);
    }
}
