package Ch02.sec08.강제타입변환;

public class CastingExample {

	public static void main(String[] args) {
		int var1 = 10;
		byte var2 = (byte) var1;
		// 강제 타입 변환 후에 10이 그대로 유지
		System.out.println(var2);
		
		long var3 = 300;
		int var4 = (int) var3;
		// 강제 타입 변환 후에 300이 그대로 유지
		System.out.println(var4);
		
		int var5 = 65;
		char var6 = (char) var5;
		// 'A'가 출력
		System.out.println(var6);
		
		double var7 = 3.14;
		int var8 = (int) var7;
		// 3이 출력
		System.out.println(var8);
	}

}
// 큰 허용 범위 타입을 작은 허용 범위 타입으로 쪼개어서 저장하는 것
// 작은 허용 범위 타입 = (작은 허용 범위 타입) 큰 허용 범위 타입
// int -> byte
// long -> int
// int -> char
// 실수 -> 정수