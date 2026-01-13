package java_nyuumon.chap9;

public class Main9_2 {
//2つのHero型変数を利用する
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero9_8 h1;
		h1 = new Hero9_8();
		h1.hp = 100;
		Hero9_8 h2;
		h2 = h1;
		h2.hp = 200;
		System.out.println(h1.hp);
		
	}

}
