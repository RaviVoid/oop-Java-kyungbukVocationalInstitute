package com.naver.lone1981.app;

public class ConstP extends Object {
	public ConstP() {
		//super();
		//super는 상속받은 부모를 얘기함.
		//나자신은 this
		//super는 자동으로 생성되는 부분이므로 생략해도 무방하다.
		System.out.println("ConstP생성자");
	}
	public ConstP(String msg) {
		System.out.println(msg);
	}
}
