package collection;

import java.util.*;

public class ArrayListExam {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println(list.isEmpty());
		System.out.println("총 객체수 : " + list.size());
		
		System.out.println("=====================");
		list.remove(0);
		list.remove("iBATIS");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println(list.isEmpty());
		System.out.println("총 객체수 : " + list.size());
		
	}

}
