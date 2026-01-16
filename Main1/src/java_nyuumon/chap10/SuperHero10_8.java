//attack()をオーバーライドしたSuperHero
package java_nyuumon.chap10;

import java_nyuumon.chap9.Hero;

public class SuperHero10_8 extends Hero{
	
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃");
		m.hp -= 5;
		System.out.println("5ポイントのダメージを与えた");
		if(this.flying) {      
			System.out.println(this.name + "の攻撃");    //飛んでいる状態のみ2回目の攻撃をする
			m.hp -= 5;                                   //親インスタンスのattack()の処理内容が変わったら、こっちも修正が必要
			System.out.println("5ポイントのダメージを与えた");
		}
		
	}

}
