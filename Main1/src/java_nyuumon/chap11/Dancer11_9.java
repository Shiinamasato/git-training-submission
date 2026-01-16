//抽象メソッドのオーバーライド忘れ（エラー）
package java_nyuumon.chap11;

public class Dancer11_9 extends Character11_12 {
	public void dance() {
		System.out.println(this.name + "は、情熱的に踊った");
	}
	
} //attack()をオーバーライドし忘れている
