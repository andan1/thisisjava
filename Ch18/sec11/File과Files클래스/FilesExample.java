package Ch18.sec11.File과Files클래스;

import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;

public class FilesExample {

	public static void main(String[] args) {
		try {
			String data = "" + "id : winter\n"
							+ "email : winter@mycompany.com\n"
							+ "tel : 010-123-1234";
			// Path 객체 생성
			Path path = Paths.get("C:/Temp/user.txt");
			
			// 파일 생성 및 데이터 저장
			Files.writeString(Paths.get("C:/Temp/user.txt"), data, Charset.forName("UTF-8"));
			
			// 파일 정보 얻기
			System.out.println("파일 유형 : " + Files.probeContentType(path));
			System.out.println("파일 크기 : " + Files.size(path) + " bytes");
			
			// 파일 릭기
			String content = Files.readString(path, Charset.forName("UTF-8"));
			System.out.println(content);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
// Files 클래스