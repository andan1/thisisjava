package Ch03.sec05.나눗셈연산후NaN과Infinity처리;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		double z = x / y;
		// double z = x % y;
		// System.out.println(z + 2);
		
		if (Double.isFinite(z) || Double.isNaN(z)) {
			System.out.println("값 산출 불가");
		} else {
			System.out.println(z + 2);
		}
		
	}

}
// 좌측 피연산자가 정수이고 우측 피연산자가 0일 경우 예외가 발생
// 좌측 피연산자가 실수이거나 우측 피연산자가 실수면 Infinity or NaN 