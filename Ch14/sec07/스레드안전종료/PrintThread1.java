package Ch14.sec07.스레드안전종료;

public class PrintThread1 extends Thread {
	public void run() {
		while (true) {
			System.out.println("실행 중");
			// 일시정지를 만듦
			if (Thread.interrupted()) {
				break;
			}
		}
		
		System.out.println("리소스 정리");
		System.out.println("실행 종료");
		
	}
}