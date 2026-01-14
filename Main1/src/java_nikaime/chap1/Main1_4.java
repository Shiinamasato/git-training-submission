//書き換えてはいけない変数の値を上書きしてしまう
package java_nikaime.chap1;

public class Main1_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double pi = 3.14;
		int pie = 5;
		
		System.out.println("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie * pi);
		System.out.println("パイの半径を倍にします");
		
		pi = 10; //円周率を変更してしている
		System.out.println(pie * pie * pi);
		
		
		
		
	}

}
