package com.wuan.myspringbootdemo.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @Time：2019-09-15 14:28
 * @Author:<Gaoxiang>
 * @Description：<描述>
 */
public class MyListener implements HttpSessionListener {

    public static int online = 0;

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("sessionCreated被调用");
        online ++;
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("sessionDestroyed被调用");
        online --;
    }
}