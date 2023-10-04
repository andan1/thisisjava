package Ch12.sec05.문자열클래스;

import java.util.Arrays;

public class BytesToStringExample {

	public static void main(String[] args) throws Exception {
		String data = "자바";
		
		// String -> byte 배열(기본 : UTF-8 인코딩)
		byte[] arr1 = data.getBytes();
		System.out.println("arr1 : " + Arrays.toString(arr1));
		
		// byte 배열 -> String(기본 : UTF-8 디코딩)
		String str1 = new String(arr1);
		System.out.println("str1 : " + str1);
		
		// String -> byte 배열(EUC-KR 인코딩)
		byte[] arr2 = data.getBytes("EUC-KR");
		System.out.println("arr2 : " + Arrays.toString(arr2));
		
		// byte 배열 -> String(기본 : UTF-8 디코딩)
		String str2 = new String(arr2, "EUC-KR");
		System.out.println("str2 : " + str2);
	}

}
// String 클래스
// 기본 문자셋으로 byte 배열을 디코딩해서 String 객체로 생성
// String str = new String(byte[] bytes);
// 특정 문자셋으로 byte 배열을 디코딩해서 String 객체로 생성
// String str = new String(byte[] bytes, String charsetName);
// 한글 1자를 UTF-8로 인코딩하면 3바이트가 되고,
// EUC-KR로 인코딩하면 2바이트가 된다
// 인코딩할 때 사용한 문자셋으로 디코딩을 해야만 한글이 올바르게 복원될 수 있다