package Ch06.sec07.생성자선언과호출;

public class Car1Example {

	public static void main(String[] args) {
		Car1 car1 = new Car1();
		System.out.println("car1.company : " + car1.company);
		System.out.println();
		
		Car1 car2 = new Car1("자가용");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();
		
		Car1 car3 = new Car1("자가용", "빨강");
		System.out.println("car3.company : " + car2.company);
		System.out.println("car3.model : " + car2.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();
		
		Car1 car4 = new Car1("택시", "검정", 200);
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
	}

}
// 생성자 오버로딩 : 매개변수를 달리하는 생성자를 여러 개 선언하는 것