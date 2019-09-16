package com.wuan.myspringbootdemo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Time：2019-09-14 19:38
 * @Author:<Gaoxiang>
 * @Description：<描述>
 */
@Controller
public class MyController {


    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("msg","高某人");
        return "index";
    }
}
