package java_nyuumon.chap5;

public class Main5_12 {
//引数に配列を受け取るメソッド
	public static void printArray(int[] array) {
		for (int element : array) {
			System.out.println(element);
		}
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] array = {1, 2, 3};
		printArray(array);  //配列を渡す
	}

}
