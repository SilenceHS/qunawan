package com.springboot.qunawan.service;

import com.springboot.qunawan.pojo.User;

public interface UserService {
    public User findUserById(int userid);
    public User login(User user);
    public Boolean checkPhone(String phone);
    public Boolean checkEmail(String email);
    public void sign(User user);
    public Boolean update(User user);
    public int updatepsw(User user);
    public int updateuser(User user);
}
