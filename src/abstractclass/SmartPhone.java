package abstractclass;

public class SmartPhone extends Phone {

	public SmartPhone(String owner) {
		super(owner);
		//owner를 초기화하겠다.
	}

	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		
	}
	
	
}
