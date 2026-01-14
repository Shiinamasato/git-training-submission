//コンストラクタをオーバーロードしたクラスの利用
package java_nyuumon.chap9;

public class Main9_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero9_12 h1 = new Hero9_12("ミナト");  //文字列引数があるのでコンストラクタ①が呼び出される
		System.out.println(h1.name);
		
		Hero9_12 h2 = new Hero9_12();  //引数がないのでコンストラクタ②が呼び出される
		System.out.println(h2.name);
	}

}
