package Ch06.sec11.final필드와상수;

public class Korean {
	// 인스턴스 final 필드 선언
	final String nation = "대한민국";
	final String ssn;
	
	// 인스턴스 필드 선언
	String name;
	
	// 생성자 선언
	public Korean(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
// 인스턴스 필드와 정적 필드는 언제든지 값을 변경할 수 있다
// final : 값을 변경하는 것을 막고 읽기만 허용할 경우
// final 필드는 초기값이 저장되면 이것이 최종적인 값이 되어서 프록그램 실행 도중에 수정할 수 없다
// 초기값을 주 수 있는 방법 : 필드 선언 시에 초기값 대입
//						 생성자에서 초기값 대입
// 고정된 값이라면 필드 선언시
// 복잡한 초기화 코드가 필요하거나 객체 생성 시에 외부에서 전달된 값으로 초기화한다면 생성자
