package com.zhang.service.impl;

import com.zhang.dao.Userdao;
import com.zhang.domain.User;
import com.zhang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private Userdao userdao;


    public User findById(String username) {
        return userdao.findById(username);
    }

    public boolean updateById(String username, String newname) {
        return userdao.updateById(username,newname) > 0;

    }
}
