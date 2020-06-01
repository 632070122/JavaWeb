package com.hengshui;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servletContextSharedData")
public class ServletContextSharedData extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //��ȡServletContext
        ServletContext servletContext = req.getServletContext();
        servletContext.setAttribute("name","С��");
        System.out.println("�洢��������name:С��");
        Object name = servletContext.getAttribute("name");
        System.out.println("��ȡ����������:"+name);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}
