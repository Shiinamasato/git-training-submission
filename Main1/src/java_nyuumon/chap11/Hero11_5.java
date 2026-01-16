//オーバーライドしたつもりのHeroクラス
package java_nyuumon.chap11;

public class Hero11_5 extends Character11_12{

	public void atack(Matango m) {  //attackの誤字
		System.out.println(this.name + "の攻撃");
		System.out.println("敵に10ポイントのダメージを与えた");
		m.hp -= 10;
	}

}
