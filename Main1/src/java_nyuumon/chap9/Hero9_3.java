//次にHeroクラスを定義する
package java_nyuumon.chap9;

public class Hero9_3 {
	String name;
	int hp;
	Sword Sword;  //勇者が装備している剣の情報
	public void attack() {
		System.out.println(this.name + "は攻撃した！");
		System.out.println("敵に5ポイントのダメージを与えた");
	}
	
	
	
}
