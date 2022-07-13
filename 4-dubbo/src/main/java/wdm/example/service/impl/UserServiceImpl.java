package wdm.example.service.impl;

import wdm.example.model.User;
import wdm.example.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User queryUserById(Integer id) {
        return new User(id,"王德明");
    }
}
