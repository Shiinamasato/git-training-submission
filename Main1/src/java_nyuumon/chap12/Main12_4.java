//Wizardにfileballを使わせる（エラー）
package java_nyuumon.chap12;

public class Main12_4 {
	public static void main(String[] args) {
		Wizard w = new Wizard();
		Character c = w; //Characterの箱に代入
		
		Matabgo m = new Matango();
		c.name = "アサカ"
		c.attack(m);
		c.fireball(m); //この行でエラーが発生
	}
}
