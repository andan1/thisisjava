package Ch05.sec03.참조타입변수;

public class ReferenceVariableCompareExample {

	public static void main(String[] args) {
		int[] arr1;
		int[] arr2;
		int[] arr3;
		
		arr1 = new int[] { 1, 2, 3 };
		arr2 = new int[] { 1, 2, 3 };
		arr3 = arr2;
		
		System.out.println(arr1 == arr2);
		
		System.out.println(arr2 == arr3);
	}

}
// 저장 항목은 같지만 서로 다른 배열 객체로 생성되므로 
// arr1과 arr2 변수에 대입되는 번지는 다름