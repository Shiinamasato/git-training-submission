//攻撃する相手ごとにattack()を作成
package java_nyuumon.chap12;

public class Hero12_8 extends Character {
	
	public void attack(Matango m) {  //お化けキノコ攻撃用メソッド
		System.out.println(this.name + "の攻撃");
		System.out.println("敵に10ポイントのダメージを与えた");
		m.hp -= 10;
	}
	
	public void attack(Goblin g) {  //ゴブリン攻撃用メソッド
		System.out.println(this.name + "の攻撃");
		System.out.println("敵に10ポイントのダメージを与えた");
		g.hp -= 10;
		
	}
	
	//他モンスターに続く
}
