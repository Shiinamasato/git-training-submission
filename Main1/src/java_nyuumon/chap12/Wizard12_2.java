//Characterを継承して定義されたWizardクラス
package java_nyuumon.chap12;

public class Wizard12_2 extends Character {
	int mp;
	
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃");
		System.out.println("敵に3ポイントのダメージ");
		m.hp -= 3
	}
	
	public void fileball(Matango m) {
		System.out.println(this.name + "の攻撃");
		System.out.println("敵に20ポイントのダメージ");
		m.hp -= 20;
		this.mp -=  5;
		
	}
	

}
