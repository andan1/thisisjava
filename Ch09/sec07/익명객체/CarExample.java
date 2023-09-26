package Ch09.sec07.익명객체;

public class CarExample {

	public static void main(String[] args) {
		// Car 객체 생성
		Car car = new Car();
		
		car.run1();
		
		car.run2();
		
		car.run3(new Tire() {
			@Override
			public void roll() {
				System.out.println("익명 자식 Tire 객체 3이 굴러갑니다.");
			}
		});
	}

}
// 익명 객체 : 이름이 없는 객체
// 클래스를 상속하거나 인터페이스를 구현해야만 생성 가능
// 클래스를 상속할 경우 익명 자식 객체
// 인터페이스를 구현할 경우 익명 구현 객체