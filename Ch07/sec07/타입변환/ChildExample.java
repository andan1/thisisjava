package Ch07.sec07.타입변환;

public class ChildExample {

	public static void main(String[] args) {
		// 자식 객체 생성
		Child child = new Child();
		
		//자동 타입 변환
		Parent parent = child;
		
		parent.method1();
		parent.method2();
		// parent.method3();	-> 컴파일 에러
	}

}
