package com.naver.lone1981.app;

public class MethodC extends MethodP {
	//생성자처럼 사용할 메소드
	public MethodC() {//생성자. 반환값이 없다.
		//객체를 인스턴스화함
		//super();
		//new MethodP().methodP(); super과 동일한 뜻.부모를 호출.
		//super.methodP();//부모를 가리킴
		//this.methodC2();//자기자신을 가리킴
		System.out.println("methodC()");
	}

	@Override
	public void show() {
		System.out.println("자식메소드.부모것은 쓰기 않겠다.");
	}
//[fianl] 전급지정자 [static] 반환값 메소드명(파라메터,,,){ //명령문}
//객체명.메소드명(인자,,,);
}
