package org.example.service.web;

import com.demo.api.User;
import com.demo.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @Autowired
    UserService service;

    @GetMapping("/")
    @ResponseBody
    public String Home() {
        return "Hello";
    }

    @GetMapping("/user")
    @ResponseBody
    public User user(String id) {
//        User user=
        return service.getUserById(id);
    }
}
