package com.wt.service;

import com.wt.dao.UserDao;
import com.wt.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/11/10.
 */
@Service("userService")
public class UserService {

    @Autowired
    private UserDao userDao;

    public UserEntity login(UserEntity userEntity) {
        return userDao.login(userEntity);
    }
}
