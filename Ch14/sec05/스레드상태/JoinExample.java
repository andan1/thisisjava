package Ch14.sec05.스레드상태;

public class JoinExample {

	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();
		try { sumThread.join(); } catch (InterruptedException e) {}
		
		System.out.println("1~100 합 : " + sumThread.getSum());
	}

}
// 다른 스레드의 종료를 기다림