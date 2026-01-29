//王様クラスの不具合
package java_nyuumon.chap13;

public class King13_3 {
	public void talk(Hero13_4 h) {
		System.out.println("王様:ようこそ我が国へ、勇者" + h.name + "よ。");
		System.out.println("また会おう");
		h.die();   //不具合　h.byeの誤記
	}
}
