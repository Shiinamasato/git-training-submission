
public class Rectangle extends Polygon {

	/*
	 * ・1つの位置座標と幅、長さを指定することで、長方形(矩形)を描画するクラス
	 *・長方形描画メソッド
	 *・長方形の周囲の長さを取得するメソッド
	 */

	protected Point p; //・長方形の基準の位置を表すPoint型protectedフィールド
	protected int width; //・長方形の横幅を表すprotectedフィールド
	protected int height; //・長方形の縦幅を表すprotectedフィールド

	/**
	 * 第1引数と第2引数で受け取ったデータを用いて、1つのPointオブジェクトを生成し、pフィールドに代入する。
	 *第3引数と第4引数をそれぞれwidthフィールド、heightフィールドに代入する。
	 *スーパークラス内で定義されているangleフィールドに4を代入する。
	 *
	 * @param x  pフィールドに代入するPoint型変数のx座標値
	 * @param y  pフィールドに代入するPoint型変数のy座標値
	 * @param width  長方形の横幅
	 * @param height  長方形の縦幅
	 */
	public Rectangle(int x, int y, int width, int height) {
		this.p = new Point(x, y);
		this.width = width;
		this.height = height;
		angle = 4;
	}

	/**
	 * 以下のようなメッセージを表示する。
	 *出力例：
	 *"[長方形(矩形)を描画] 点(0,0)を基準として幅100、高さ50の長方形"
	 */
	public void draw() {
		System.out.println("[長方形(矩形)を描画]点(" + p.getX() + "," + p.getY() + ")を基準として"
				+ "幅" + width + "、高さ" + height + "の長方形");
	}

	/**
	 * 横幅と縦幅を使い、以下の計算式で算出した結果を返す。
	 *( width + height ) * 2
	 * 
	 * @return 計算結果
	 */
	public double getPerimeter() {

		return (width + height) * 2;
	}
}
