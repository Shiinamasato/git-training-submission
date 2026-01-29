//親インスタンス部分が作れない状況
package java_nyuumon.chap10;

public class Item10_11 {
	String name;
	int price;
	
	public Item10_11(String name) {  //引数1つめのコンストラクタ
		this.name = name;
		this.price = 0;
	}
	
	public Item10_11(String name, int price) {  //引数2つ目のコンストラクタ
		this.name = name;
		this.price = price;
	}
}
