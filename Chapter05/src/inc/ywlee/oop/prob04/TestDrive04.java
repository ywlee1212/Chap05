package inc.ywlee.oop.prob04;

public class TestDrive04 {

	public static void main(String[] args) {
		CPoint a, b;

		a = new CPoint(2, 3);
		b = new CColorPoint(3, 4, "red");
		a.show();
		b.show();
		System.out.println(a);
		System.out.println(b);

	}

}
