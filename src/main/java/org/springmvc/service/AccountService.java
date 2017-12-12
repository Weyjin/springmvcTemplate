package org.springmvc.service;

import java.util.List;

/**
 * Created by Administrator on 2017/10/9.
 */
public interface AccountService {

    List<String> getPermissionsByUserName(String name);


}
