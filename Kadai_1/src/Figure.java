
public interface Figure {

	/*
	 * 図形描画機能の定義 ・長さ測定機能の定義
	 */

	/*
	 * 図形描画機能の定義
	 * ※インタフェースの為public abstract は省略
	 * ※abstractの為{}ではなく;で終わる
	 */
	void draw();

	/**
	 * 長さ測定機能の定義
	 * ※インタフェースの為public abstract は省略
	 * ※abstractの為{}ではなく;で終わる
	 * 
	 * @return 長さ
	 */
	double getPerimeter();

}
