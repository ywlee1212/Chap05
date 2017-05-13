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
			System.out.println("��ʰ� �����մϴ�.");
			return false;
		}
		if (numberOfPaper <= 0) {
			System.out.println("�μ� ������ �����մϴ�.");
			return false;
		}
		System.out.println("������ ������ ���");
		amountOfToner -= amountOfTonerToPrint; // ��� �ܷ� ����
		numberOfPaper--; // ���� ���� �ż� ����
		numberOfPrinted++; // �μ��� ���� �ż� ����
		return true;
	}
	
	 public int getAmountOfToner() {
		return amountOfToner;
	}

}
