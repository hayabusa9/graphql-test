package com.bmh.graphqltest.graphqlserver.mapper;

import com.bmh.graphqltest.graphqlserver.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zhaoquan
 */
@Repository
public interface UserMapper {
    List<User> selectUserList();
}
