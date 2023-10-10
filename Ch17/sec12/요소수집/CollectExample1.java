package Ch17.sec12.요소수집;

import java.util.*;
import java.util.stream.*;

public class CollectExample1 {

	public static void main(String[] args) {
		List<Student> totalList = new ArrayList<>();
		totalList.add(new Student("홍길동", "남", 92));
		totalList.add(new Student("김수영", "여", 87));
		totalList.add(new Student("감자바", "남", 95));
		totalList.add(new Student("오해영", "여", 93));
		
		Map<String, List<Student>> map = totalList.stream()
				.collect(Collectors.groupingBy(s -> s.getSex()));
		
		List<Student> maleList = map.get("남");
		maleList.stream().forEach(s -> System.out.println(s.getName()));
		System.out.println();
		
		List<Student> femaleList = map.get("여");
		femaleList.stream().forEach(s -> System.out.println(s.getName()));
	}

}
// 요소 그룹핑