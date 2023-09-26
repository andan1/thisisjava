package Ch09.sec05.바깥멤버접근;

public class A1Example {

	public static void main(String[] args) {
		// A1 객체 생성
		A1 a = new A1();
		
		// A 메소드 호출
		a.useB();
	}

}
// 바깥 클래스의 객체 접근
// 중첩 클래스 내부에서 바깥클래스의 객체를 얻으려면 바깥 클래스 이름에 this를 붙임
