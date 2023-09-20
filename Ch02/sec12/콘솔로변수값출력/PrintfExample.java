package Ch02.sec12.콘솔로변수값출력;

public class PrintfExample {

	public static void main(String[] args) {
		int value = 123;
		System.out.printf("상품의 가격 : %d원\n", value);
		System.out.printf("상품의 가격 : %6d원\n", value);
		System.out.printf("상품의 가격 : %-6d원\n", value);
		System.out.printf("상품의 가격 : %06d원\n", value);
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이 : %10.2f\n", 10, area);
		
		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
	}

}
// println(내용) : 괄호 안의 내용을 출력하고 행을 바꿈
// print(내용) : 괄호 안의 내용을 출력하고 행은 안바꿈
// printf("형식문자열", 값1, 값2, ...) : 형식 문자열에 맞추어 뒤의 값을 출력
// %d : 정수
// %10.2f : 정수 7자리 + 소수점 + 소수2자리, 왼쪽 빈자리 공백
// %s : 문자열
// \t : 탭
// \n : 줄바꿈
// %% : %