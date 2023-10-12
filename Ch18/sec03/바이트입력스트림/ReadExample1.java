package Ch18.sec03.바이트입력스트림;

import java.io.*;

public class ReadExample1 {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("C:/Temp/test2.db");
			
			byte[] data = new byte[100];
			
			while (true) {
				int num = is.read(data);
				if (num == -1) break;
				
				for (int i = 0; i < num; i++) {
					System.out.println(data[i]);
				}
			}
			
			is.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
// 바이트 배열로 읽기