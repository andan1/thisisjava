package Ch07.sec06.protected접근제한자.pack2;

import Ch07.sec06.protected접근제한자.pack1.*;

public class D extends A {
	public D() {
		super();
	}
	
	// 상송을 통해서만 사용 가능
	public void method1() {
		this.field = "value";
		this.method();
	}
	
	// 직접 객체 생성해서 사용하는 것은 안됨
	public void method2() {
		A a = new A();
		a.field = "value";
		a.method();
	}
}
