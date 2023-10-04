package Ch12.sec11.리플렉션;

public class GetClassExample {

	public static void main(String[] args) throws Exception {
		// how 1 (클래스로부터 얻기)
		Class clazz = Car.class;
		
		// how 2 (클래스로부터 얻기)
		// Class clazz = Class.forName("Ch12.sec11.리플렉션.Car");
		
		// how 3 (객체로부터 얻기)
		// Car car = new Car();
		// Class clazz = car.getClass();
		
		System.out.println("패키지 : " + clazz.getPackageName());
		System.out.println("클래스 간단 이름 : " + clazz.getSimpleName());
		System.out.println("클래스 전체 이름 : " + clazz.getName());
	}

}
// 패키지와 타입 정보 얻기