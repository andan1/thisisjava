package Ch13.sec02.제네릭타입;

public class CarAgency implements Rentable<Car> {
	@Override
	public Car rent() {
		return new Car();
	}
}
