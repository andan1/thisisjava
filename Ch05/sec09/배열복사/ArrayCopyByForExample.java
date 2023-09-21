package Ch05.sec09.배열복사;

public class ArrayCopyByForExample {

	public static void main(String[] args) {
		// 길이 3인 배열
		int[] oldIntArray = { 1, 2, 3 };
		// 길이 5인 배열을 새로 생성
		int[] newIntArray = new int[5];
		
		// 배열 항목 복사
		for (int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		// 배열 항목 출력
		for (int i = 0; i < newIntArray.length; i++) {
			System.out.println(newIntArray[i] + ", ");
		}
	}

}
// 배열은 한 번 생성하면 길이를변경할 수 없다
// 더 큰 길이의 배열을 새로 만들고 이전 배열로부터 항목들을 복사해야 한다