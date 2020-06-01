package com.hengshui.response;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/responseOutputByte")
public class ResponseOutputByte extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //告诉浏览器要使用的编码
        resp.setContentType("text/html;charset=utf-8");
        //获取字符输出流
        ServletOutputStream outputStream = resp.getOutputStream();
        //输出数据
        outputStream.write("你好".getBytes("utf-8"));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}
