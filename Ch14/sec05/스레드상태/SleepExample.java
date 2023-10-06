package Ch14.sec05.스레드상태;

import java.awt.Toolkit;

public class SleepExample {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 10; i++) {
			toolkit.beep();
			try { Thread.sleep(3000); } catch (InterruptedException e) {}
		}
	}

}
// 주어진 시간동안 일시 정지
// 일시 정지 상태에서는 InterruptedException이 발생할 수 있기 때문에 sleep()은 예외 처리가 필요한 메소드이다

// 스레드 객체를 생성(NEW)하고 start() 메소드를 호출하면 바로 스레드가 실행되는 것이 아니라
// 실행 대기 상태(RUNNABLE)가 된다
// run()메소드를 실행하면 실행 상태가 된다

// 일시 정지로 보냄
// sleep() : 주어진 시간 동안 스레드를 일시 정지 상태로 만든다. 주어진 시간이 지나면 자동적으로 실행 대기 상태가 된다
// join() : 스레드는 일시 정지 상태가 된다. 실행 대기 상태가 되려면 join() 메소드를 가진 스레드가 종료되어야 한다
// wait() : 동기화 블록 내에서 스레드를 일시 정지 상태로 만든다

// 일시 정지에서 벗어남
// interrupt() : 일시 정지 상태일 경우, InterruptedException을 발생시켜 실행 대기 상태 또는 종료 상태로 만든다
// notify(), notifyAll() : wait() 메소드로 인해 일시 정지 상태인 스레드를 실행 대기 상태로 만든다

// 실행 대기로 보냄
// yield() : 실행 상태에서 다른 스레드에게 실행을 양보하고 실행 대기 상태가 된다