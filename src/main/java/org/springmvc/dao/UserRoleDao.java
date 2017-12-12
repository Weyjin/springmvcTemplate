package org.springmvc.dao;

import org.springframework.stereotype.Repository;
import org.springmvc.model.UserRole;

import java.util.List;

/**
 * Created by Administrator on 2017/10/9.
 */
@Repository
public interface UserRoleDao {

    List<UserRole> getUserRolesByUserId(String userId);
}
