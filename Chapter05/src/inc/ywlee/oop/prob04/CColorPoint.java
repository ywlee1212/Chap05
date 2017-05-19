package inc.ywlee.oop.prob04;

public class CColorPoint extends CPoint {
	
	String myCol;

	public CColorPoint(int a, int b, String col) {
		super(a, b);
		this.myCol=col; 
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("(" + a + "," + b + ")"+myCol); 
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "("+a+","+b+")¿‘¥œ¥Ÿ";
	}

}
