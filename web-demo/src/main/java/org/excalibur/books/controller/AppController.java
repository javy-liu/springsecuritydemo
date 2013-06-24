package org.excalibur.books.controller;

import org.excalibur.books.controller.org.excalibur.books.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * User: faith
 * Date: 13-6-24
 * Time: 上午11:13
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class AppController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/")
    public String index(){
        System.out.println("进入首页");
        return "index";
    }

    @RequestMapping(value = "/login")
    public String login(){
        System.out.println("进入首页");
        userService.login("excalibur","123456");
        return "home";
    }
}
