package Ch15.sec05.검색기능을강화시킨컬렉션;

public class Person implements Comparable<Person>{
	public String name;
	public int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Person o) {
		if (age < o.age) return -1;
		else if (age == o.age) return 0;
		else return 1;
	}
}
// Comparable과 Comparator
// compareTo(T o) : 같으면 0, 적으면 음수, 크면 양수를 리턴