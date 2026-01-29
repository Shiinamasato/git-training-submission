//Monsterならなんでも攻撃できるattackメソッド
package java_nyuumon.chap12;

public class Hero12_9 extends Character {
	
	public void attack(Monster m) {  //モンスター攻撃用メソッド
		System.out.println(this.name + "の攻撃");
		System.out.println("10ポイントのダメージを与えた");
		m.hp -= 10;
		
		//Monsterクラスを継承しているSlimeやGoblin、今後の敵キャラを対象にしている
	}
	
}
