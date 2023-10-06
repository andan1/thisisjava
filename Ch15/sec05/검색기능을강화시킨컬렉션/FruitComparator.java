package Ch15.sec05.검색기능을강화시킨컬렉션;

import java.util.*;

public class FruitComparator implements Comparator<Fruit> {
	@Override
	public int compare(Fruit o1, Fruit o2) {
		if (o1.price < o2.price) return -1;
		else if (o1.price == o2.price) return 0;
		else return 1;
	}
}
// compare(T o1, To2) : 동등하면 0, o1이 o2보다 앞에 오려면 음수, 뒤에 오려면 양수를 리턴