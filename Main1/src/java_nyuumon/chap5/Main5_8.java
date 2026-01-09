package java_nyuumon.chap5;

public class Main5_8 {
//戻り値をそのまま使う
	public static int add(int x, int y) {  //add(int x, int y)←中のintを忘れない事
		int ans = x + y;
		return ans;
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(add(add(10, 20),add(30,40)));  //add(30, 70)
	}

}