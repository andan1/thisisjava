package Ch06.sec10.정적멤버;

public class Television {
	static String company = "MyCompany";
	static String model = "LCD";
	static String info;
	
	static {
		info = company + "-" + model;
	}
}
// 정적 블록
// 정적 필드는 필드 선언과 동시에 초기값을 준다
// 복잡한 초기화 작업이 필요하면 정족 블록을 이용
// static {...}