package Ch03.sec09.비트이동연산자;

public class BitShiftExample1 {

	public static void main(String[] args) {
		int num1 = 1;
		int result1 = num1 << 3;
		int result2 = num1 * (int) Math.pow(2, 3);
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		
		int num2 = -8;
		int result3 = num2 >> 3;
		int result4 = num2 / (int) Math.pow(2, 3);
		System.out.println("result3 : " + result3);
		System.out.println("result4 : " + result4);
	}

}
// a << b : 정수 a의 각 비트를 b만큼 왼족으로 이동, 
//			오른쪽 빈자리는 0으로 채움, a * 2의 b제곱
// a >> b : 정수 a의 각 비트를 b만큼 오른쪽으로 이동, 
//			왼쪽 빈자리는 최상위 부호 비트와 같은 값으로 채움, a / 2의 b제곱
// a >>> b : 정수 a의 각 비트를 b만큼 오른쪽으로 이동, 
//			 왼쪽 빈자리는 0으로 채움
