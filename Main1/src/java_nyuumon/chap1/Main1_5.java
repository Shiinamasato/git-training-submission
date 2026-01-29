package java_nyuumon.chap1;

public class Main1_5 {
//円周率に定数を利用する
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		final double PI = 3.14;
		int pie = 5;
		System.out.println("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie * PI);
		System.out.println("パイの半径を倍にします");
		PI = 10;
		System.out.println("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie * PI);
		
	}

}
