package Ch07.sec09.객체타입확인;

public class InstanceofExample {
	// 정적 메소드 선언
	public static void personInfo(Person person) {
		System.out.println("name : " + person.name);
		person.walk();
	
	// person이 참조하는 객체가 Student 타입인지 확인
	/* if (person instanceof Student) {
		// Student 객체일 경우 강제 타입 변환
		Student student = (Student) person;
		System.out.println("studentNo : " + sutdent.studentNo);
		student.study();
	} */
	// person이 참조하는 객체가 Student 타입일 경우
	// student 변수에 대입(타입 변환 발생)
	if (person instanceof Student student) {
		System.out.println("studentNo : " + student.studentNo);
		student.study();
	}
	}
	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		personInfo(p1);
		
		System.out.println();
		
		Person p2 = new Student("김길동", 10);
		personInfo(p2);
	}
}
// instanceof : 실제로 어떤 객체가 매개값으로 제공되었는지 확인하는 방법