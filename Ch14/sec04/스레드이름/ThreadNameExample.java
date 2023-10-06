package Ch14.sec04.스레드이름;

public class ThreadNameExample {

	public static void main(String[] args) {
		// 이 코드를 실행하는 스레드 객체 참조 얻기
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName() + " 실행");
		
		for (int i = 0; i < 3; i++) {
			Thread threadA = new Thread() {
				@Override
				public void run() {
					System.out.println(getName() + " 실행");
				}
			};
			threadA.start();
		}
		
		Thread chatThread = new Thread() {
			@Override
			public void run() {
				System.out.println(getName() + " 실행");
			}
		};
		chatThread.setName("chat-thread");
		// 작업 스레드 이름 변경
		chatThread.start();
	}

}
// 메인 스레드는 main이라는 이름을 가짐
// 작업 스레드는 Thread-n이라는 이름을 가짐
// 이름 변경 : thread.setName("스레드 이름");
// 스레드 이름은 디버깅할 때 어떤 스레드가 작업하는지 조사할 목적으로 주로 사용
// 현재 코드를 어떤 스레드가 실행하고 있는지 확인하려면 정적 메소드인 currentThread로 
// 스레드 객체의 참조를 얻은 다음 getName 메소드로 이름을 출력한다