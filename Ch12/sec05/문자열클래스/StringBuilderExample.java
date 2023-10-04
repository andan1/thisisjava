package Ch12.sec05.문자열클래스;

public class StringBuilderExample {

	public static void main(String[] args) {
		String data = new StringBuilder()
				.append("DEF")
				.insert(0, "ABC")
				.delete(3, 4)
				.toString();
		System.out.println(data);
	}

}
// StringBuilder 클래스
// 문자열의 + 연산은 새로운 String 객체가 생성되고 이전 객체는 계속 버려짐
// StringBuilder는 내부 버퍼에 문자열을 저장해두고 그 안에서 추가, 수정, 삭제 작업을 하도록 설계
// append(기본값 | 문자열) : 문자열을 끝에 추가
// insert(위치, 기본값 | 문자열) : 문자열을 지정 위치에 추가
// delete(시작위치, 끝 위치) : 문자열 일부를 삭제
// replace(시작위치, 끝위치, 문자열) : 문자열 일부를 대체
// toString() : 완성된 문자열을 리턴