package inc.ywlee.oop.prob05;

public class MyColorPoint extends MyPoint {

	String myCol;

	public MyColorPoint(int x, int y, String col) {
		super(x, y);
		this.myCol = col;
	}

	@Override
	protected void move(int x, int y) { 
		this.x = x;
		this.y = y; 
	}

	@Override
	protected void reverse() { 
		int temp=this.x;
		this.x=this.y;
		this.y=temp; 
	}
	
	@Override
	protected void show() {
		// TODO Auto-generated method stub
		System.out.println(x+","+y+myCol);
	}

}
