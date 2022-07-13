package wdm.example.service;

import wdm.example.model.User;

public interface UserService {
    User queryUserById(Integer id,String name);
}
