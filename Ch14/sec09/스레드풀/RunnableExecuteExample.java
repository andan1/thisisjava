package Ch14.sec09.스레드풀;

import java.util.concurrent.*;

public class RunnableExecuteExample {

	public static void main(String[] args) {
		// 1000개의 메일 생성
		String[][] mails = new String[1000][3];
		for (int i = 0; i < mails.length; i++) {
			mails[i][0] = "admin@my.com";
			mails[i][1] = "member" + i + "@my.com";
			mails[i][2] = "신상품 입고";
		}
		
		// ExecutorService 생성
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		// 이메일을 보내는 작업 생성 및 처리 요청
		for (int i = 0; i < 1000; i++) {
			final int idx = i;
			// 익명 구현 객체
			executorService.execute(new Runnable() {
				@Override
				public void run() {
					Thread thread = Thread.currentThread();
					String from = mails[idx][0];
					String to = mails[idx][1];
					String content = mails[idx][2];
					System.out.println("[" + thread.getName() + "] " + from + " ==> " + to + " : " + content);
				}
			});
		}
		// ExecutorService 종료
		executorService.shutdown();
	}

}
// 작업 생성과 처리 요청
// Runnable의 run() 메소드는 리턴값이 없다
// execute(Runnable command) : Runnable을 작업 큐에 저장, 작업 처리 결과를 리턴하지 않음