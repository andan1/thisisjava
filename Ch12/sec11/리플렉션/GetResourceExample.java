package Ch12.sec11.리플렉션;

public class GetResourceExample {

	public static void main(String[] args) {
		Class clazz = Car1.class;
		
		String photo1Path = clazz.getResource("photo1.jpg").getPath();
		String photo2Path = clazz.getResource("images/photo2.jpg").getPath();
		
		System.out.println(photo1Path);
		System.out.println(photo2Path);
	}

}
// 리소스 경로 얻기