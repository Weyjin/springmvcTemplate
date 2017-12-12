package org.springmvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springmvc.dao.UserRoleDao;
import org.springmvc.model.UserRole;
import org.springmvc.service.UserRoleService;

import java.util.List;

/**
 * Created by Administrator on 2017/12/12.
 */
@Service("UserRoleService")
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    private UserRoleDao userRoleDao;

    public List<UserRole> getUserRolesByUserId(String userId) {
        return userRoleDao.getUserRolesByUserId(userId);
    }
}
