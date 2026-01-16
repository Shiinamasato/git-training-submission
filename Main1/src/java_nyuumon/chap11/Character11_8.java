//Characterを抽象メソッドとして宣言する
package java_nyuumon.chap11;

public abstract class Character11_8 {  //抽象クラスとしてCharacterを宣言
	String name;
	int hp;
	
	public run() {
		System.out.println(this.name + "は、逃げ出した");
	}
	public abstract void attack(Matabgo m);
}
