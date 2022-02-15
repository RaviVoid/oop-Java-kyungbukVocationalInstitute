package api;

public class Member implements Comparable<Member> {

	String name;
	int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
		
	}

	@Override
	public int compareTo(Member o) {
		//나이순으로 정렬
		return o.age - age;
	}
}
