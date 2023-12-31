package Ch08.sec08.다중인터페이스구현;

public class SmartTelevision implements RemoteControl, Searchable {
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색을 합니다.");
	}
}
