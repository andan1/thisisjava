package Ch09.sec06.중첩인터페이스;

public class Button {
	// 정적 중첩 인터페이스
	public static interface ClickListener {
		// 추상 메소드
		void onClick();
	}
	// 필드
	private ClickListener clickListener;
	
	// 메소드
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	public void click() {
		this.clickListener.onClick();
	}
}
// 중첩 인터페이스 : 클래스의 멤버로 선언된 인터페이스
// 이유 : 해당 클래스와 긴밀한 관계를 맺는 구현 객체를 만들기 위해