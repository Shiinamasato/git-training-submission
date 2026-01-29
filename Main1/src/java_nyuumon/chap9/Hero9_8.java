//生まれた直後の動作を定義したHeroクラス
package java_nyuumon.chap9;

public class Hero9_8 {
	String name;
	int hp;
	
	public void atacck() {
		
	}
	
	 //↓「newされた直後に自動的に実行される処理」を書いたメソッド＝constructor(コンストラクタ)
	public Hero9_8() {   
		this.hp = 100;  //hpフィールドを100で初期化
		
	}
}
