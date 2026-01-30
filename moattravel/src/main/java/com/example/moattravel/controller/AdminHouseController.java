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

public class AdminHouseController {

	private final HouseRepository houseRepository;

	
	
	public AdminHouseController(HouseRepository houseRepository) {
		this.houseRepository = houseRepository;
	}

	@GetMapping

	public String index(Model model) {
		List<House> house = houseRepository.findAll();
		model.addAttribute("houses", house);

		return "admin/houses/index";
	}

}
