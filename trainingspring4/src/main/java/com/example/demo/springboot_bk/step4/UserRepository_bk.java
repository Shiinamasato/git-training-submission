package com.example.demo.springboot_bk.step4;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * ユーザー情報 Repository
 */
@Repository
public interface UserRepository_bk extends JpaRepository<User_bk, Long> {
}