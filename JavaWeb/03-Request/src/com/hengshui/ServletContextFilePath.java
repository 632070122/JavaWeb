package com.hengshui;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servletContextFilePath")
public class ServletContextFilePath extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //��ȡServletContext
        ServletContext servletContext = req.getServletContext();

        //��ȡ�������ļ���·��
        String realPath1 = servletContext.getRealPath("/WEB-INF/classes/com/hengshui/request/ServletBody.java"); //��ȡsrcĿ¼
        System.out.println(realPath1);
        String realPath2 = servletContext.getRealPath("/index.jsp");      //��ȡwebĿ¼
        System.out.println(realPath2);
        String realPath3 = servletContext.getRealPath("/WEB-INF/web.xml");//��ȡWEB-INFĿ¼
        System.out.println(realPath3);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}
