//王様クラスで利用されるnameフィールド
package java_nyuumon.chap13;

public class King13_7 {
	
	void talk(Hero13_8 h) {
		System.out.println("ようこそ勇者" + h.name + "よ。");  
		//Heroクラスでnameをprivateに設定しているため、コンパイルエラーが発生する
	}
}
