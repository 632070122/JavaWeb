package com.hengshui.listener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextLoaderListener implements ServletContextListener {

    @Override//监听,创建
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("contextInitialized创建了");
    }

    @Override//销毁
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("contextDestroyed销毁了");
    }
}
