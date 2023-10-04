package Ch12.sec05.문자열클래스;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		String data1 = "홍길동&이수홍,박연수";
		String[] arr = data1.split("&|,");
		for (String token : arr) {
			System.out.println(token);
		}
		System.out.println();
		
		String data2 = "홍길동/이수홍/박연수";
		StringTokenizer st = new StringTokenizer(data2, "/");
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}
// StringTokenizer 클래스
// 문자열이 구분자로 연결되어 있을 경우, 문자열을 구분자 기준으로 분리하려면
// split() 메소드를 이용하거나 StringTokenizer 클래스를 이용