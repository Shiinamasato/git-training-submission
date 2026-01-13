package java_nyuumon.chap6;

import CalcLogic;

public class Calc6_4 {
//正しく修正したCalc.java
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 10; int b =2;
		int total = CalcLogic.tasu(a, b);
		int delta = CalcLogic.hiku(a, b);
		System.out.println("足すと"  + total + "、引くと" + delta);
	}

}
