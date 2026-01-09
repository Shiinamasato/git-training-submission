package java_nyuumon.chap1;

public class Main1_4 {
//書き換えてはいけない変数の値を上書きしてしまう
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double pi =3.14;
		int pie = 5;
		System.out.println("半径" + pie + "㎝のパイの面積は、");
		System.out.println(pie * pie *pi);
		System.out.println("パイの潘家にを倍にします");
		pi = 10;
		System.out.println("半径" + pie + "㎝のパイの面積は、");
		System.out.println(pie * pie *pi);
	}

}
