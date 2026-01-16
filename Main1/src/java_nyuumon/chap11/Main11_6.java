//継承の材料をnewして利用されてしまう
package java_nyuumon.chap11;

public class Main11_6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Character11_12 c = new Character11_12();
		Matango m = new Matango('A');
		c.attack(m);
		
	}

}
