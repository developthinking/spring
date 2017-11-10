package com.wt.entity;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/11/10.
 */
public class UserEntity implements Serializable {

    private Integer id; // 主键
    private String userName; // 用户姓名
    private String password; // 密码
    private String roleName; // 角色

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", roleName='" + roleName + '\'' +
                '}';
    }
}
