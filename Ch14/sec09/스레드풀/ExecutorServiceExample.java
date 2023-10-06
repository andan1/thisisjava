package Ch14.sec09.스레드풀;

import java.util.concurrent.*;

public class ExecutorServiceExample {

	public static void main(String[] args) {
		// 스레드풀 생성
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		// 작업 생성과 처리 요청
		// 스레드풀 종료
		executorService.shutdownNow();
	}

}
// 스레드풀 : 병렬 작업 증가로 인한 스레드의 폭증을 막기위해
// 작업 처리에 사용되는 스레드를 제한된 개수만큼 정해놓고 작업 큐에 들어오는 작업들을 스레드가 하나씩 맡아 처리하는 방식
// 이렇게 하면 작업량이 증가해도 스레드의 개수가 늘어나지 않음
// 스레드풀 생성
// newCachedThreadPool(), newFixedThreadPool()
// 스레드풀 종료
// shutdown(), shutdownNow()