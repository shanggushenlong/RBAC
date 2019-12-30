package com.atguigu.rbac.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面跳转
 */
@Controller
public class DispatcherController {

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

}
