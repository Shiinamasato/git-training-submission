//キーボードから入力を受け付ける命令
package java_nikaime.chap2;

public class Main2_16 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("名前を入力してください");
		String name = new java.util.Scanner(System.in).nextLine();
		
		System.out.println("年齢を入力してください");
		int age = new java.util.Scanner(System.in).nextInt();
		
		System.out.println("ようこそ、" + age + "の" + name + "さん");
	}

}
