package Ch08.sec08.다중인터페이스구현;

public class MultiInterfaceImplExample {

	public static void main(String[] args) {
		RemoteControl rc = new SmartTelevision();
		
		rc.turnOn();
		rc.turnOff();
		
		Searchable searchable = new SmartTelevision();
		searchable.search("http://www.youtube.com");
	}

}
