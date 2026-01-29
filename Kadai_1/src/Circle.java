
public class Circle extends Shape {

	/*
	 *・中心座標と半径を指定することで、円を描画するクラス
	 *・円描画メソッド
	 *・円周の長さを取得するメソッド
	 */

	private Point center; //円の中心を表すPoint型privateフィールド
	private int radius; //円の半径を表すprivateフィールド

	/**
	 *引数なしコンストラクタの定義 ※オブジェクトの為newする。
	 *center(x,y座標)、半径全て0で初期化する
	 * ※int centerX; int centerY;をPoint centerとまとめている
	 * ※Pointクラスはすでに「座標を表すためのクラス」と存在している
	 * ※
	 * 
	 */
	public Circle() {
		this.center = new Point(0, 0); //中心点
		this.radius = 0; //半径 　※基本型の為newではない 		
	}

	/**
	 * 引数x,yで受け取ったデータを用いて、1つのPointオブジェクトを生成し、centerフィールドに代入する。
	 *引数rもradiusフィールドに代入する。
	 * 
	 * @param x centerフィールドに代入するPoint型 x
	 * @param y centerフィールドに代入するPoint型 y
	 * @param r 円の半径
	 */
	public Circle(int x, int y, int r) {
		this.center = new Point(x, y);
		this.radius = r;
	}

	/*
	 * 
	 *以下のようなメッセージを表示する。
	 *出力例：
	 *　"[円を描画] 中心点(100,100)から半径20" 
	 */
	public void draw() {
		System.out.println("[円を描画] 中心点(" + center.getX() + "," + center.getY() + ")から半径" + radius);
	}

	/**
	 * 
	 *半径を使い、以下の計算式で算出した結果を返す
	 *半径 * 2 * 円周率
	 *円周率...Math.PIフィールド 
	 *※計算式をreturnでdoubleに返している。
	 * 
	 * @return 円周の長さ
	 */
	public double getPerimeter() {

		return radius * 2 * Math.PI;
	}

}
