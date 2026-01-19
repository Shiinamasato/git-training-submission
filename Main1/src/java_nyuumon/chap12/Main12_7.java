//多態性と配列を組み合わせて宿屋に泊まる
package java_nyuumon.chap12;

public class Main12_7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Character[] c = new Character[5];
		
		c[0] = new Hero12_8();
		c[1] = new Hero12_8();
		c[2] = new Thief();
		c[3] = new Wizard();
		c[4] = new Wizard();
		
		//宿屋に泊まる
		
		for (Character ch : c) {  //1名ずつ順に取り出し
			ch.hp += 50;
		}
	}

}
