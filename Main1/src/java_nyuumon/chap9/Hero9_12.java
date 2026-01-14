//コンストラクタのオーバーロード
package java_nyuumon.chap9;

public class Hero9_12 {
	String name;
	int hp;
	
	
	public Hero9_12(String name) { //以前からあったコンストラクタ①
		this.hp = 100;
		this.name = name;
	}
	
	public Hero9_12() { //新しく作ったコンストラクタ②
		this.hp = 100;
		this.name = "ダミー"; //ダミーの名前を設定する
	}
}
