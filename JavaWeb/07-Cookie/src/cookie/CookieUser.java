package cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/cookieUser")
public class CookieUser extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 判断用户是否登陆,如果登陆,就显示上一次登陆时间,如果没有登陆,显示,你好,欢迎首次登陆


        //获取所有的cookie
       /* Cookie[] cookies = request.getCookies();

        if (cookies != null && cookies.length > 0){
            for (Cookie cookie : cookies) {
                //获取cookie的名称
                String name = cookie.getName();
                if("lastTime".equals(name)){
                    Date date = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
                    String format = sdf.format(date);
                    cookie.setValue(format);
                    cookie.setMaxAge(60*60*24);
                    response.addCookie(cookie);
                    //表示不是第一次访问,获取cookie的value
                    String value = cookie.getValue();
                    response.setContentType("text/html;charset=utf-8");
                    response.getWriter().write("欢迎回来,您上次访问时间是:"+value);
                    break;
                }
            }
        }
        if(cookies == null ){

        }*/

        //设置响应
        /*response.setContentType("text/html;charset=utf-8");

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

        String format = sdf.format(date);

        String encode = URLEncoder.encode(format, "utf-8");

        //存货时间set MaxAge永久(60*60*24*30)

        //获取Cookie
        Cookie[] cookies = request.getCookies();

        if (cookies != null && cookies.length > 0){
            for (Cookie cookie : cookies) {
                //获取cookie的名称
                String name = cookie.getName();

            }
        }*/
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
