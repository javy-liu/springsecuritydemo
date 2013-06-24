package org.excalibur.books.controller.org.excalibur.books.service.impl;

import org.excalibur.books.controller.org.excalibur.books.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: faith
 * Date: 13-6-24
 * Time: 上午11:15
 * To change this template use File | Settings | File Templates.
 */
@Service("userService")
public class UserServiceImpl implements UserService{
    @Override
    public String login(String name,String password) {
        System.out.println(name+","+password);
        return "登录成功";
    }
}
