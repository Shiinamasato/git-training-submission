//親クラスのattackを呼び出す
package java_nyuumon.chap10;

public class SuperHero10_9 extends Hero {
	pubric void attack(Matango m) {
		
		super.attack(m); //親インスタンス部分のattack()を呼び出し
		if(this.flying) {
			super.attack(m); //親インスタンス部分のattack()を呼び出し
			
		}
		
	}
	

}
