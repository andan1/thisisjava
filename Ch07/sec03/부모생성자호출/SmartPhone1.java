package Ch07.sec03.부모생성자호출;

public class SmartPhone1 extends Phone1 {
	// 자식 생성자 선언
	public SmartPhone1(String model, String color) {
		super(model, color);
		System.out.println("SmartPhone1(String model, String color) 생성자 실행됨");
	}
}
