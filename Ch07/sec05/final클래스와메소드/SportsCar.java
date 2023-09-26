package Ch07.sec05.final클래스와메소드;

public class SportsCar extends Car {
	@Override
	public void speedUp() {
		speed += 10;
	}
}
// stop()은 오버라이딩 불가능