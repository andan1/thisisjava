package Ch12.sec04.System클래스;

public class ExitExample {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i == 5) {
				System.out.println("프로세스 강제 종료");
				System.exit(0);
			}
		}
	}

}
// 프로세스 종료
// exit() 메소드의 매개값이 정상 종료면 0, 비정상 종료면 1 또는 -1을 준다