package Ch07.sec06.protected접근제한자.pack1;

public class B {
	public void method() {
		A a = new A();
		a.field = "value";
		a.method();
	}
}
