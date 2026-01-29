//インタフェースを継承したクラスの定義
package java_nyuumon.chap11;

public interface KyotoCleaningShop11_15 implements CleaningService{
	string ownerName;
	string address;
	srring phone;
	
	/*シャツを洗う*/
	public Shirt washShirt(Shirt s) {
		//大型洗濯機15分//
		retuen s;
	}
	
	/*タオルを洗う*/
	public Towl washTowl(Towl t) {
		//大型洗濯機//
		return t;
	}
	
	/*コートを洗う*/
	public Coat washCoat(Coat c) {
		//ドライ20分//
		return c;
	}
	
}
