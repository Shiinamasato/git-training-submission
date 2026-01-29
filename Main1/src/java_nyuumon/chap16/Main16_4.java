//Setから要素を取り出すと
package java_nyuumon.chap16;

import java.util.HashSet;
import java.util.Set;


public class Main16_4 {
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタ<>

		Set<String> colors = new HashSet<>();
		colors.add("赤");
		colors.add("青");
		colors.add("黄");  //赤、青、黄の順に格納
		 
		for(String s : colors) {
			System.out.println(s + "→");  //格納の順序と異なる出力
		}
		
	}
}
