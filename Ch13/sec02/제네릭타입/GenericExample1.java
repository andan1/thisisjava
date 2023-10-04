package Ch13.sec02.제네릭타입;

public class GenericExample1 {

	public static void main(String[] args) {
		HomeAgency homeAgency =  new HomeAgency();
		Home home = homeAgency.rent();
		home.turnOnLight();
		
		CarAgency carAgency = new CarAgency();
		Car car = carAgency.rent();
		car.run();
	
	}

}
