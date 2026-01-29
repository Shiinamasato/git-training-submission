//継承と実装を同時に行う
package java_nyuumon.chap11;

public class Fool11_17 extends Character implements Human {
	
	//Characterからhpやnameなどのフィールドを継承
	
	//↓Character継承から抽出した抽象メソッドattack()を実装
	public vpid attack(Matango m) {
		System.out.println(this.name + "は戦わず遊んでる");
		
	}
	
	//さらにHumanから継承した4つの抽象メソッドを実装
	public void talk() {…};
	public void watch() {…};
	public void heal() {…};
	public void run() {…};
	
}


