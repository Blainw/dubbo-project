package wdm.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import wdm.example.model.User;
import wdm.example.service.UserService;

@Controller
public class MyController {
    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    public String user(Model model, Integer id,String name){
        User user=userService.queryUserById(id,name);
        model.addAttribute("user",user);
        return "user";
    }

}
