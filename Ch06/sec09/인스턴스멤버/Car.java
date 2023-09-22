package Ch06.sec09.인스턴스멤버;

public class Car {
	String model;
	int speed;
	
	Car(String model) {
		this.model = model;
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		this.setSpeed(100);
		System.out.println(this.model + "가 달립니다.(시속 : " + this.speed + "km/h)");
	}
}
// 인스턴스 멤버 : 객체에 소속된 멤버(객체를 생성해야만 사용할 수 있는 멤버)
// 정적 멤버 : 클래스에 고정된 멤버(객체 없이도 사용할 수 있는 멤버)
// 지금까지 선언한 필드와 메소드는 인스턴스 멤버
// this 키워드 : 생성자와 메소드의 매개변수명이 인스턴스 멤버인 필드명과 동일한 경우
// 인스턴스 필드임을 강조하고자 할 때 this를 주로 사용