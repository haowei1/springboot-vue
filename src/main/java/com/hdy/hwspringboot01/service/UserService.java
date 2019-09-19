package com.hdy.hwspringboot01.service;

import com.hdy.hwspringboot01.dao.UserDao;
import com.hdy.hwspringboot01.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author m760384371
 * @date 2019/9/19
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public boolean isExist(String username) {
        User user = getByName(username);
        return null!=user;
    }

    public User getByName(String username) {
        return userDao.findByUsername(username);
    }

    public User getByUsernameAndPassword(String username, String password){
        return userDao.getByUsernameAndPassword(username, password);
    }

    public void add(User user) {
        userDao.save(user);
    }

}
