package api;

import java.util.Random;

public class RandomExam {

	public static void main(String[] args) {
		Random random = new Random(System.currentTimeMillis());
		System.out.println(System.currentTimeMillis());
		
		System.out.println(Math.abs(random.nextInt()));
		System.out.println(Math.abs(random.nextInt(11)));
		
		//for(int i = 0; i < 100; i++)
			System.out.println(random.nextInt(11));
		
		//10~20
		System.out.println("=======10~20=======");
		for(int i = 0; i < 100; i++) //100번 누르기 귀찮아서 넣은 것
		System.out.println(10 + random.nextInt(11));
		
		
		
	}

}
