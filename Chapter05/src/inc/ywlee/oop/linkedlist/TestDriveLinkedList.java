package inc.ywlee.oop.linkedlist;

import javax.naming.spi.DirObjectFactory;

import inc.ywlee.oop.prob06.*;

public class TestDriveLinkedList {

	public static void main(String[] args) {
		DObject start, n, obj;

		// 링크드 리스트로 도형 생성하여 연결하기
		start = new Line();
		n = start;
		obj = new Rect();
		n.next = obj;// Rect 객체 연결

		n = obj;
		obj = new Line();
		n.next = obj;// Line 객체 연결

		n = obj;
		obj = new Circle();
		n.next = obj; // Circle 객체 연결

		while (start != null) {
			start.draw();
			start = start.next;
		}
	}
}
