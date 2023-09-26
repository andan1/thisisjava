package Ch07.sec10.추상클래스;

public class PhoneExample {

	public static void main(String[] args) {
		// Phone phone = new Phone();  -> 생성 불가
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}

}
// 추상 클래스 : 클래스들의 공통적인 필드나 메소드를 추출해서 선언한 클래스
// 			   실체 클래스의 부모 역할을 한다
// abstract 키워드를 붙이면 됨
// new 연산자를 이용해서 객체를 직접 만들지 못하고 상속을 통해 자식 클래스만 만들 수 있다