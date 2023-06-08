package com.spring.springpractice.service;

import com.spring.springpractice.entity.Users;
import com.spring.springpractice.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<Users> getUsersService(String name) {
        if (name.isBlank()) {
            return userRepository.findAll();
        } else {
            return userRepository.findFirst2ByUserNameLikeOrderByIdDesc(name);
        }
    }

    public String createUserService(Users user) {
        userRepository.save(user);
        return "등록 완료";
    }
}
