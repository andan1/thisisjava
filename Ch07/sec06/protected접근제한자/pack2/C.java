package Ch07.sec06.protected접근제한자.pack2;

import Ch07.sec06.protected접근제한자.pack1.*;

public class C {
	public void method() {
		A a = new A();
		a.field = "value";
		a.method();
	}
}
// protected로 보호되서 다른 패키지는 사용 불가능