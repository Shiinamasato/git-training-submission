//イテレーターを使ったArrayListの繰り返し処理
package java_nyuumon.chap16;

import java.util.ArrayList;
import java.util.Iterator;

public class Main16_2 {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		
		names.add("奏");
		names.add("朝香");
		names.add("菅原");
		
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {    //矢印を次に進められるなら繰り返す
			String e = it.next();   //矢印を次に進め。内容を取り出す。
			System.out.println(e);
		}
		
	}
}
