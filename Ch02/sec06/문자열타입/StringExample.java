package Ch02.sec06.문자열타입;

public class StringExample {

	public static void main(String[] args) {
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);
		
		String str = "나는 \"자바\"를 배웁니다.";
		System.out.println(str);
		
		str = "번호\t이름\t직업";
		System.out.println(str);
		
		System.out.println("나는\n");
		System.out.println("자바를\n");
		System.out.println("배웁니다.");
	}

}
// 작은따옴표로 감싼 한 개의 문자는 char 타입이지만
// 큰따옴표로 감싼 여러 개의 문자들은 유니코드로 변환되지 않는다
// 문자열 : 큰따옴표로 감싼 문자들
// String 타입 : 자바 기본 타입에 속하지 않는 참조 타입
// \ : 이스케이프 문자