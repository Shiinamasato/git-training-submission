package java_nyuumon.chap9;

public class Main9_6_2 {
//勇者と魔法使いを生み出す(抜粋）
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero h1 = new Hero(); //インスタンスの作成
		h1.name = "ミナト";   //初期値の入力
		h1.hp = 100;          //初期値の入力
		
		Hero h2 = new Hero(); //再度インスタンスの作成
		h2.name = "アサカ";   //再度初期値の入力
		h2.hp = 100;          //再度初期値の入力
		
		Wizard w = new Wizard(); // 再度。。。
		w.name = "スガワラ";     // 再度。。。
		w.hp = 50                // 再度。。。
		
		w.heal(h1);             //ここで初めてメインプログラム
		w.heal(h2); 
		w.heal(h2); 
		
	}

}
