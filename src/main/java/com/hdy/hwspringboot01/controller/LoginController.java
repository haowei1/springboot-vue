package com.hdy.hwspringboot01.controller;

import com.hdy.hwspringboot01.entity.RequestForm;
import com.hdy.hwspringboot01.entity.Result;
import com.hdy.hwspringboot01.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author m760384371
 * @date 2019/9/18
 */
@RestController
public class LoginController {

    @RequestMapping(value = "api/login", produces = "application/json;charset=UTF-8")
    public Result login(@RequestBody User user) {
        System.out.println(user.getUsername() + ":发起登录请求，密码为:" + user.getPassword());
        return new Result(200);
    }

}
