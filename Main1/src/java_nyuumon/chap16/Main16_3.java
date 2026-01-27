package java_nyuumon.chap16;
import java.util.HashSet;
import java.util.Set;



public class Main16_3 {

	//Setに重複した値を追加しようとすると。。。
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタ<>

		Set<String> colors = new HashSet<>();
		colors.add("赤");
		colors.add("青");
		colors.add("黄");
		colors.add("赤");  //重複分は無視させる
		
		System.out.println("色は" + colors.size() + "種類");  //.size() = 格納されている要素数を返す
		
		
	}

}
