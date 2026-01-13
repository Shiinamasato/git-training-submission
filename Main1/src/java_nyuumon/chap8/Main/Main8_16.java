package java_nyuumon.chap8.Main;

import java_nyuumon.chap8.Hero.Hero8_8;
import java_nyuumon.chap8.Matango.Matango8_15;

public class Main8_16 {
//仮想世界に勇者とお化けキノコ2匹を生み出す
	public static void main(String[] args) {
		Hero8_8 h = new Hero8_8();
		h.name = "ミナト";
		h.hp = 100;
		
		Matango8_15 m1 = new Matango8_15();
		m1.hp = 50;
		m1.suffix = 'A';
		
		Matango8_15 m2 = new Matango8_15();
		m2.hp = 48;
		m2.suffix = 'B';
		
		//冒険の始まり
		h.slip();
		m1.run();
		m2.run();
		h.run();
		
	}
}
