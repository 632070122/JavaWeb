package com.hengshui.web.filter;

import com.alibaba.druid.filter.FilterChain;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 完成登陆验证的过滤器
 */
@WebFilter("/*")
public class LoginFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, javax.servlet.FilterChain chain) throws IOException, ServletException {
        //强制转换
        HttpServletRequest request = (HttpServletRequest)req;
        //判断是否是登陆相关的资源,获取资源的请求的资源路径
        String uri = request.getRequestURI();
        //判断是否是登陆相关的资源,如果有,就是想去登陆
        if(
                uri.contains("/login.jsp") ||
                        uri.contains("loginServlet") ||
                        uri.contains("/css") ||
                        uri.contains("/js") ||
                        uri.contains("/fonts/" ) ||
                        uri.contains("/checkCodeServlet")
                ){
            //放行
            chain.doFilter(req, resp);
        }else {
            HttpSession session = request.getSession();
            Object user = session.getAttribute("user");
            if(user != null){
                chain.doFilter(req, resp);
            }else {
                request.setAttribute("login_msg","您尚未登陆,请登录");
                request.getRequestDispatcher("/login.jsp").forward(request,resp);
            }
        }
    }

    @Override
    public void destroy() {

    }
}
