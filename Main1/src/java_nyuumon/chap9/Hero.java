//別のコンストラクタを呼び出す（エラー）
package java_nyuumon;

public class Hero {
	String name;
	int hp;
	
	
	public Hero(String name) { //コンストラクタ①
		this.hp = 100;
		this.name = name;
	}
	
	public Hero() { //コンストラクタ②
		this.Hero = "ダミー"; //コンストラクタを呼び出したいが、この行はエラーになるのでNG！
	}
}
