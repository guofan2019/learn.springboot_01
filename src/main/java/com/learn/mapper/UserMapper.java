package com.learn.mapper;

import com.learn.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

//注解表示这个是一个myBatis接口
@Mapper
@Repository
public interface UserMapper {
    List<User> querUserList();
    User querUserById(int id);
    int addUser(User user);
    int updateUser(User user);
    int deleteUser(int id);
    User getUserByName(String name);
}
