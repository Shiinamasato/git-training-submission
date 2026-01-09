package java_nyuumon.chap5;

public class Main5_10 {
//オーバーロード（引数の型が異なる場合）
	//１つ目のaddメソッド
	public static int add(int x, int y) {
		return x + y;
	}
	//2つ目のaddメソッド
	public static double add(double x, double y) {
		return x + y;
	}
	//3つ目のaddメソッド
	public static String add(String x, String y) {
		return x + y;
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(add(10, 20)); //一つ目のaddメソッドが呼び出される
		System.out.println(add(3.5, 2.7)); //2つ目のaddメソッドが呼び出される
		System.out.println(add("Hello", "World")); //3つ目のaddメソッドが呼び出される
	}

}
