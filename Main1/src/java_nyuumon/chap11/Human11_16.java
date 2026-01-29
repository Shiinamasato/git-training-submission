//インタフェースを継承する
package java_nyuumon.chap11;

public interface Human11_16 extends Creature {
	
	void talk();   //↓これらの抽象メソッドを追加
	void watch();
	void heal();
	//さらに、親インタフェースからrun()を継承
}
