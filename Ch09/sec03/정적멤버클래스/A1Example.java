package Ch09.sec03.정적멤버클래스;

public class A1Example {

	public static void main(String[] args) {
		A1.B b = new A1.B();
		System.out.println(b.field1);
		b.method1();
		
		System.out.println(A1.B.field2);
		A1.B.method2();
	}

}
