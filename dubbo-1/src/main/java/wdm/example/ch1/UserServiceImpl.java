package wdm.example.ch1;

public class UserServiceImpl implements UserService {
    public User queryUserById(String name) {
        return new User(name,23);
    }
}
