package Ch18.sec07.성능향상스트림;

import java.io.*;

public class ReadLineExample {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(
				new FileReader("src/Ch18/sec07/성능향상스트림/ReadLineExample.java")
				);
		
		int lineNo = 1;
		while (true) {
			String str = br.readLine();
			if (str == null) break;
			System.out.println(lineNo + "\t" + str);
			lineNo++;
		}
		
		br.close();
	}

}
