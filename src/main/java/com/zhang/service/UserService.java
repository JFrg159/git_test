package com.zhang.service;

import com.zhang.domain.User;
import org.springframework.transaction.annotation.Transactional;
@Transactional
public interface UserService {

    public User findById(String username);

    public boolean updateById(String username,String newname);
}
