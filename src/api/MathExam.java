package api;

import common.JavaUtil;

public class MathExam {

	public static void main(String[] args) {
		double i = Math.random()*1000;
		System.out.println(i);
		System.out.println(Math.round(i)/1000.);
		
		//지정소수점 자릿수 보여주는 클래스 구현.
		System.out.println(JavaUtil.round(Math.random(), 3));
		
		//자승 구하기.
		System.out.println(Math.pow(10, 3));
		
		String str = null;
		System.out.println((str == null)?"".length():str.length());
		System.out.println(JavaUtil.nullToBlank(str).length());
		
		//10~20 랜덤값
		System.out.println("=======10~20랜덤값=======");
		double number = (int)(10+(Math.random()*(10+1)));
		System.out.println((int)number);
		
		
	}

}
