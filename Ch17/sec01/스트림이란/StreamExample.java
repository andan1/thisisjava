package Ch17.sec01.스트림이란;

import java.util.*;
import java.util.stream.*;

public class StreamExample {

	public static void main(String[] args) {
		// Set 컬렉션 생성
		Set<String> set = new HashSet<>();
		set.add("홍길동");
		set.add("신용권");
		set.add("감자바");
		
		// Stream을 이용한 요소 반복 처리
		Stream<String> stream = set.stream();	// -> 스트림 얻기
		stream.forEach(name -> System.out.println(name));	// -> 람다식 : 요소 처리 방법
	}

}
// 스트림 : 요소들이 하나씩 흘러가면서 처리
// Stream 과 Iterator의 차이점
// 내부 반복자이므로 처리 속도가 빠르고 병렬 처리에 효율적
// 람다식으로 다양한 요소 처리를 정의할 수 있다
// 중간 처리와 최종 처리를 수행하도록 파이프 라인을 형성할 수 있다