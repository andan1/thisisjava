package Ch05.sec04.Null과NullPointerException;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		int[] intArray = null;
		// intArray[0] = 10;	//NullPointerException
		
		String str = null;
		// System.out.println("총 문자 수 : " + str.length());
	}

}
// 참조 타입 변수는 아직 번지를 저장하고 있지 않다는 뜻으로 null 값을 가질 수 있다
// null도 초기값으로 사용할 수 있기 때문에 null로 초기화된 참조 변수는 스택 영역에 생성
// NullPointerException : 변수가 null인 상태에서 객체의 데이터나 메소드를 사용하려 할 때 발생
