package Ch02.sec11.변수사용범위;

public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 = 15;
		if (v1 > 10) {
			int v2 = v1 - 10;
		}
		int v3 = v1 + v2 + 5; // v2 변수를 사용할 수 없어서 컴파일 에러
	}

}
// 중괄호 {} 블록 내에서 선언된 변수는 해당 중괄호 {} 블록 내에서만 사용 가능