package com.wt.ssm.core.service.impl;


import com.wt.ssm.core.dao.UserDao;
import com.wt.ssm.core.entity.User;
import com.wt.ssm.core.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author 1034683568@qq.com
 * @project_name ssm-maven
 * @date 2017-3-1
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    public User login(User user) {
        return userDao.login(user);
    }

    public List<User> findUser(Map<String, Object> map) {
        return userDao.findUsers(map);
    }

    public int updateUser(User user) {
        //防止有人胡乱修改导致其他人无法正常登陆
        if ("admin".equals(user.getUserName())) {
            return 0;
        }
        return userDao.updateUser(user);
    }

    public Long getTotalUser(Map<String, Object> map) {
        return userDao.getTotalUser(map);
    }

    public int addUser(User user) {
        if (user.getUserName() == null || user.getPassword() == null || getTotalUser(null) > 90) {
            return 0;
        }
        return userDao.addUser(user);
    }

    public int deleteUser(Integer id) {
        //防止有人胡乱修改导致其他人无法正常登陆
        if (2 == id) {
            return 0;
        }
        return userDao.deleteUser(id);
    }

}
