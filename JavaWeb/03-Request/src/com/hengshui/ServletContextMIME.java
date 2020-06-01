package com.hengshui;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servletContextMIME")
public class ServletContextMIME extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //��ȡServletContext
        ServletContext servletContext = req.getServletContext();
        //����һ���ļ�����
        String fileName = "a.jpg";
        //��ȡMIME����
        String mimeType = servletContext.getMimeType(fileName);
        //�鿴MIME����
        System.out.println(mimeType);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}
