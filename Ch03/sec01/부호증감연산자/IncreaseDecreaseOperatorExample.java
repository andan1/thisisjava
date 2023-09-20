package Ch03.sec01.부호증감연산자;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		x++;
		++x;
		System.out.println("x = " + x);
		
		System.out.println();
		y--;
		--y;
		System.out.println("y = " + y);
		
		System.out.println();
		z = x++;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		
		System.out.println();
		z = ++x;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		
		System.out.println();
		z = ++x + y++;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}

}
// ++피연산자 : 피연산자의 값을 1 증가
// --피연산자 : 피연산자의 값을 1 감소
// 피연산자++ : 다른 연산을 수행한 후에 피연산자의 값을 1 증가
// 피연산자-- : 다른 연산을 수행한 후에 피연산자의 값을 1 감소