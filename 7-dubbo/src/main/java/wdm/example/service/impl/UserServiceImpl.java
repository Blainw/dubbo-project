package wdm.example.service.impl;

import wdm.example.model.User;
import wdm.example.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User queryUserById(Integer id,String name) {
        return new User(id,name);
    }
}
