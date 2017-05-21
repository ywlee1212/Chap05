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
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
			input = new Scanner(System.in);
			selection = input.nextInt();
			switch (selection) {
			case 1:// insert
				System.out.print("도형 종류 : Line(1), Rect(2), Circle(3)>>");
				shape = input.nextInt();
				if (shape < 1 || shape > 3) {
					System.out.println("입력 에러!!");
					break;
				}
				insert(shape);
				break;
			case 2:// delete
				System.out.println("삭제할 도형의 위치>>");
				del = input.nextInt();
				boolean delConfirm = delete(del);
				if (delConfirm) {
					System.out.println("삭제됨");
				} else {
					System.out.println("삭제 오류: 삭제할 수 없습니다.");
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
				System.out.println("번호 입력 오류!!");
			}
		}
		System.out.println("프로그램 종료");
		System.out.println("Good Bye!!");
	}

	private static boolean delete(int del) {
		DObject current = start;
		DObject previous = start;

		// 리스트가 empty인 경우
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

		// 원소가 한개인 경우
		if (start == end) {
			start = end = null;
			return true;
		}

		if (current == start) {// 첫 번째 원소를 삭제하는 경우
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
		case 1:// Line 객체
			obj = new Line();
			break;
		case 2:// Rectangle 객체
			obj = new Rect();
			break;
		case 3:// CIrcle 객체
			obj = new Circle();
		}
		if (start == null) {//리스트가 비어 있는 경우
			start = end = obj;
		} else {
			end.next = obj; //지금 가지고 있는 마지막 원소뒤에 삽입
			end=obj; //이제 end를 방금 만든 것으로 갱신
		}
	}
}
