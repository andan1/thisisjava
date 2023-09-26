package Ch07.sec03.부모생성자호출;

public class SmartPhone extends Phone{
	// 자식생성자 선언
	public SmartPhone(String model, String color) {
		super();
		this.model = model;
		this.color = color;
		System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
	}
}
