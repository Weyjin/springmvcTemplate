package org.springmvc.model;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/10/9.
 */
public class User {


    private int Id;
    private String password;
    private int status;
    private String username;
    private Date createDate;
    private List<UserRole> userroles;
    public User(){}

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getName() {
        return username;
    }

    public void setName(String name) {
        this.username = name;
    }


    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public List<UserRole> getUserroles() {
        return userroles;
    }

    public void setUserroles(List<UserRole> userroles) {
        this.userroles = userroles;
    }
}
