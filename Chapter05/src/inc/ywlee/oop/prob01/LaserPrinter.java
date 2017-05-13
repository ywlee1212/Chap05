package inc.ywlee.oop.prob01;

public class LaserPrinter  extends Printer{
	
	static final int amountOfTonerToPrint = 10;
	private int amountOfToner;

	public LaserPrinter(String modelName, String maker, int type, int numberOfPaper,int amountOfToner) {
		super(modelName, maker, type, numberOfPaper);
		// TODO Auto-generated constructor stub
		this.amountOfToner=amountOfToner;
	}

	@Override
	public boolean print() {
		if (amountOfToner <= 0) {
			System.out.println("토너가 부족합니다.");
			return false;
		}
		if (numberOfPaper <= 0) {
			System.out.println("인쇄 용지가 부족합니다.");
			return false;
		}
		System.out.println("레이저 프린터 출력");
		amountOfToner -= amountOfTonerToPrint; // 토너 잔량 감소
		numberOfPaper--; // 남은 종이 매수 감소
		numberOfPrinted++; // 인쇄한 종이 매수 증가
		return true;
	}
	
	 public int getAmountOfToner() {
		return amountOfToner;
	}

}
