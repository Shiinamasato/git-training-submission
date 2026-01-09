package calcapp.main;

public class Calc6_7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 10; int b =2;
		int total = calcapp.logics.CalcLogic.tasu(a, b);
		int delta = calcapp.logics.CalcLogic.hiku(a, b);
		//所属パッケージ＋クラスを指定して呼び出す
		System.out.println("足すと"  + total + "、引くと" + delta);
	}

}
