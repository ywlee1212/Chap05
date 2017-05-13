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
			System.out.println("잉크가 부족합니다");
			return false;
		}
		if(numberOfPaper<=0){
			System.out.println("종이가 부족합니다.");
			return false;
		}
		System.out.println("잉크젯 프린터 출력");
		amountOfInk=amountOfInk-amountOfInkToPrint;
		numberOfPaper--;
		numberOfPrinted++;
		return true;
	}

}
