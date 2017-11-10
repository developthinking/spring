package com.wt.dao;

import com.wt.entity.UserEntity;

/**
 * Created by Administrator on 2017/11/10.
 */
public interface UserDao {

    /**
     * 登录
     *
     * @param userEntity
     * @return
     */
    public UserEntity login(UserEntity userEntity);
}
