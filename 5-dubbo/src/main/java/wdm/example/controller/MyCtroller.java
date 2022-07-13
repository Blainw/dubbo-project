package wdm.example.controller;

import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import wdm.example.model.User;
import wdm.example.service.UserService;

@Controller
public class MyCtroller {
    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    public String user(Model model, Integer id){
        User user=userService.queryUserById(id);
        model.addAttribute("user",user);
        return "user";
    }
}
