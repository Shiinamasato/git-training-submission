package java_nyuumon.chap10;

public class SuperHero10_3 extends Hero10_1 {
	boolean flying;
	
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった");
	}
	
	public void land() {
		this.flying = false;
		System.out.println("着地した");
	}
	
	
}
