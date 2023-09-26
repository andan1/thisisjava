package Ch07.sec04.메소드재정의;

public class ComputerExample {

	public static void main(String[] args) {
		int r = 10;
		
		Calculator calculator = new Calculator();
		System.out.println("원 면적 : " + calculator.areaCircle(r));
		System.out.println();
		
		Computer computer = new Computer();
		System.out.println("원 면적 : " + computer.areaCircle(r));
	}

}
// 자식 클래스에서 메소드를 재정의