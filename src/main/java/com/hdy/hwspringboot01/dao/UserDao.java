package com.hdy.hwspringboot01.dao;

import com.hdy.hwspringboot01.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author m760384371
 * @date 2019/9/19
 */
@Repository
public interface UserDao extends JpaRepository<User, String> {

    User findByUsername(String username);

    User getByUsernameAndPassword(String username, String password);

}
