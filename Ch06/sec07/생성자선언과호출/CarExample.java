package Ch06.sec07.생성자선언과호출;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car("그랜저", "검정", 250);
	}

}
// Car myCar = new Car(); -> 기본 생성자 호출 못함
// 클래스에 개발한 선언한 생성자가 있다면 컴파일러는 기본 생성자를 추가하지 않는다

// 기본 생성자 : 클래스에 public이 붙으면 기본 생성자도 public이 붙는다
// 생성자 선언 : 객체를 다양하게 초기화 하기 위해 직접 선언한다
// 생성자는 메소드와 비슷한 모양을 가지고 있으나 리턴타입이 없고 클래스 이름과 동일
