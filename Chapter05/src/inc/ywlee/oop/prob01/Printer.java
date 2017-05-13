package inc.ywlee.oop.prob01;

public abstract class Printer {
	
	public static int USB=0;
	public static int PARALLEL=1;
	private int type;
	
	private String modelName;
	private String maker;
	protected int numberOfPrinted;
	protected int numberOfPaper;
	
	public Printer(String modelName, String maker, int type, int numberOfPaper) {
		// TODO Auto-generated constructor stub
		this.modelName=modelName;
		this.maker=maker;
		this.type=type;
		this.numberOfPaper=numberOfPaper;
		this.numberOfPrinted=0;
	}
	
//	public void print(){
//		System.out.println("프린트 입니다.");
//		numberOfPaper--;		
//	}
	
	abstract public boolean print();
	
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getModelName() {
		return modelName;
	}
	
	public void setMaker(String maker){
		this.maker=maker;
	}
	public String getMaker(){
		return this.maker;
	}
	
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
	public int getNumberOfPaper() {
		return numberOfPaper;
	}
	public void setNumberOfPaper(int numberOfPaper) {
		this.numberOfPaper = numberOfPaper;
	}
	
	public void setNumberOfPrinted(int numberOfPrinted) {
		this.numberOfPrinted = numberOfPrinted;
	}
	public int getNumberOfPrinted() {
		return numberOfPrinted;
	}

}
