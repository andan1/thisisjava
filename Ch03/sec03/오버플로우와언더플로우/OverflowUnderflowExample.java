package Ch03.sec03.오버플로우와언더플로우;

public class OverflowUnderflowExample {

	public static void main(String[] args) {
		byte var1 = 125;
		for (int i = 0; i < 5; i++) {
			var1++;
			System.out.println("var1 : " + var1);
		}
		System.out.println();
		
		byte var2 = -125;
		for (int i = 0; i < 5; i++) {
			var2--;
			System.out.println("var2 : " + var2);
		}
	}

}
// 오버플로우 : 타입이 허용하는 최대값을 벗어나는 것
// 언더플로우 : 타입이 허용하는 최소값을 벗어나는 것
// 해당 정수 타입의 최소값 또는 최대값으로 돌아감