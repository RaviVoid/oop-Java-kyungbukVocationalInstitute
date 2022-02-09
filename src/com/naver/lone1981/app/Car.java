package com.naver.lone1981.app;

import com.hankook.Tire;

public class Car {

	//main ctrl+space로 쉽게 작성
	public static void main(String[] args) {
		//1번방법. 다른 패키지 속에 있으니 패키지 명을 앞에 적어준다.
		//com.hankook.Tire tire = new com.hankook.Tire();
		//2번방법. Tire를 적고 ctrl+space를 입력하면 자동으로 상단에 import문 작성됨.
		Tire tire = new Tire();
		
	}
}
