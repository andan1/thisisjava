package Ch12.sec04.System클래스;

public class ErrExample {

	public static void main(String[] args) {
		try {
			int value = Integer.parseInt("1oo");
		} catch (NumberFormatException e) {
			System.err.println("[에러 내용]");
			System.err.println(e.getMessage());
		}
	}

}
// 콘솔 출력

// 필드
// out : 문자 출력
// err : 에러 내용 출력
// in : 키보드 입력
// 메소드
// exit(int status) : 프로세스 종료
// currentTimeMills() : 현재 시간을 밀리초 단위의 long 값으로 리턴
// nanoTime() : 현재 시간을 나노초 단위의 long 값으로 리턴
// getProperty() : 운영체제와 사용자 정보 제공
// getenv() : 운영체제의 환경 변수 정보 제공