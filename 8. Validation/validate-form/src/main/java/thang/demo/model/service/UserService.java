package thang.demo.model.service;

import thang.demo.model.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    void save(User user);
}
