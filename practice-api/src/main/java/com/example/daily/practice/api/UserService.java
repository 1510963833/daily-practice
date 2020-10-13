package com.example.daily.practice.api;


import com.example.daily.practice.api.model.UserModel;

/**
 * @author <a href="mailto:chenxilzx1@gmail.com">theonefx</a>
 */
public interface UserService {

    String getUserName(Long id);

    UserModel addUser(UserModel user);
}
