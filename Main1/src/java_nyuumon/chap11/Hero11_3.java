//未来の開発者が作成するHeroクラス
package java_nyuumon.chap11;

public class Hero11_3 extends Character11_12 {
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃");
		System.out.println("敵に10ポイントのダメージを与えた");
		m.hp -= 10;
		
		//Characterのattackメソッドをオーバーライドする
	}
}
