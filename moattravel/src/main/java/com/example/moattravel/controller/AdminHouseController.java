package com.example.moattravel.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	 *形として覚える。
	 */
	@GetMapping
	public String index(Model model,
			@PageableDefault(page = 0, size = 10, sort = "id", direction = Direction.ASC) Pageable pageable,

			/*
			 * @RequestParamアノテーションをつけることで
			 * フォームから送信されたパラメータ（リクエストパラメータ）を
			 * その引数に割り当てる
			 * name属性 = 取得するリクエストパラメータ名
			 * requied属性 = そのリクエストが必須か否か
			 * defaultValue属性 = リクエストパラメータの指定されていない、空のデフォルト値
			 */
			@RequestParam(name = "Keyword", required = false) String keyword) {

		//List<House> houses = houseRepository.findAll();
		//Page<House> housePage = houseRepository.findAll(pageable);

		/*
		 * keywordパラメータが存在する場合は部分一致検索を行い
		 * そうでなければ通常通り全件のデータを取得
		 */
		Page<House> housePage;
		if (keyword != null && !keyword.isEmpty()) {
			housePage = houseRepository.findByNameLike("%" + keyword + "%", pageable);
		} else {
			housePage = houseRepository.findAll(pageable);
		}

		//model.addAttribute("houses", houses);
		model.addAttribute("housePage", housePage);
		model.addAttribute("keyword", keyword);

		return "admin/houses/index";
	}

}
