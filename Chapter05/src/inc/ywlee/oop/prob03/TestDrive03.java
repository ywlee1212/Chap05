package inc.ywlee.oop.prob03;

public class TestDrive03 {

	public static void main(String[] args) {
		String temp;
		StringStack  myStack=new StringStack(10);
		myStack.push("�̾��");
		myStack.push("���ؿ�");
		myStack.push("������");
		
		System.out.println((String)myStack.pop());
		System.out.println((String)myStack.pop());
		System.out.println((String)myStack.pop());	
		System.out.println((String)myStack.pop());
		

	}

}
