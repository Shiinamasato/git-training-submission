//宿屋クラスの不具合
package java_nyuumon.chap13;

public class Inn13_2 {
	
	public void checkIn(Hero13_4 h) {
		h.hp -= 100; //不具合
	}
}
