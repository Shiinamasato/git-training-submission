package java_nyuumon.chap16;
import java.util.ArrayList;

public class Main16_1 {
	public static void main(String[] args) {
		
		ArrayList<Integer> points = new ArrayList<Integer>();  //Integer型でArrayListを宣言
		
		points.add(10);   //自動的にIntegerに変換、格納される
		points.add(80);
		points.add(75);
		for(int i : points) {  //拡張for文も利用可能
			System.out.println(i);
		}
		
		
	}
}
