//「戦う」と「逃げる」しかできないHeroクラス
package java_nyuumon.chap10;

public class Hero10_1 {
	String name = "ミナト";
	int hp = 100;
	
	//戦う
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃");
		m.hp -= 5;
		System.out.println("5ポイントのダメージを与えた");
	}
	
	//逃げる
	public void run() {
		System.out.println(this.name + "は、逃げ出した");
	}

}
