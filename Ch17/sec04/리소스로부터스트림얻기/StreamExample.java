package Ch17.sec04.리소스로부터스트림얻기;

import java.util.*;
import java.util.stream.*;

public class StreamExample {

	public static void main(String[] args) {
		// List 컬렉션 생성
		List<Product> list = new ArrayList<>();
		for (int i = 1; i <= 5; i++) {
			Product product = new Product(i, "상품" + i, "멋진 회사", (int) (10000 * Math.random()));
			list.add(product);
		}
		
		// 객체 스트림 얻기
		Stream<Product> stream = list.stream();
		stream.forEach(p -> System.out.println(p));
	}

}
// 컬렉션으로부터 스트림 얻기