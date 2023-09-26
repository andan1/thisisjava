package Ch08.sec10.타입변환;

public class CastingExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		
		Bus bus = (Bus) vehicle;
		bus.run();
		bus.checkFare();
	}

}
// 강제 타입 변환