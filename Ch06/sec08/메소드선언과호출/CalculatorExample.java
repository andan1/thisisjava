package Ch06.sec08.메소드선언과호출;

public class CalculatorExample {

	public static void main(String[] args) {
		// 객체 생성
		Calculator myCalc = new Calculator();
		
		// void 메소드 호출
		myCalc.powerOn();
		
		// return 메소드 호출
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1 : " + result1);
		
		int x = 10;
		int y = 4;
		
		double result2 = myCalc.divide(x, y);
		System.out.println("result2 : " + result2);
		
		myCalc.powerOff();
	}

}
// 메소드 호출 : 타입 변수 = 메소드();