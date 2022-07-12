package wdm.example.ch1;

import org.springframework.stereotype.Service;

public class UserServiceImpl implements UserService {
    public User queryUserById(String name) {
        return new User(name,23);
    }
}
