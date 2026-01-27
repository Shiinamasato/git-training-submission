//TreeSetから文字列を取り出すと
package java_nyuumon.chap16;

import java.util.Set;
import java.util.TreeSet;


public class Main16_5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Set<String> words = new TreeSet<>();
		
		words.add("dog");
		words.add("cat");
		words.add("wolf");
		words.add("panda");
		
		for(String s : words) {
			System.out.println(s + "→");  //辞書順の出力
		}
	}

}
