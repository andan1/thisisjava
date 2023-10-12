package Ch18.sec03.바이트입력스트림;

import java.io.*;

public class ReadExample {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("C:/Temp/test1.db");
			
			while (true) {
				int data = is.read();
				if (data == -1) break;
				System.out.println(data);
			}
			is.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
// 1바이트 읽기