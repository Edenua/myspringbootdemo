package com.wuan.myspringbootdemo.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.IOException;

/**
 * @Time：2019-09-15 14:15
 * @Author:<Gaoxiang>
 * @Description：<描述>
 */
public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("MyFilter被调用");

        chain.doFilter(request, response);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //在服务启动时初始化
        System.out.println("初始化拦截器");
    }

    @Override
    public void destroy() {
        //在服务关闭是销毁
        System.out.println("销毁拦截器");
    }
}
