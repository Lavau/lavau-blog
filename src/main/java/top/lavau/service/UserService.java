package top.lavau.service;

import top.lavau.po.User;

public interface UserService {

    User checkUser(String username, String password);
}
