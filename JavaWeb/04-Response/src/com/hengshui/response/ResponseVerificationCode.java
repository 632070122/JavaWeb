package com.hengshui.response;
import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;


@WebServlet("/responseVerificationCode")
public class ResponseVerificationCode extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建图片的宽度高度
        int width = 100,height = 50;
        //创建一个对象,在内存中图片,传递图片的宽度,高度,以及图片的类型
        BufferedImage image = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);

        //获取画笔对象
        Graphics g = image.getGraphics();
        //设置画笔的颜色,粉色
        g.setColor(Color.white);
        //填充矩形
        g.fillRect(0,0,width,height);


        //设置画笔的颜色,绿色
        g.setColor(Color.blue);
        //画边框矩形
        g.drawRect(0,0,width-1,height-1);

        //设置画笔的颜色,黑色
        g.setColor(Color.black);
        //设置所有验证码需要的字符串
        String str = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuioplkjhgfdsazxcvbnm0123456789";



        //生成随机角标
        Random random = new Random();

        for (int i = 1; i <= 4; i++) {
            int index = random.nextInt(str.length());
            //获取验证码的随机一个
            char ch = str.charAt(index);
            //画验证码,需要字符串,以及坐标,X,Y
            g.drawString(ch+"",width/5*i,height/2);
        }




        //画干扰线
        g.setColor(Color.green);
        //随机生成坐标点
        for (int i = 0; i < 8; i++) {
            int x1 = random.nextInt(width);
            int x2 = random.nextInt(width);
            int y1 = random.nextInt(height);
            int y2 = random.nextInt(height);
            g.drawLine(x1,x2,y1,y2);
        }









        //输出到页面上,通过ImageIO的write方法,传递图片,图片类型,以及输出流
        ImageIO.write(image,"jpg",resp.getOutputStream());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}
