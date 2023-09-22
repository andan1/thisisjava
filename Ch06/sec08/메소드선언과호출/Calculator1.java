package Ch06.sec08.메소드선언과호출;

public class Calculator1 {
	double areaRectangle(double width) {
		return width * width;
	}
	
	double areaRectangle(double width, double height) {
		return width * height;
	}
}
// 메소드 오버로딩
// 메소드 이름은 같되 매개변수의 타입, 개수, 순서가 다른 메소드를 여러 개 선언하는 것
// 다양한 매개값을 처리하기 위해