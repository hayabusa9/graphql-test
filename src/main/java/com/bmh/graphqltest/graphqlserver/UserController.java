package com.bmh.graphqltest.graphqlserver;

import com.bmh.graphqltest.graphqlserver.mapper.UserMapper;
import com.bmh.graphqltest.graphqlserver.pojo.User;
import com.bmh.graphqltest.graphqlserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @QueryMapping
    public List<User> users() {
        List<User> users = userService.getAllUser();
        return users;
    }
}
