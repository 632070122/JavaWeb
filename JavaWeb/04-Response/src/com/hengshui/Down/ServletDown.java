package com.hengshui.Down;

import com.hengshui.utils.DownLoadUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.FileInputStream;
import java.io.IOException;

@WebServlet("/servletDown")
public class ServletDown extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取请求参数
        String filename = request.getParameter("filename");

        //获取ServletContext,用于去获取文件的真实路径
        ServletContext servletContext = this.getServletContext();

        //获取真实路径
        String realPath = servletContext.getRealPath("/img/" + filename);

        //用输入字节流关联文件,读取进内存
        FileInputStream fileInputStream = new FileInputStream(realPath);

        //获取字节输出流
        ServletOutputStream outputStream = response.getOutputStream();

        //设置字节数组作为缓冲区
        byte[] buff = new byte[1024 * 8];

        //设置读取到的个数初始化
        int len = 0;

        //获取文件的MIME类型,用于设置响应头
        String mimeType = servletContext.getMimeType(filename);

        //设置响应头,用于提示下载(文件的头,文件的MIME类型)
        response.setHeader("content-type",mimeType);

        //获取user-agent的请求头,用于解决下载中文乱码问题,使用工具类
        String agent = request.getHeader("user-agent");

        //使用工具类解决下载中文乱码问题
        filename = DownLoadUtils.getFileName(agent,filename);

        //设置响应头,用于提示下载(文件的头,文件打开的方式(附件的意思))(filename是提示框的名字)
        response.setHeader("content-disposition","attachment;filename="+filename);

        //循环读取,存入缓冲区,并且给个数赋值,并且个数不等于-1,然后写出数据
        while ((len = fileInputStream.read(buff)) != -1){
            outputStream.write(buff,0,len);
        }

        //关闭流
        fileInputStream.close();
        outputStream.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
