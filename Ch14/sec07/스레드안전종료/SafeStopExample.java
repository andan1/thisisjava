package Ch14.sec07.스레드안전종료;

public class SafeStopExample {

	public static void main(String[] args) {
		PrintThread printThread = new PrintThread();
		printThread.start();
		
		try { Thread.sleep(3000); } catch (InterruptedException e) {}
		
		// PrintThread를 종료하기 위해 stop 필드값 변경
		printThread.setStop(true);
	}

}
// 실행 중 즉시 종료할 때