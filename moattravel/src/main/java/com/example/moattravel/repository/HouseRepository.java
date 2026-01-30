package com.example.moattravel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.moattravel.entity.House;



/*
 * JpaRepositoryインタフェースを継承するだけで
 * 基本的なCRUD操作を行うためのメソッドが利用可能になる
 */
public interface HouseRepository extends JpaRepository<House, Integer>{
	
	
	
}

