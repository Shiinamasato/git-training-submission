//別のコンストラクタを呼び出す（エラー）
package java_nyuumon;

public class Hero9_15_ok {
	String name;
	int hp;
	
	
	public Hero9_15_ok(String name) { //コンストラクタ①
		this.hp = 100;
		this.name = name;
	}
	
	public Hero9_15_ok() { //コンストラクタ②
		this("ダミー"); //コンストラクタ①を呼び出すようにJVMに依頼する
	}
}
