package Ch06.sec08.메소드선언과호출;

public class Calculator1Example {

	public static void main(String[] args) {
		Calculator1 myCalcu = new Calculator1();
		
		double result1 = myCalcu.areaRectangle(10);
		double result2 = myCalcu.areaRectangle(10, 20);
		
		System.out.println("정사각형 넓이 = " + result1);
		System.out.println("직사각형 넓이 = " + result2);
	}

}
