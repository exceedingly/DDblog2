package com.mcd.service.impl;

import com.mcd.mapper.UserMapper;
import com.mcd.model.User;
import com.mcd.model.UserExample;
import com.mcd.service.UserMapperService;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserMapperServiceImpl implements UserMapperService {
    @Autowired
    UserMapper userMapper;

    @Override
    public User selUserById(int id) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andIdEqualTo(3);
        System.out.println(" exe selUser");

        List<User> user = userMapper.selectByExample(userExample);
        System.out.println(user.get(0));
        return user.get(0);
    }

    @Override

    public int addUser(User user) {

        System.out.println(" exe adduser");

        return userMapper.insert(user);
    }

    @Override
    public int delUserById(int id) {
        return 0;
    }
}
