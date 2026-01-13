package java_nyuumon.chap8.Main;

import java_nyuumon.chap8.Hero.Hero8_8;

public class Main8_13 {
//勇者インスタンスを生成して初期値を代入
	public static void main(String[] args) {
		//1.勇者を生成
		Hero8_8 h = new Hero8_8(); 
		//2.フィールドに初期値をセット
		h.name = "ミナト";  //変数hのnameに代入
		h.hp = 100;  //変数hのhpに代入
		System.out.println("勇者" + h.name + "を生み出しました！");
		
		h.sit(5);
		h.slip();
		h.sit(25);
		h.run();
	}
}
