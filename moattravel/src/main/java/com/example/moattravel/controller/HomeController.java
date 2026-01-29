package com.example.moattravel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/*
 * SpringBootではクラスに@Controllerをつけることで、
 * そのクラスがコントローラとして機能するようになる。
 */

@Controller   //アノテーション（注釈）

public class HomeController {
	
	
	/*
	 * コントローラ内のメソッドに@GetMappingを付けることで
	 * HTTPリクエストのGETメソッドにマッピング(対応づけ)ができる
	 * 引数にはマッピングするルートパスを指定する
	 * 
	 * この場合は("/")の為、アプリのトップページに
	 * （GETメソッドで）アクセスされたときにこのメソッドが実行される
	 */
	@GetMapping("/")  
	public String index() {

		/*
		 * 呼び出すビューの名前をreturnで返す。
		 */
		return "index";

	}
}
