package Ch06.sec07.생성자선언과호출;

public class Car2 {
	// 필드 선언
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car2(String model) {
		this(model, "은색", 250);
	}
	
	Car2(String model, String color) {
		this(model, color, 250);
	}
	
	Car2(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
// 다른 생성자 호출
// 생성자 간의 중복된 코드가 많을 시 공통 코드를 한 생성자에만 집중적으로 작성하고
// this(...)를 사용하여 공통 코드를 가지고 있는 생성자를 호출하는 방법으로 개선