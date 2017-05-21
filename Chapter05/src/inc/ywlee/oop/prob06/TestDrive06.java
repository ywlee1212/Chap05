package inc.ywlee.oop.prob06;

import java.util.Scanner;

public class TestDrive06 {

	static DObject start = null;
	static DObject end = null;

	public static void main(String[] args) {

		Scanner input;
		int selection, shape, del;
		boolean repeat = true;

		int i = 0;

		while (repeat) {
			System.out.print("����(1), ����(2), ��� ����(3), ����(4)>>");
			input = new Scanner(System.in);
			selection = input.nextInt();
			switch (selection) {
			case 1:// insert
				System.out.print("���� ���� : Line(1), Rect(2), Circle(3)>>");
				shape = input.nextInt();
				if (shape < 1 || shape > 3) {
					System.out.println("�Է� ����!!");
					break;
				}
				insert(shape);
				break;
			case 2:// delete
				System.out.println("������ ������ ��ġ>>");
				del = input.nextInt();
				boolean delConfirm = delete(del);
				if (delConfirm) {
					System.out.println("������");
				} else {
					System.out.println("���� ����: ������ �� �����ϴ�.");
				}

				break;
			case 3:// show all list
				DObject p = start;
				while (p != null) {
					p.draw();
					p = p.next;
				}
				break;
			case 4:// termination
				repeat = false;
				break;

			default:
				System.out.println("��ȣ �Է� ����!!");
			}
		}
		System.out.println("���α׷� ����");
		System.out.println("Good Bye!!");
	}

	private static boolean delete(int del) {
		DObject current = start;
		DObject previous = start;

		// ����Ʈ�� empty�� ���
		if (start == null) {
			return false;
		}

		for (int i = 0; i < del; i++) {
			previous = current;
			current = current.next;
			if (current == null) {
				return false;
			}
		}

		// ���Ұ� �Ѱ��� ���
		if (start == end) {
			start = end = null;
			return true;
		}

		if (current == start) {// ù ��° ���Ҹ� �����ϴ� ���
			start = start.next;
		} else if (current == end) {
			end = previous;
			end.next = null;
		} else {
			previous.next = current.next;
		}
		return true;
	}

	private static void insert(int shape) {
		DObject obj = null;
		switch (shape) {
		case 1:// Line ��ü
			obj = new Line();
			break;
		case 2:// Rectangle ��ü
			obj = new Rect();
			break;
		case 3:// CIrcle ��ü
			obj = new Circle();
		}
		if (start == null) {//����Ʈ�� ��� �ִ� ���
			start = end = obj;
		} else {
			end.next = obj; //���� ������ �ִ� ������ ���ҵڿ� ����
			end=obj; //���� end�� ��� ���� ������ ����
		}
	}
}
