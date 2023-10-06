package Ch14.sec03.작업스레드생성과실행;

import java.awt.Toolkit;

public class BeepPrintExample2 {

	public static void main(String[] args) {
		Thread thread = new Thread() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try { Thread.sleep(500); } catch (Exception e) {}
				}
			}
		};
		
		thread.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch (Exception e) {}
		}
	}

}
// Thread 익명 자식 클래스로 생성