package Ch17.sec02.내부반복자;

import java.util.*;
import java.util.stream.*;

public class ParallelStreamExample {

	public static void main(String[] args) {
		// List 컬렉션 생성
		List<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("신용권");
		list.add("감자바");
		list.add("람다식");
		list.add("박병렬");
		
		// 병렬 처리
		// 병렬 스트림 얻기
		Stream<String> parallelStream = list.parallelStream();
		// 람다식 : 요소 처리 방법
		parallelStream.forEach(name -> {
			System.out.println(name + " : " + Thread.currentThread().getName());
		});
	}

}
// for문과 Iterator는 컬렉션의 요소를 컬렉션 바깥쪽으로 반복해서 가져와 처리 -> 외부 반복자
// 스트림은 요소 처리 방법을 컬렉션 내부로 주입시켜서 요소를 반복 처리 -> 내부 반복자