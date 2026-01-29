//変数の再代入
package java_nikaime.chap1;

public class Main1_3 {
	public static void main(String[] args) {
		int age = 20;  //変数ageを20で初期化
		System.out.println("私の年齢委は" + age);
		
		age =31;  //変数ageに再代入している（上書き）
		System.out.println("本当の年齢は" + age);
	}
}
