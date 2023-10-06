package Ch14.sec05.스레드상태;

public class YieldExample {

	public static void main(String[] args) {
		WorkThread workThreadA = new WorkThread("workThreadA");
		WorkThread workThreadB = new WorkThread("workThreadB");
		workThreadA.start();
		workThreadB.start();
		
		try { Thread.sleep(5000); } catch (InterruptedException e) {}
		workThreadA.work = true;
		
		try { Thread.sleep(10000); } catch (InterruptedException e) {}
		workThreadA.work = true;
	}

}
// 다른 스레드에게 실행 양보