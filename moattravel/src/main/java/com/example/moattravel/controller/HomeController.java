package com.example.moattravel.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.moattravel.entity.House;
import com.example.moattravel.repository.HouseRepository;

/*
 * SpringBootではクラスに@Controllerをつけることで、
 * そのクラスがコントローラとして機能するようになる。
 */

@Controller //アノテーション（注釈）

public class HomeController {

	private final HouseRepository houseRepository;
	
	public HomeController(HouseRepository houseRepository) {
		this.houseRepository = houseRepository;
	}
	/*
	 * コントローラ内のメソッドに@GetMappingを付けることで
	 * HTTPリクエストのGETメソッドにマッピング(対応づけ)ができる
	 * 引数にはマッピングするルートパスを指定する
	 * 
	 * この場合は("/")の為、アプリのトップページに
	 * （GETメソッドで）アクセスされたときにこのメソッドが実行される
	 */
	@GetMapping("/")
	public String index(Model model) {
		List<House> newHouses = houseRepository.findTop10ByOrderByCreatedAtDesc();
		model.addAttribute("newHouses", newHouses);
		

		/*
		 * 呼び出すビューの名前をreturnで返す。
		 */
		return "index";

	}
}
