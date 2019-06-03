package com.demo.service;

import com.demo.entity.User;
import com.demo.repository.UserRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepositoty userRepositoty;

    public User findUserByName(String name){
        User user = null;
        try{
            user = userRepositoty.findByUserName(name);
        }catch (Exception e){
            e.printStackTrace();
        }
        return user;
    }

    public User findUser(String id){
        User user = null;
        try{
            user = userRepositoty.findByUserId(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return user;
    }
}
