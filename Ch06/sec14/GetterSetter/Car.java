package Ch06.sec14.GetterSetter;

public class Car {
	// 필드 선언
	private int speed;
	private boolean stop;
	
	// speed 필드의 getter/setter 선언
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if (speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}
	
	// stop 필드의 getter/setter 선언
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		if (stop == true) this.speed = 0;
	}
}
// 무결정을 깨지 않기 위해
// getter : 필드값이 객체 외부에서 사용하기에 부적절한 경우 메소드로 적절한 값으로 변환해서 리턴
// setter : 외부에서의 필드 접근을 막고 메소드를 통해 필드에 접근하도록 하는 것
// boolean일 경우 getter는 get으로 시작하지않고 is로 시작하는 것이 관례