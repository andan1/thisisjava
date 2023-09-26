package Ch07.sec07.타입변환;

public class Child1Example {

	public static void main(String[] args) {
		// 객체 생성 및 자동 타입 변환
		Parent1 parent = new Child1();
		
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		// parent.field2 = "data2";
		// parent.method3();
		
		// 강제 타입 변환
		Child1 child = (Child1) parent;
		
		child.field2 = "data2";
		child.method3();
	}

}
