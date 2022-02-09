package com.naver.lone1981.app;

public class A {
	int i;
	//디폴트다. 같은 패키지에서 접근이 가능하다.
	//접근지정자private를 사용한 private int i;는 접근이 안된다.

	//getters
	public int getI() {
		return this.i;
	}
	
	//setters
	public void setI(int i) {
		this.i = i;
	}
	
}
