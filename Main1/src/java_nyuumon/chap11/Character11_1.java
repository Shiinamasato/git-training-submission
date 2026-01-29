//Characterクラスを作成
package java_nyuumon.chap11;

public class Character11_1 {
	String name;
	int hp;
	
	//逃げる
	public void run() {
		System.out.println(this.name + "は逃げ出した");
	}
	
	//戦う
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃");
		
		m.hp -= //？？ここが詳細未定
				
		System.out.println("敵に？？ポイントのダメージを与えた");
	}
}
