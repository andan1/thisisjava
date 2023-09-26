package Ch11.sec04.리소스자동닫기;

public class TryWithResourceExample {

	public static void main(String[] args) {
		try (MyResource res = new MyResource("A")) {
			String data = res.read1();
			int value = Integer.parseInt(data);
		} catch (Exception e) {
			System.out.println("예외 처리 : " + e.getMessage());
		}
		
		System.out.println();
		
		try (MyResource res = new MyResource("A")) {
			String data = res.read2();
			int value = Integer.parseInt(data);
		} catch (Exception e) {
			System.out.println("예외처리 : " + e.getMessage());
		}
		
		System.out.println();
		
		MyResource res1 = new MyResource("A");
		MyResource res2 = new MyResource("B");
		try (res1; res2) {
			String data1 = res1.read1();
			String data2 = res2.read2();
		} catch (Exception e) {
			System.out.println("예외 처리 : " + e.getMessage());
		}
	}

}
// 리소스 : 데이터를 제공하는 객체
// try-with-resources 블록을 사용하면 예외 발생 여부와 상관없이 리소스를 자동으로 닫아준다
