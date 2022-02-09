package com.naver.lone1981.app;

public class MethodMain {

	public static void main(String[] args) {
		// MethodC c = new MethodC();
		// 변수선언 c
		// c.methodC();
		// c.show();
		MethodC c = new MethodC();
		// 변수선언 c
		// c.methodC();
		//MethodP p = c;
		c.show();
		System.out.println("==============");
		MethodP p = new MethodP();
		p.show();
		//상단 두줄 없이 바로 
		//p.show();를 사용하면 부모메소드라서
		//자식메소드가 출력되지 않는다.
	}

}
