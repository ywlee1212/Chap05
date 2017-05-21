package inc.ywlee.oop.prob06;

public abstract class DObject {

	public DObject next;

	public DObject() {
		next = null;
	}

	public  abstract void draw();   
}
