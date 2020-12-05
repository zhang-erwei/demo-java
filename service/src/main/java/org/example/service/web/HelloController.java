package org.example.service.web;

import com.demo.api.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("/")
    @ResponseBody
    public String Home() {
        return "Hello";
    }

    @GetMapping("/test")
    @ResponseBody
    public String test(String p) {
        User user=new User();

        return "123:"+p;
    }
}
