package com.example.moattravel.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.moattravel.entity.House;
import com.example.moattravel.repository.HouseRepository;

@Controller

/*
 * クラスに@RequestMappingアノテーションをつけ、
 * ルートパスの基準値を設定
 * ※各メソッドに共通のパス「/admin/houses」を繰り返し書かなくて済む
 */
@RequestMapping("/admin/houses")


/*
 * このAdminHouseControllerクラス(A)がHouseRepositoryのオブジェクト(B)を利用している
 * そして、Aの中でBのオブジェクトを直接生成するのではなく、Aに対してBのオブジェクトを外部から提供
 * ＝ 依存性の注入（DI）
 */
public class AdminHouseController {

	private final HouseRepository houseRepository;

	public AdminHouseController(HouseRepository houseRepository) {
		this.houseRepository = houseRepository;
	}

	
	/*
	 *コントローラからビューにデータを渡す場合、Modelクラスを使う
	 *・メソッドにModel型の引数を指定する
	 *・メソッド内でaddAttribute()メソッドを使い
	 *ビュー側から参照する変数, ビューに渡すデータ　を渡す。 
	 *
	 *（コントローラーで）
	 */
	@GetMapping
	public String index(Model model) {
		List<House> houses = houseRepository.findAll();
		model.addAttribute("houses", houses);

		return "admin/houses/index";
	}

}
