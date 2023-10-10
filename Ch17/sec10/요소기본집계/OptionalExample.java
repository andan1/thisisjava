package Ch17.sec10.요소기본집계;

import java.util.*;

public class OptionalExample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		/*
		// 예외 발생 (NoSuchElementException)
		double avg = list.stream()
				.mapToInt(Integer :: intValue)
				.average()
				.getAsDouble();
		*/
		
		// 방법1
		OptionalDouble optional = list.stream()
				.mapToInt(Integer :: intValue)
				.average();
		if (optional.isPresent()) {
			System.out.println("방법1_평균 : " + optional.getAsDouble());
		} else {
			System.out.println("방법1_평균 : 0.0");
		}
		
		// 방법2
		double avg = list.stream()
				.mapToInt(Integer :: intValue)
				.average()
				.orElse(0.0);
		System.out.println("방법2_평균 : " + avg);
		
		// 방법3
		list.stream()
			.mapToInt(Integer :: intValue)
			.average()
			.ifPresent(a -> System.out.println("방법3_평균 : " + a));
	}

}
// Optional 클래스
// 단순히 집계값만 저장하는 것이 아니라, 
// 집계값이 존재하지 않을 경우 디폴트 값을 설정하거나 집계값을 처리하는 Consumer를 등록할 수 있다

// 1. isPresent() 메소드가 true를 리턴할 때만 집계값을 얻는다
// 2. orElse() 메소드로 집계값이 없을 경우를 대비해서 디폴트 값을 정해놓는다
// 3. ifPresent() 메소드로 집계값이 있을 경우에만 동작하는 Consumer 람다식을 제공한다

// isPresent() : 집계값이 있는지 여부
// orElse() : 집계값이 없을 경우 디폴트 값 설정
// ifPresent() : 집계값이 있을 경우 Consumer에서 처리