package Ch07.sec08.다형성;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.tire = new Tire();
		myCar.run();
		
		myCar.tire = new HankookTire();
		myCar.run();
		
		myCar.tire = new KumhoTire();
		myCar.run();
	}

}
// 필드 다형성 : 필드 타입은 동일하지만 대입되는 객체가 달라져서 실행결과가 다양하게 나올 수 있는 것
