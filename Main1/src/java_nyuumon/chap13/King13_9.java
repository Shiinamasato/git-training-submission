//talk()でgetName()を呼び出す
package java_nyuumon.chap13;

public class King13_9 {
	void talk(Hero13_8 h) {
		System.out.println("ようこそ勇者" + h.getName() + "よ");  //getName()を経由して、nameフィールドにアクセスをする
	}

}
