package Ch16.sec05.메소드참조;

public class MethodReferenceExample1 {

	public static void main(String[] args) {
		Person1 person = new Person1();
		person.ordering(String :: compareToIgnoreCase);
	}

}
// 매개변수의 메소드 참조