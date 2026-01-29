//Wizardクラスを通常の方法でインスタンス化
package java_nyuumon.chap12;

import java_nyuumon.chap12.Wizard;

public class Main12_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Wizard w = new Wizard();
		Matango m = new Matango();
		
		w.name = "アサカ"
		w.attack(m);
		w.filebakk(m);
		
		
	}

}
