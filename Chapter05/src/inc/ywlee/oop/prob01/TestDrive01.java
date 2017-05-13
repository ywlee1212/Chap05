package inc.ywlee.oop.prob01;

public class TestDrive01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InkjetPrinter ip = new InkjetPrinter("Officejet Pro", "Epson", Printer.USB, 5, 10);
		LaserPrinter lp = new LaserPrinter("SCX-6x45", "삼성전자", Printer.PARALLEL, 3, 20);
		for (int i = 0; i < 5; i++) {
			ip.print();
			System.out.print("잉크젯프린터>>");
			System.out.print("인쇄용지:" + ip.getNumberOfPaper());
			System.out.print(" 출력매수:" + ip.numberOfPrinted);
			System.out.println(" 잉크잔량:" + ip.getAmountOfInk());

			lp.print();
			System.out.print("레이저프린터>>");
			System.out.print("인쇄용지:" + lp.getNumberOfPaper());
			System.out.print(" 출력매수:" + lp.numberOfPrinted);
			System.out.println(" 토너잔량:" + lp.getAmountOfToner());

		}

	}

}
