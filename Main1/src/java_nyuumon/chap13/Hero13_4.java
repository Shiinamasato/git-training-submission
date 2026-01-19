//hpフィールドをprivateにしたHeroクラス
package java_nyuumon.chap13;

public class Hero13_4 {
	private int hp;
	String name;
	Sword sword;
	
	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復をした");
	}
}
