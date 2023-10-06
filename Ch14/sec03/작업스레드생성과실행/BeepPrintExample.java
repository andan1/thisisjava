package Ch14.sec03.작업스레드생성과실행;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try { Thread.sleep(500); } catch(Exception e) {}
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}

}
// 메인스레드가 두 가지 작업을처리할 수 없음을 보여줌
// 비프음을 발생시키면서 동시에 프린팅까지 하는 작업이지만
// 메인 스레드는 비프음을 모두 발생한 다음에야 프린팅을 시작한다