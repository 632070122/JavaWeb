package com.hengshui;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

//通用获取请求参数
@WebServlet("/servletCommonParameter")
public class ServletCommonParameter extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求参数中文乱码解决方案
        req.setCharacterEncoding("UTF-8");

        //1.根据参数名称获取参数值		String getParameter(String name)
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println(username+":"+password);
        System.out.println("-------------------------------------------");
        //2.根据参数名称获取参数值的数组	String[] getParameterValues(String name)
        String[] hobbies = req.getParameterValues("hobby");
        for (String hobby : hobbies) {
            System.out.println(hobby);
        }
        System.out.println("-------------------------------------------");
        //3.获取所有请求的参数名称		Enumeration<String> getParameterNames()
        Enumeration<String> parameterNames = req.getHeaderNames();
        while (parameterNames.hasMoreElements()){
            String name = parameterNames.nextElement();
            String value = req.getParameter(name);
            System.out.println(name+":"+value);
        }
        System.out.println("-------------------------------------------");
        // 4.获取所有的参数的Map集合		Map<String,String[]> getParameterMap
        Map<String, String[]> parameterMap = req.getParameterMap();
        Set<String> keySet = parameterMap.keySet();
        for (String key : keySet) {
            String[] values = parameterMap.get(key);
            for (String value : values) {
                System.out.println(key+":"+value);
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
