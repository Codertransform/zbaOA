package com.zba.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "")
public class IndexController {

    @RequestMapping(value = {"","/"})
    public String index(Model model){
        model.addAttribute("title", "商城管理系统 - 首页");
        return "index";
    }

    @RequestMapping(value = "/welcome")
    public String welcome(){
        return "welcome";
    }

    @RequestMapping(value = "/login")
    public String login(){
        return "login";
    }
}
