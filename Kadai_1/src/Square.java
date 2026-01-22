
public class Square extends Rectangle {

	/*
	 *1つの位置座標と幅を指定することで、正方形を描画するクラス
	 *正方形描画メソッド
	 */

	/**
	 * スーパークラスRectangleのコンストラクタを明示的に呼び出す。
	 *引数は以下の通りとする。
	 *第1引数...Point型データのx座標
	 *第2引数...Point型データのy座標
	 *第3引数...正方形の一辺の長さ
	 *第4引数...正方形の一辺の長さ
	 *
	 * @param x  pフィールドに代入するPoint型変数のx座標値
	 * @param y  pフィールドに代入するPoint型変数のy座標値
	 * @param width  正方形の一辺の長さ
	 */
	public Square(int x, int y, int width) {

		super(x, y, width, width);

	}

	public void draw() {
		System.out.println("[正方形を描画]点(" + p.getX() + "," + p.getY() + ")を基準として幅・高さ" + width + "の正方形");
	}
}
