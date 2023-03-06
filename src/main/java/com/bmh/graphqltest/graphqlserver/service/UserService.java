package com.bmh.graphqltest.graphqlserver.service;

import com.bmh.graphqltest.graphqlserver.mapper.UserMapper;
import com.bmh.graphqltest.graphqlserver.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public List<User> getAllUser() {
        return userMapper.selectUserList();
    }
}
