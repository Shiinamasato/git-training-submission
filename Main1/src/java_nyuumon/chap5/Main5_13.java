package java_nyuumon.chap5;

public class Main5_13 {
//int型配列を受け取り、
//配列内の要素に１を加える
	public static void incArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i]++;
	//結果をretrunで返していない
		}
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] array = {1, 2, 3};
		incArray(array);  //メソッド実行
		for (int i :array) {
			System.out.println(i);  //arrayの全要素を出力
		}
	}

}
