package Ch16.sec05.메소드참조;

public class Computer {
	public static double staticMethod(double x, double y) {
		return x + y;
	}
	
	public double instanceMethod(double x, double y) {
		return x * y;
	}
}
