package com.wt.controller;

import com.wt.entity.UserEntity;
import com.wt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2017/11/10.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 登录
     *
     * @param user
     * @param request
     * @return
     */
    @RequestMapping(value = "/login")
    public String login(UserEntity user, HttpServletRequest request) {
        UserEntity resultUser = null;
        try {
            resultUser = userService.login(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (resultUser == null) {
            request.setAttribute("user", user);
            request.setAttribute("errorMsg", "请认真核对账号、密码！");
            return "login";
        } else {
            HttpSession session = request.getSession();
            session.setAttribute("currentUser", resultUser);
            return "redirect:/main.jsp";
        }
    }
}
