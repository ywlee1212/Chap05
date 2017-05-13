package inc.ywlee.oop.prob01;

public class InkjetPrinter extends Printer {
	
	static final int amountOfInkToPrint=5;
	private int amountOfInk;

	public InkjetPrinter(String modelName, String maker, int type, int numberOfPaper, int amountOfInk) {
		super(modelName, maker, type, numberOfPaper);
		// TODO Auto-generated constructor stub
		this.amountOfInk=amountOfInk;
	}
	
	public int getAmountOfInk() {
		return amountOfInk;
	}

	@Override
	public boolean print() {
		// TODO Auto-generated method stub
		if(amountOfInk<=0){
			System.out.println("��ũ�� �����մϴ�");
			return false;
		}
		if(numberOfPaper<=0){
			System.out.println("���̰� �����մϴ�.");
			return false;
		}
		System.out.println("��ũ�� ������ ���");
		amountOfInk=amountOfInk-amountOfInkToPrint;
		numberOfPaper--;
		numberOfPrinted++;
		return true;
	}

}
