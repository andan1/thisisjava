package Ch14.sec09.스레드풀;

import java.util.concurrent.*;

public class CallableSubmitExample {

	public static void main(String[] args) {
		// ExecutorService 생성
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		// 계산 작업 생성 및 처리 요청
		for (int i = 1; i <= 100; i++) {
			final int idx = i;
			// 익명 구현 객체
			Future<Integer> future = executorService.submit(new Callable<Integer>() {
				@Override
				public Integer call() throws Exception {
					int sum = 0;
					for (int i = 1; i <= idx; i++) {
						sum += i;
					}
					Thread thread = Thread.currentThread();
					System.out.println("[" + thread.getName() + "] 1 ~ " + idx + " 합 계산");
					return sum;
				}
			});
			try {
				int result = future.get();
				System.out.println("\t리턴값 : " + result);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		// ExecutorService 종료
		executorService.shutdown();
	}

}
// Callable의 call() 메소드는 리턴값이 있다
// call()의 리턴 타입은 Callable<T>에서 지정한 T타입 파라미터와 동일한 타입이여야 한다
// submit(Callable<T>task) : Callable을 작업 큐에 저장, 작업 처리 결과를 얻을 수 있도록 Future을 리턴