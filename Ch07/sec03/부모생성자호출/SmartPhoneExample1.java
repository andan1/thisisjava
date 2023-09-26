package Ch07.sec03.부모생성자호출;

public class SmartPhoneExample1 {

	public static void main(String[] args) {
		SmartPhone1 myPhone = new SmartPhone1("갤럭시", "은색");
		
		System.out.println("모델 : " + myPhone.model);
		System.out.println("색상 : " + myPhone.color);
	}

}
