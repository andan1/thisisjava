package Ch06.sec10.정적멤버;

public class Car {
	// 인스턴스 필드 선언
	int speed;
	
	// 인스턴스 메소드 선언
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	static void simulate() {
		Car myCar = new Car();
		// 인스턴스 멤버 사용
		myCar.speed = 200;
		myCar.run();
	}
	
	public static void main(String[] args) {
		// 정적 메소드 호출
		simulate();
		
		// 객체 생성
		Car myCar = new Car();
		// 인스턴스 멤버 사용
		myCar.speed = 60;
		myCar.run();
	}
}
// 인스턴스 멤버 사용 불가
// 정적 메소드와 정적 블록은 객체가 없어도 실행된다는 특징 때문에
// 내부에 인스턴스 필드나 인스턴스 메소드를 사용할 수 없다
// 또한 객체 자신의 참조인 this도 사용할 수 없다