package abstractclass;

public class PhoneExam {

	public static void main(String[] args) {
		//Phone()객체는 추상클래스이므로 new를 써서 만들 수가 없다.
		//Phone phone = new Phone(); //에러발생
		SmartPhone smartPhone = new SmartPhone("홍길동");
		//smartPhone는 변수 = 변수에 SmartPhone클래스를 입력

		//홍길동 출력해보세요.
		System.out.println(smartPhone.owner);
		System.out.println(smartPhone.hashCode());
		System.out.println(smartPhone.toString());
		System.out.println(smartPhone.getClass());
		
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		
		
	}

}
