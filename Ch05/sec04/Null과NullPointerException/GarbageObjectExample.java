package Ch05.sec04.Null과NullPointerException;

public class GarbageObjectExample {

	public static void main(String[] args) {
		String hobby = "여행";
		// 여행에 해당하는String 객체를 쓰레기로 만듦
		hobby = null;
		
		String kind1 = "자동차";
		// kind1 변수에 저장되어 있는 번지를 kind2 변수에 대입
		String kind2 = kind1;
		// 자동차에 해당하는 String 객체는 쓰레기가 아님
		kind1 = null;
		System.out.println("kind2 : " + kind2);
	}

}
// 참조 타입 변수에 일부러 null을 대입하기도 한다
// 객체를 사용하려면 해당 객체를 참조하는 변수를 이용해야 하는데
// 변수에 null을 대입하면 번지를 잃게 되므로 더이상 객체를 사용할 수 없게 된다
// 객체를 직접 제거하는 방법은 객체의 모든 참조를 없애는 것
// kind1 변수에 null을 대입한다고 해서 
// 자동차에 해당하는 String 객체가 쓰레기가 되지는 않는다
// 그 이유는 kind2 변수가 여전히 참조하고 있기 때문이다