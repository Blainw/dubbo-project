package wdm.example.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import wdm.example.ch1.User;
import wdm.example.ch1.UserService;

import javax.annotation.Resource;

@Controller
public class MyController {
    @Autowired
    private UserService userService;
    @RequestMapping("/user")
    @ResponseBody
    public User user(String name){
        User user=this.userService.queryUserById(name);
        return user;
    }
}
