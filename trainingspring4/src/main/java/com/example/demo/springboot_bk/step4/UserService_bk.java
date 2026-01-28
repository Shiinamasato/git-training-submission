package com.example.demo.springboot_bk.step4;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ユーザー情報 Service
 */
@Service
public class UserService_bk {

    /**
     * ユーザー情報 Repository
     */
    @Autowired
    UserRepository_bk userRepository;

    public List<User_bk> searchAll() {
        // ユーザーTBLの内容を全検索
        return userRepository.findAll();
    }
}