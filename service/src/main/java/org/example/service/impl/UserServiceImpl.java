package org.example.service.impl;

import com.demo.api.User;
import com.demo.api.UserService;
import org.springframework.stereotype.Component;

import java.util.Date;
@Component
public class UserServiceImpl implements UserService {
    @Override
    public User getUserById(String userId) {
        User u=new User();
        u.setId(userId);
        u.setName("张三aaa："+userId);
        u.setBirthDate(new Date());
        u.setAge(21);
        return u;
    }
}
