package Ch15.sec07.동기화된컬렉션;

import java.util.*;

public class SynchronizedMapExample {

	public static void main(String[] args) {
		// Map 컬렉션 생성
		Map<Integer, String> map = Collections.synchronizedMap(new HashMap<>());
		
		// 작업 스레드 객체 생성
		Thread threadA = new Thread() {
			@Override
			public void run() {
				// 객체 1000개 추가
				for (int i = 1; i <= 1000; i++) {
					map.put(i, "내용" + i);
				}
			}
		};
		
		// 작업 스레드 객체 생성
		Thread threadB = new Thread() {
			@Override
			public void run() {
				// 객체 1000개 추가
				for (int i = 1001; i <= 2000; i++) {
					map.put(i, "내용" + i);
				}
			}
		};
		
		// 작업 스레드 실행
		threadA.start();
		threadB.start();
		
		// 작업 스레드들이 모두 종료될 때까지 메인 스레드를 기다리게 함
		try {
			threadA.join();
			threadB.join();
		} catch (Exception e) {}
		
		// 저장된 총 객체 수 얻기
		int size = map.size();
		System.out.println("총 객체 수 : " + size);
		
		System.out.println();
	}

}
// 동기화된 컬렉션
// 컬렉션 프레임워크의 대부분의 클래스는 싱글 스레드 환경에서 사용할 수 있도록 설계되었다
// Vector와 Hashtable은 동기화된 메소드로 구성되어 있기 때문에 멀티 스레드환경에서 안전하게 요소 처리 가능
// ArrayList, HashSet, HashMap은 동기화된 메소드로 구성되어 있지 않아 멀티 스레드 환경에서 안전하지 않다
// 이때 synchronized로 래핑
// Collections.synchronizedXXX