package org.excalibur.books.controller.org.excalibur.books.service;

import org.springframework.security.access.prepost.PreAuthorize;

/**
 * Created with IntelliJ IDEA.
 * User: faith
 * Date: 13-6-24
 * Time: 上午11:13
 * To change this template use File | Settings | File Templates.
 */
public interface UserService {

    @PreAuthorize("hasRole('ROLE_USER')")
    public String login(String name,String password);

}
