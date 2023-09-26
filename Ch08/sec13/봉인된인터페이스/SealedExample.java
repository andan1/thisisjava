package Ch08.sec13.봉인된인터페이스;

public class SealedExample {

	public static void main(String[] args) {
		ImplClass impl = new ImplClass();
		
		InterfaceA ia = impl;
		ia.methodA();
		
		System.out.println();
		
		InterfaceB ib = impl;
		ib.methodA();
		ib.methodB();
		
		System.out.println();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
// 무분별한 자식 인터페이스 생성을 방지하기 위해 봉인된 인터페이스를 사용
// interfaceB는 다른 자식 인터페이스를 만들 수 있다