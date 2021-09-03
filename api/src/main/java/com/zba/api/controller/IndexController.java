package com.zba.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/api")
public class IndexController {

    @ResponseBody
    @RequestMapping(value = "/get")
    public Map<String, String> index(){
        Map<String, String> map = new HashMap<>();
        map.put("title","智宝安OA管理系统接口");
        return map;
    }
}
