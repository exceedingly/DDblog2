package com.mcd.service;

import com.mcd.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public interface UserMapperService {
    User selUserById(int id);

    int addUser(User user);

    int delUserById(int id);
}
