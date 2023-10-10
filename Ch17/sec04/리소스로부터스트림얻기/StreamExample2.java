package Ch17.sec04.리소스로부터스트림얻기;

import java.util.stream.*;

public class StreamExample2 {
	public static int sum;
	
	public static void main(String[] args) {
		IntStream stream = IntStream.rangeClosed(1, 100);
		stream.forEach(a -> sum += a);
		System.out.println("총합 : " + sum);
	}

}
// 숫자 범위로부터 스트림 얻기
// range() : 끝 수를 포함X
// rangeClosed() : 끝 수를 포함O