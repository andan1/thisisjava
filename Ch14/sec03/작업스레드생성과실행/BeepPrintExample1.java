package Ch14.sec03.작업스레드생성과실행;

import java.awt.Toolkit;

public class BeepPrintExample1 {
	// 메인스레드 실행
	public static void main(String[] args) {
		// 작업스레드 생성
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try { Thread.sleep(500); } catch (Exception e) {}
				}
			}
		});
		// 작업스레드 실행
		thread.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch (Exception e) {}
		}
	}

}
// 비프음을 발생시키면서 동시에 프린팅하는 코드