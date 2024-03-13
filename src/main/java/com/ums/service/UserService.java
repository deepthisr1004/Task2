package com.ums.service;

import com.ums.dto.UserDto;
import com.ums.entity.User;
import com.ums.exception.CustomException;
import com.ums.repository.IUser;
import com.ums.utils.enums.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {
    @Autowired
    private IUser userRepo;

    /** User creation*/
    public User createUser(User userDetails) {
        return userRepo.save(userDetails);
    }

    /** Get user details*/

}
