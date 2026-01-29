public class Main9_6 {
//勇者と魔法使いを生み出す
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero9_8 h1 = new Hero9_8();
		h1.name = "ミナト";
		h1.hp = 100;
		
		Hero9_8 h2 = new Hero9_8();
		h2.name = "アサカ";
		h2.hp = 100;
		
		Wizard w = new Wizard();
		w.name = "スガワラ";
		w.hp = 50;
		
		w.heal(h1); //ミナトを回復させる100→110
		w.heal(h2); //アサカを回復させる100→110
		w.heal(h2); //アサカを回復させる110→120
		
	}

}
