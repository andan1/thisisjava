package Ch02.sec01.변수선언;

public class VariableInitializationExample {

	public static void main(String[] args) {
		// 변수 value 선언
		int value;
		
		// 연산 결과를 변수 result의 초기값으로 대입
		int result = value + 10;
		
		// 변수 result 값을 읽고 콘솔에 출력
		System.out.println(result);
	}

}
// 변수 : 하나의 값을 저장할 수 있는 메모리 번지에 붙여진 이름
// 변수 초기화 : 최초로 값을 대입하는 행위
// 초기값 : 이때의 값
// 초기화되지 않은 변수는 아직 메모리에 할당되지 않았기 때문에 변수를 통해 메모리 값을 읽을 수 없다

// 캐멀 스타일 : 자바 소스 파일명은 대문자로 시작하는 것이 관례
//			   변수명은 소문자로 시작하는 것이 관례