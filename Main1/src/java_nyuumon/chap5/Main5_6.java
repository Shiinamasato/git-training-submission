package java_nyuumon.chap5;

public class Main5_6 {
//引数を使わずに値を渡せないのか(\エラー)
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int x = 100;
		int y = 10;
		add();
	}
	public static void add() {
		int ans = x + y;
		System.out.println(x + "+" y + "=" ans);
	}
}
