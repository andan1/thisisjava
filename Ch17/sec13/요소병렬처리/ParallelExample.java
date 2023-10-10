package Ch17.sec13.요소병렬처리;

import java.util.*;
import java.util.stream.*;

public class ParallelExample {

	public static void main(String[] args) {
		Random random = new Random();
		
		List<Integer> scores = new ArrayList<>();
		for (int i = 0; i < 100000000; i++) {
			scores.add(random.nextInt(101));
		}
		
		double avg = 0.0;
		long startTime = 0;
		long endTime = 0;
		long time = 0;
		
		// 일반 스트림으로 처리
		Stream<Integer> stream = scores.stream();
		startTime = System.nanoTime();
		avg = stream.mapToInt(i -> i.intValue()).average().getAsDouble();
		endTime = System.nanoTime();
		time = endTime - startTime;
		System.out.println("avg : " + avg + ", 일반 스트림 처리 시간 : " + time + "ns");
		
		// 병렬 스트림으로 처리
		Stream<Integer> parallelStream = scores.parallelStream();
		startTime = System.nanoTime();
		avg = parallelStream.mapToInt(i -> i.intValue()).average().getAsDouble();
		endTime = System.nanoTime();
		time = endTime - startTime;
		System.out.println("avg : " + avg + ", 병렬 스트림 처리 시간 : " + time + "ns");
	}

}
// 요소 병렬 처리 : 멀티 코어 CPU 환경에서 전체 요소를 분할해서 각각의 코어가 병렬적으로 처리하는 것
// 목적 : 작업 처리 시간을 줄이는 것
// 데이터 병렬성 : 전체 데이터를 분할해서 서브 데이터셋으로 만들고 이 서브 데이터셋들을 병렬 처리해서 작업을 빨리 끝내는 것
// 자바 병렬 스트림은 데이터 병렬성을 구현한 것
// 작업 병렬성 : 서로 다른 작업을 병렬 처리하는 것
// 자바 병렬 스트림은 병렬 처리하기 위해 포크조인 프레임워크를 사용
// 포크조인 프레임 워크는 병렬 처리를 위해 스레드풀을 사용 
// parallelStream() : 컬렉션(list, set)으로부터 병렬 스트림을 바로 리턴
// parallel() : 기존 스트림을 병렬 처리 스트림으로 변환