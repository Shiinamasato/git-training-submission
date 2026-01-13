

public class Main {
//剣を装備した勇者を呼び出す
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;
		
		Hero h = new Hero();
		h.name = "ミナト";
		h.hp = 100;
		h.Sword = s;  //swordフィールドに生成済みの剣インスタンス(の番地)を代入
		
		System.out.println("現在の武器は" + h.Sword.name);//勇者「の」剣「の」名前
		
	}

}
