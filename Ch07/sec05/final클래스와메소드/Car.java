package Ch07.sec05.final클래스와메소드;

public class Car {
	public int speed;
	
	public void speedUp() {
		speed += 1;
	}
	
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}
}
// final 클래스
// 최종적인 클래스이므로 더 이상 상속할 수 없는 클래스가 된다
// final 메소드
// 최종적인 메소드이므로 오버라이딩할 수 없는 메소드가 된다