package org.springmvc.model;

/**
 * Created by Administrator on 2017/10/9.
 */
public class UserRole {

    private int Id;
    private User user;
    private Role role;



    public UserRole(){}

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
