package java_nyuumon.chap11;

public class Dancer11_10 extends Character11_12 {
	public void dance() {
		System.out.println(this.name + "は情熱的に踊った");
		
	}
	
	public void attack(Matango m) {  //親から継承した「詳細未定のattack();」を上書きする
		System.out.println(this.name + "のこうげき");
		System.out.println("敵に3ポイントのダメージ");
		m.hp -= 3;
		
	
	}
}
