package inc.ywlee.oop.prob03;

public class StringStack implements Stack {

	String[] element;
	int numberOfElement;
	private int count;
	final int STACKMAXSIZE;

	public StringStack(int capacity) {
		this.STACKMAXSIZE=capacity;
		element = new String[STACKMAXSIZE];
		count = 0;
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		numberOfElement = element.length;
		return numberOfElement;
	}

	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		if (count == 0) {
			return null;
			// 스택이 비어 있음
		}
		count--;
		return element[count];
	}

	@Override
	public boolean push(Object ob) {
		// TODO Auto-generated method stub
		if (count == element.length) {
			// 스택이 꽉 찼음
			return false;
		}
		element[count] = (String) ob;
		System.out.print(count);
		System.out.println("  " + element[count]);
		count++;
		return true;
	}

	public boolean isFull(int count) {
		if (count == (element.length - 1)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isEmplty() {
		if (count < 0) {
			return true;
		} else {
			return false;
		}
	}

}
