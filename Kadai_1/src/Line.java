
public class Line implements Figure { //※Figureクラスを継承

	/*
	 * ・2つの座標データを指定することで、線を描画するクラス
	 * ・線描画メソッド
	 * ・線の長さを取得するメソッド
	 */

	private Point p1; //線の始点を表すPoint型privateフィールド
	private Point p2; //線の終点を表すPoint型privateフィールド

	/*
	 * 引数なしコンストラクタの定義 
	 * p1(x,y座標)、p2(x,y座標)全て0で初期化する。
	 * ※voidは書かない
	 */
	public Line() {
		this.p1 = new Point(0, 0);
		this.p2 = new Point(0, 0);
	}

	/**
	 * 引数で受け取ったデータを用いて、2つのPointオブジェクトを生成。
	 *p1フィールドとp2フィールドにそれぞれを代入する。
	 *  
	 * @param x1  p1のx座標
	 * @param y1  p1のy座標
	 * @param x2  p2のx座標
	 * @param y2  p2のy座標
	 */
	public Line(int x1, int y1, int x2, int y2) {
		this.p1 = new Point(x1, y1);
		this.p2 = new Point(x2, y2);
	}

	/**
	 * 
	 * 以下のようなメッセージを表示する。なお、始点をp1、終点をp2とする。
	 *出力例：
	 *"[線を描画] 始点(0,0)から終点(100,100)まで"
	 *
	 *※p1＝始点  p2＝終点
	 */
	public void draw() {
		System.out.println("[線を描画]始点(" + p1.getX() + "," + p1.getX() + ")から終点(" + p2.getX() + "," + p2.getY() + ")まで");
	}

	/**
	 * 始点データと終点データを使い、以下の計算式で算出した結果を返す。
	 *(( 終点のx座標 - 始点のx座標 ) ^2
	 *+ ( 終点のy座標 - 始点のy座標 ) ^2 ) の平方根
	 *累　乗...Math.powメソッド
	 **平方根...Math.sqrtメソッド
	 * 
	 *@return　計算結果
	 *※※式が不明
	 */

	public double getPerimeter() {

		return Math.sqrt(
				Math.pow(p2.getX() - p1.getX(), 2) +
						Math.pow(p2.getY() - p1.getY(), 2));
	}

}
