package Ch17.sec04.리소스로부터스트림얻기;

import java.nio.charset.*;
import java.nio.file.*;
import java.util.stream.*;

public class StreamExample3 {

	public static void main(String[] args) {
		Path path = Paths.get(StreamExample.class.getResource("data.txt").toURI());
		Stream<String> stream = Files.lines(path, Charset.defaultCharset());
		stream.forEach(line -> System.out.println(line));
		stream.close();
	}

}
// 파일로부터 스트림 얻기