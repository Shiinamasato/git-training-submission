package com.example.moattravel.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.moattravel.entity.House;

/*
 * JpaRepositoryインタフェースを継承するだけで
 * 基本的なCRUD操作を行うためのメソッドが利用可能になる
 */
public interface HouseRepository extends JpaRepository<House, Integer> {

	/*
	 * findBy〔検索対象のカラム名〕Like（）
	 * SQLのLIKE句＝文字列を部分一致で検索 と同様のもの
	 */
	public Page<House> findByNameLike(String keyword, Pageable pageable);

}
