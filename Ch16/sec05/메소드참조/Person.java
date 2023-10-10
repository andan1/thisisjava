package Ch16.sec05.메소드참조;

public class Person {
	public void action(Calcuable calcuable) {
		double result = calcuable.calc(10, 4);
		System.out.println("결과 : " + result);
	}
}
