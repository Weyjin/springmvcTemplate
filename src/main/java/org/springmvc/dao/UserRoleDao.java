package org.springmvc.dao;

import org.apache.ibatis.annotations.Select;
import org.springmvc.model.UserRole;

import java.util.List;

/**
 * Created by Administrator on 2017/10/9.
 */
public interface UserRoleDao {

    @Select("select * from sys_user_role where userId=#{userId}")
    List<UserRole> getUserRolesByUserId(String userId);
}
