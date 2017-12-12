package org.springmvc.service;

import org.springmvc.model.User;

import java.util.List;

/**
 * Created by Administrator on 2017/10/9.
 */
public interface UserService {
    List<User> getUsers();
    User getUserById(int id);
    boolean deleteUserById(int id);
    User getUserByName(String name);
    List<String> permissionlist(String username);
}
