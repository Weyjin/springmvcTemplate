package org.springmvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springmvc.dao.UserDao;
import org.springmvc.model.User;
import org.springmvc.service.AccountService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/10/9.
 */
@Service("AccountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private UserDao userDao;
    public List<String> getPermissionsByUserName(String name) {

        User user=userDao.getUserByName(name);
        if(user==null){
            return null;
        }

        List<String> list=new ArrayList<String>();



        return null;
    }
}
