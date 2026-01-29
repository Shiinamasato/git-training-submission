//String型をint型に変換する命令
package java_nikaime.chap2;

public class Main2_14 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String age = "31";
		int n = Integer.parseInt(age);  //"31"(Str)→31(int)に変換
		
		System.out.println("あなたは来年" + (n + 1) + "歳になりますね。");
	}

}
