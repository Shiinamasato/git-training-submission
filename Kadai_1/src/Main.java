
public class Main {

	public static void main(String[] args) {

		Circle c = new Circle(100, 100, 20);
		Line l = new Line(0, 0, 100, 100);
		Triangle t = new Triangle(0, 0, 100, 100, 0, 200);
		Rectangle r = new Rectangle(0, 0, 100, 50);
		Square s = new Square(0, 0, 200);

		System.out.println("0,2,3,4,44のいずれかの数字を打ち込んでください");
		int input = new java.util.Scanner(System.in).nextInt();

		System.out.println("図形描画[ 0:円 2:線 3:三角形 4:長方形 44:正方形 ] > " + input); //以降条件分岐

		switch (input) {
		case 0 -> {
			c.draw();
			System.out.println("周囲の長さは" + c.getPerimeter());
		}

		case 2 -> {
			l.draw();
			System.out.println("周囲の長さは" + l.getPerimeter());
		}

		case 3 -> {
			t.draw();
			System.out.println("周囲の長さは" + t.getPerimeter());
			System.out.println("内角の和は" + t.getInternalAngle());
		}

		case 4 -> {
			r.draw();
			System.out.println("周囲の長さは" + r.getPerimeter());
			System.out.println("内角の和は" + r.getInternalAngle());
		}

		case 44 -> {
			s.draw();
			System.out.println("周囲の長さは" + s.getPerimeter());
			System.out.println("内角の和は" + s.getInternalAngle());
		}

		}

	}

}
