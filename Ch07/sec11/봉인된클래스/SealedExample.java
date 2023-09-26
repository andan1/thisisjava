package Ch07.sec11.봉인된클래스;

public class SealedExample {

	public static void main(String[] args) {
		Person p = new Person();
		Employee e = new Employee();
		Manager m = new Manager();
		Director d = new Director();
		
		p.work();
		e.work();
		m.work();
		d.work();
	}
	
}
// 무분별한 자식 클래스 생성을 막기 위해                                                                                                                                              