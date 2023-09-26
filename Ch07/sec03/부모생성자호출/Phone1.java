package Ch07.sec03.부모생성자호출;

public class Phone1 {
	public String model;
	public String color;
	
	public Phone1(String model, String color) {
		this.model = model;
		this.color = color;
		System.out.println("Phone1(String model, String color) 생성자 실행");
	}
}
