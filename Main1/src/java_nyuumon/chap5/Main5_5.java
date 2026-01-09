package java_nyuumon.chap5;

public class Main5_5 {
//複数の引数を渡す
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		add(100, 20);
		add(200, 50);
	}
	//複数の値を受け取るaddメソッド
	public static void add(int x, int y) {
		int ans = x + y;
		System.out.println(x + "+" + y + "=" + ans);
	}

}
