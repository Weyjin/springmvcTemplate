package org.springmvc.model;

import java.util.Date;

/**
 * Created by Administrator on 2017/10/9.
 */
public class Role {


    private int Id;
    private String roleName;
    private String describe;
    private Date createDate;

    public Role(){}

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
