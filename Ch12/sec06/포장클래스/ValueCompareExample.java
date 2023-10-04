package Ch12.sec06.포장클래스;

public class ValueCompareExample {

	public static void main(String[] args) {
		// -128~127 초과값일 경우
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println("== : " + (obj1 == obj2));
		System.out.println("equals() : " + obj1.equals(obj2));
		System.out.println();
		
		// -128~127 범위값일 경우
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("== : " + (obj3 == obj4));
		System.out.println("equals() : " + obj3.equals(obj4));
	}

}
// 문자열을 기본 타입 값으로 변환
// 포장 값 비교
// 포장 객체는 내부 값을 비교하기 위해 ==와 != 연산자를 사용할 수 없다
// 내부의 값을 비교하는 것이 아닌 포장 객체의 번지를 비교하기 때문