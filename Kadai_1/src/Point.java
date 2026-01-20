
public class Point {

	/*
	 * 座標位置情報を表すクラス
	 */

	private int x; //x座標を表すprivateフィールド
	private int y; //y座標を表すprivateフィールド

	
	/*
	 * 引数なしコンストラクタの定義
	 *x座標、y座標ともに0で初期化する。
	 */
	public Point() {
		int x = 0;
		int y = 0;
	}

	
	/**
	 * x座標、y座標を受け取りその値で初期化するコンストラクタの定義
	 *第1引数で渡された値をxフィールドに代入する。
	 *第2引数で渡された値をyフィールドに代入する。
	 * 
	 * @param x 初期化するx座標
	 * @param y 初期化するｙ座標
	 */
	public Point(int x, int y) {  //Lineクラスから引っ張ってくる仮引数側
		this.x = x;
		this.y = y;
	}

	
	/**
	 * xフィールドの値を返すメソッド
	 * @return x座標
	 */
	public int getX() {
		return this.x;
	}

	
	/**
	 * 引数で渡された値を、xフィールドにセットするメソッド
	 * @param x
	 */
	public void setX(int x) {
		this.x = x;
	}

	
	/**
	 * yフィールドの値を返すメソッド
	 * 
	 * @return y座標
	 */
	public int getY() {
		return this.y;
	}
	
	/*
	 * 引数で渡された値を、yフィールドにセットするメソッド
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	
	
	
}
