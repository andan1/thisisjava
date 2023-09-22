package Ch06.sec13.접근제한자.package01;

public class B1 {
	// 필드 선언
	A1 a1 = new A1(true);
	A1 a2 = new A1(1);
	// A1 a3 = new A1("문자열");		-> private 생성자 접근 불가
}
