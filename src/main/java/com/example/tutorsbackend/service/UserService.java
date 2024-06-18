package com.example.tutorsbackend.service;

import com.example.tutorsbackend.model.UserModel;
import com.example.tutorsbackend.entity.User;

import java.util.List;

public interface UserService {

    void saveUser(UserModel userModel);

    User findUserByEmail(String email);

    List<UserModel> findAllUsers();

}
