package com.naver.lone1981.app;

import java.sql.Date;

public class DateExam1 {

	public static void main(String[] args) {
		//java.sql의 Date는 패키지다.
		Date now = new Date(System.currentTimeMillis());
		//now뒤에 오는 toString라는 메소드가 자동으로 입력되어 있다.
		System.out.println(now);
	}

}
