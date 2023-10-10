package Ch17.sec06.요소변환;

import java.util.*;

public class MapExample {

	public static void main(String[] args) {
		// List 컬렉션 생성
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("홍길동", 85));
		studentList.add(new Student("홍길동", 92));
		studentList.add(new Student("홍길동", 87));
		
		// Student를 score 스트림으로 변환
		studentList.stream()
			.mapToInt(s -> s.getScore())
			.forEach(score -> System.out.println(score));
	}

}
// 매핑 : 스트림의 요소를 다른 요소로 변환하는 중간 처리 기능