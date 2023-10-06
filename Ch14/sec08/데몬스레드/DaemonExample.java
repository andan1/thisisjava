package Ch14.sec08.데몬스레드;

public class DaemonExample {

	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		
		try { Thread.sleep(3000); } catch (InterruptedException e) {}
		
		System.out.println("메인 스레드 종료");
	}

}
// 데몬스레드 : 주 스레드의 작업을 돕는 보조적인 역할을 수행하는 스레드
//			  주 스레드가 종료되면 데몬 스레드도 따라서 자동으로 종료