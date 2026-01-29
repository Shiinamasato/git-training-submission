public class Wizard9_5{
//回復魔法を使えるWizardクラス
	String name;
	int hp;
	
	public void  heal(Hero9_8 h) {
		h.hp += 10;
		System.out.println(h.name + "のHPを10回復した！");
	}
}
