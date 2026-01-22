
public abstract class Polygon extends Shape {
	/*
	 * ・図形描画アプリケーションの共通機能3つを定義する。
	 * 
	 *・図形描画機能
	 *・長さ測定機能
	 *・内角の和測定機能 ←追加
	 * 
	 */

	protected int angle; //内角(辺)の数を表すprotectedフィールド

	/*
	 *  図形描画機能の定義
	 */
	public abstract void draw();

	/**
	 * 長さ測定機能の定義
	 * @return 長さ
	 */
	public abstract double getPerimeter();

	/**
	 * 
	 * angleフィールドを使い、内角の和を算出する
	 *例）n角形の場合　　(n - 2) * 180
	 * ※追加メソッド
	 * @return 算出された内角の和 (int型)
	 */
	public int getInternalAngle() {
		return (angle - 2) * 180;
	}

}
