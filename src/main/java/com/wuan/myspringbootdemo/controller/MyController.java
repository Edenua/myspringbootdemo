package com.wuan.myspringbootdemo.controller;
//import com.wuan.myspringbootdemo.biz.GlobalBiz;
import com.wuan.myspringbootdemo.biz.GlobalBiz;
import com.wuan.myspringbootdemo.dao.EmployeeDao;
import com.wuan.myspringbootdemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Time：2019-09-14 19:38
 * @Author:<Gaoxiang>
 * @Description：<描述>
 */
@Controller
public class MyController {

    @Autowired
    private GlobalBiz globalBiz;
    @RequestMapping("/to_login")
    public String to_login(){
        return "login";
    }

    @RequestMapping("/login")
    public String login(HttpSession session, @RequestParam String sn, @RequestParam String password){
        Employee employee = globalBiz.login(sn,password);
        System.out.println(employee);
        if (employee == null) {
            return "redirect:to_login";
        }
        session.setAttribute("employee",employee);
        return "redirect:self";
    }

    @RequestMapping("/self")
    public String self(){
        return  "self";
    }
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("msg","高某人");
        return "index";
    }
}
