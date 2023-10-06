package Ch15.sec08.수정할수없는컬렉션;

import java.util.*;

public class ImmutableExample {

	public static void main(String[] args) {
		// List 불변 컬렉션 생성
		List<String> immuableList1 = List.of("A", "B", "C");
		// immutableList1.add("D");  -> x
		
		// Set 불변 컬렉션 생성
		Set<String> immutableSet1 = Set.of("A", "B", "C");
		// immutavleSet1.remove("A");  -> x
		
		// Map 불변 컬렉션 생성
		Map<Integer, String> immutableMap1 = Map.of(1, "A", 2, "B", 3, "C");
		// immutableMap1.put(4, "D")  -> x
		
		// List 컬렉션을 불변 컬렉션으로 복사
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		List<String> immutableList2 = List.copyOf(list);
		
		// List 컬렉션을 불변 컬렉션으로 복사
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		Set<String> immutableSett2 = Set.copyOf(set);
		
		// Map 컬렉션을 불변 컬렉션으로 복사
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		Map<Integer, String> immutableMap2 = Map.copyOf(map);
		
		// 배열로부터 List 불변 컬렉션 생성
		String[] arr = { "A", "B", "C" };
		List<String> immutableList3 = Arrays.asList(arr);
	}

}
// List, Set, Map 인터페이스의 정적 메소드인 of()로 생성할 수 있다
// List, Set, Map 인터페이스의 정적 메소드인 copyOf()을 이용해 기존 컬렉션을 복사하여 수정할 수 없는 컬렉션을 만든다
// 배열로부터 수정할 수 없는 List 컬렉션을 만든다