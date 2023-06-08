package com.spring.springpractice.repository;

import com.spring.springpractice.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<Users, Long> {

    List<Users> findFirst2ByUserNameLikeOrderByIdDesc(String name);
}
