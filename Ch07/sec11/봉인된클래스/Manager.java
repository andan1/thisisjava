package Ch07.sec11.봉인된클래스;

public non-sealed class Manager extends Person {
	@Override
	public void work() {
		System.out.println("생산 관리를 합니다.");
	}
}
