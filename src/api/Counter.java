package api;

public class Counter {

	//메모리 누수 방지 실습
	//no 필드 추가
	private int no;

	//우클릭 source -> field에서 생성자 생성
	public Counter(int no) {
		super();
		this.no = no;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(no + "번 객체의 fianlize()가 실행됨");
	
	}
	
	
	
	
}
