package com.naver.lone1981.app;

import java.util.Date;

public class DateExam3 {

	public static void main(String[] args) {
		Date now = new Date();
		//new 다음에 나오는 Date()는 생성자라고 한다.
		System.out.println(now);
		//import문은 2개 쓸 수 없으므로 위치 지정을 해서 가져와야한다.
		//sql.Date는 문법이 다르므로 Date(System.currentTimeMillis())를 적어줘야한다.
		//변수명은 now가 중복되므로 다른 변수명을 줘야한다.
		java.sql.Date now2 = new java.sql.Date(System.currentTimeMillis());
		System.out.println(now2);
		
	}

}
