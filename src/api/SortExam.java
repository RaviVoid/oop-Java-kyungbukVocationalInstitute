package api;

import java.util.Arrays;

public class SortExam {

	public static void main(String[] args) {
		Member m1 = new Member("홍길동", 100);
		Member m2 = new Member("박동수", 50);
		Member m3 = new Member("김민수", 80);
		Member [] members = {m1, m2, m3};
		
		//나이 많은 순으로 오름차순으로 정렬
		Arrays.sort(members);
		
		//반복해서 출력
		for(int i = 0; i < members.length; i++) {
			System.out.println("members[" + i + "].name=" + members[i].name);
		}
	}

}
