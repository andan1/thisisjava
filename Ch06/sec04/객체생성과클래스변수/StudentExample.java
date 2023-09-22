package Ch06.sec04.객체생성과클래스변수;

public class StudentExample {

	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		
		Student s2 = new Student();
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
	}

}
// 클래스 변수 = new 클래스();
// 클래스 용도 
// 라이브러리 클래스 : 실행할 수 없으면 다른 클래스에서 이용하는 클래스
// 실행 클래스 : main() 메소드를 가지고 있는 실행 가능한 클래스