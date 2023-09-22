package Ch06.sec10.정적멤버;

public class Calculator {
	static double pi = 3.14159;
	
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x- y;
	}
}
// 정적 멤버 : 메소드 영역의 클래스에 고정적으로 위치하는 멤버
// 			 객체를 생성할 필요 없이 클래스를 통해 바로 사용이 가능
// 선언 : static 키워드를 추가하면 됌
// 객체마다 가지고 있을 필요성이 없는 공용적인 필드는 정적필드로 선언하는 것이 좋음
// 인스턴스 필드를 이용하지 않는 메소드는 정적메소드로 선언하는 것이 좋음
