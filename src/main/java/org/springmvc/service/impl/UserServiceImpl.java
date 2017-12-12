package org.springmvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springmvc.dao.UserDao;
import org.springmvc.model.User;
import org.springmvc.service.UserService;

import java.util.List;

/**
 * Created by Administrator on 2017/10/9.
 */
@Service("UserService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Transactional(readOnly = true)
    public List<User> getUsers() {
        List<User> users=userDao.getUsers();
        return users;
    }
    @Transactional(readOnly = true)
    public User getUserById(int id) {
        User user=userDao.getUserById(id);
        return user;
    }

    public boolean deleteUserById(int id) {
        int count=userDao.deleteUserById(id);
        if(count>0){
            return true;
        }
        return false;
    }

    public User getUserByName(String name) {
        return userDao.getUserByName(name);
    }

    public List<String> permissionlist(String username) {
        return userDao.getPermissionList(username);
    }
}
