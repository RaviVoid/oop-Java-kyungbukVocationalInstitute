package thread;

public class MainThreadExam {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		User1 user1 = new User1();
		user1.setCalculator(calc);
		user1.start();
		System.out.println(user1);
		
		User2 user2 = new User2();
		user2.setCalculator(calc);
		user2.start();
		System.out.println(user2);
		
	
	}

}
