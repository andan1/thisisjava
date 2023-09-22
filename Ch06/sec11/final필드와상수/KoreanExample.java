package Ch06.sec11.final필드와상수;

public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("123456-1234567", "감자바");
		
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);
		
		// Final 필드는 값을 변경할 수 없음
		// k1.nation = "USA";
		// k1.ssn = "123-12-1234";
		
		// 비 Final 필드는 값 변경 가능		
		k1.name = "김자바";
	}

}
