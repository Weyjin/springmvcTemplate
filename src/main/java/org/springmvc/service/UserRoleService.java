package org.springmvc.service;

import org.springmvc.model.UserRole;

import java.util.List;

/**
 * Created by Administrator on 2017/10/9.
 */
public interface UserRoleService {
    List<UserRole> getUserRolesByUserId(String userId);

}
