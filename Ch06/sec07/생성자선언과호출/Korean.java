package Ch06.sec07.생성자선언과호출;

public class Korean {
	// 필드 선언
	String nation = "대한민국";
	String name;
	String ssn;
	
	// 생성자 선언
	public Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
}
// 필드 초기화
// 객체마다 동일한 값을 가지고 있다면 필드 선언 시 초기값을 대입하는 것이 좋고
// 객체마다 다른 값을 가져야 한다면 생성자에서 필드를 초기화 하는 것이 좋다
// 매개변수명이 필드명과 동일하기 때문에 필드임을 구분하기 위해
// this 키워드를 필드명 앞에 붙여준다