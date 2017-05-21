package inc.ywlee.oop.linkedlist;

import javax.naming.spi.DirObjectFactory;

import inc.ywlee.oop.prob06.*;

public class TestDriveLinkedList {

	public static void main(String[] args) {
		DObject start, n, obj;

		// ��ũ�� ����Ʈ�� ���� �����Ͽ� �����ϱ�
		start = new Line();
		n = start;
		obj = new Rect();
		n.next = obj;// Rect ��ü ����

		n = obj;
		obj = new Line();
		n.next = obj;// Line ��ü ����

		n = obj;
		obj = new Circle();
		n.next = obj; // Circle ��ü ����

		while (start != null) {
			start.draw();
			start = start.next;
		}
	}
}
