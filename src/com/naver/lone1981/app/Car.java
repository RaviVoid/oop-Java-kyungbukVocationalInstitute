package com.naver.lone1981.app;


public class Car {
	static Tire t1;
	Tire t2;
	
	//생성자를 통해서 필드의 값을 초기화한다.
	public Car() {
		t1 = new HankookTire();
		t2 = new KumhoTire();
	}
	
	//main ctrl+space로 쉽게 작성
	public static void main(String[] args) {
		Car car = new Car();
		car.t1.setInch(15);//변수에 15입력
		car.t2.setInch(8);
		System.out.println(car.t1);//toString클래스이름을 가져오고 해쉬코드값 출력
		System.out.println("변수이름.필드.속성메소드 = " + car.t1.getInch());//static영역에 미리 값을 가지고 있다.
		
		//객체생성.Car()생성자 호출.디폴트생성자 자동생성.
		Car car2 = new Car();
		car2.t1.setInch(20);//변수에 20입력

		System.out.println("한국타이어");//값을 주지 않아서 0출력됨.
		System.out.println("변수이름.필드.속성메소드 = " + car.t1.getInch());//값을 주지 않아서 0출력됨.
		System.out.println("클래스이름.속성메소드 = " + Car.t1.getInch());//static영역에 미리 값을 가지고 있다.
		System.out.println("금호타이어");//값을 주지 않아서 0출력됨.
		System.out.println("변수이름.필드.속성메소드 = " + car.t2.getInch());//값을 주지 않아서 0출력됨.
		//System.out.println("클래스이름.속성메소드 = " + Car.t2.getInch());
		//t2는 static영역에 없어서 오류가 발생함.
		
		
		//1번방법. 다른 패키지 속에 있으니 패키지 명을 앞에 적어준다.
		//com.hankook.Tire tire = new com.hankook.Tire();
		//2번방법. Tire를 적고 ctrl+space를 입력하면 자동으로 상단에 import문 작성됨.
		//Tire tire = new Tire();
		
	}
}
