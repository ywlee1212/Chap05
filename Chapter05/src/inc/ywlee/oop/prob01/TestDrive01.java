package inc.ywlee.oop.prob01;

public class TestDrive01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InkjetPrinter ip = new InkjetPrinter("Officejet Pro", "Epson", Printer.USB, 5, 10);
		LaserPrinter lp = new LaserPrinter("SCX-6x45", "�Ｚ����", Printer.PARALLEL, 3, 20);
		for (int i = 0; i < 5; i++) {
			ip.print();
			System.out.print("��ũ��������>>");
			System.out.print("�μ����:" + ip.getNumberOfPaper());
			System.out.print(" ��¸ż�:" + ip.numberOfPrinted);
			System.out.println(" ��ũ�ܷ�:" + ip.getAmountOfInk());

			lp.print();
			System.out.print("������������>>");
			System.out.print("�μ����:" + lp.getNumberOfPaper());
			System.out.print(" ��¸ż�:" + lp.numberOfPrinted);
			System.out.println(" ����ܷ�:" + lp.getAmountOfToner());

		}

	}

}
