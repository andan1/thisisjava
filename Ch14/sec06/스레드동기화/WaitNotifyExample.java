package Ch14.sec06.스레드동기화;

public class WaitNotifyExample {

	public static void main(String[] args) {
		// 공유 작업 객체 생성
		WorkObject workObject = new WorkObject();
		
		// 작업 스레드 생성
		ThreadA threadA = new ThreadA(workObject);
		ThreadB threadB = new ThreadB(workObject);
		
		// 작업 스레드 실행
		threadA.start();
		threadB.start();
	}

}
