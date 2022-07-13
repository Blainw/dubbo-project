package wdm.example.service;

import wdm.example.model.User;

public interface UserService {
    User queryUserById(Integer id);//根据用户id查询用户信息
}
