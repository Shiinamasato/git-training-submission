
public abstract class Shape implements Figure {

	/*
	 * ・図形描画アプリケーションの共通機能2つを定義する。
	 *・図形描画機能
	 *・長さ測定機能
	 */

	/**
	 * 図形描画機能の定義 
	 *※interfaceが取れたためpublic abstractを追記。
	 */
	public abstract void draw();

	/**
	 * 長さ測定機能の定義 
	 * ※interfaceが取れたためpublic abstractを追記。
	 * 
	 * @return 長さ
	 */
	public abstract double getPerimeter();

}