package com.zba.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "")
public class IndexController {

    @RequestMapping(value = {"","/"})
    public String index(Model model){
        model.addAttribute("title", "智宝安OA管理系统 - 首页");
        return "index";
    }
}
