package com.mcd;

import com.mcd.mapper.UserMapper;
import com.mcd.model.User;
import com.mcd.service.UserMapperService;
import com.mcd.service.impl.ProxyInvocationHandler;
import com.mcd.service.impl.UserMapperServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Ddblog2ApplicationTests {
    @Autowired
    UserMapperServiceImpl userMapperService;
    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {

        User user = new User();
        user.setId(12);
        user.setUsername("zs");
        user.setPassword("zd");


    }

}
