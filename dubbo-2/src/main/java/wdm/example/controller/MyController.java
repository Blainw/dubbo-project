package wdm.example.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import wdm.example.ch1.User;
import wdm.example.ch1.UserService;

import javax.annotation.Resource;

@Controller
public class MyController {
    @Resource
    private UserService userService;
    @RequestMapping("/user")
    public String user(Model model,String name){
        User user=this.userService.queryUserById(name);
        model.addAttribute("user",user);
        return "user";
    }
}
