package org.springmvc.dao;

import org.springframework.stereotype.Repository;
import org.springmvc.model.User;

import java.util.List;

/**
 * Created by Administrator on 2017/10/9.
 */
@Repository
public interface UserDao {

     List<User> getUsers();
     User getUserById(int id);
     int deleteUserById(int id);
     User getUserByName(String name);
     List<String> getPermissionList(String username);


}
