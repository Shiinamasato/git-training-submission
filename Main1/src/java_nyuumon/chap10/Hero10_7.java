//slip()はオーバーライドできないHeroクラス
package java_nyuumon.chap10;

public class Hero10_7 {
	
	
	public final void slip() {    //final がついているslipメソッドの為子クラスでオーバーライドは禁止
		this.hp -= 5;
		System.out.println(this.name ; "は転んだ");
		System.out.println("5のダメージ");
	}

	public void run() {  //runメソッドは子クラスでオーバーライドが可能
		System.out.println(this.name + "は、逃げ出した");
		
		
	}
	
	
	
	
}
