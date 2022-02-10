package com.naver.lone1981.app;
/**
 * 하나의 배열로 객체 관리 
 * @author smart9
 *
 */
public class CarExam {

	public static void main(String[] args) {
		//하나의 배열로 객체 관리하는 방법
		//CarExam에 대한 객체가 2칸에 들어간다.
		CarExam [] ce = new CarExam[2];
		//첫번째칸(ce[0])에 생성자(new CarExam())를 만들어둔다
		//두번째칸(ce[1])에 생성자(new CarExam())를 만들어둔다
		ce[0] = new CarExam();
		ce[1] = new CarExam();
		//heap영역의 주소값(HashCode 16진수)을 출력한다.
		System.out.println(ce[0]);
		System.out.println(ce[1]);
		//getClass().getName() + "@" + Integer.toHexString(hashCode())
		//System.out.println(ce[0].getClass().getName() + "@" + Integer.toHexString(hashCode()));
		
		
		int [] i = new int[2];
		//i[index값]
		i[0] = 10;
		System.out.println(i[0]);
		
		
	}

}
