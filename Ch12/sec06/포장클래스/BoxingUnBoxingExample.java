package Ch12.sec06.포장클래스;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		// Boxing
		Integer obj = 100;
		System.out.println("value : " + obj.intValue());
		
		// Unboxing
		int value = obj;
		System.out.println("value : " + value);
		
		// 연산 시 Unboxing
		int result = obj + 100;
		System.out.println("result : " + result);
	}

}
// 박싱과 언박싱
// 포장 객체는 포장하고 있는 기본 타입의 값을 변경할 수 없고 단지 객체로 생성하는 데 목적이 있다
// 컬렉션 객체를 위해
// 박싱 : 기본 타입의 값을 포장 객체로 만드는 과정
// 포장 클래스 변수에 기본 타입 값이 대입될 때
// 언박싱 : 포장 객체에서 기본 타입의 값을 얻어내는 과정
// 기본 타입 변수에 포장 객체가 대입될 때