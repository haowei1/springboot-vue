package com.hdy.hwspringboot01.controller;

import com.hdy.hwspringboot01.entity.RequestForm;
import com.hdy.hwspringboot01.entity.Result;
import com.hdy.hwspringboot01.model.User;
import com.hdy.hwspringboot01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * @author m760384371
 * @date 2019/9/18
 */
@RestController
@RequestMapping("api")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "login")
    public Result login(@RequestBody User user, HttpSession session) {
        System.out.println(user.getUsername() + ":发起登录请求，密码为:" + user.getPassword());
        User u = userService.getByUsernameAndPassword(user.getUsername(), user.getPassword());
        if (null != u && !"".equals(u)) {
            u.setPassword("");
            session.setAttribute("user", u);
            return new Result(200);
        } else {
            return new Result(400);
        }
    }

}
