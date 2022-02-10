package abstractclass;

public abstract class Animal {

	public String kind;

	public void breathe() {
		System.out.println("숨을 쉽니다.");

	}

	// 추상[abstract]메소드는 몸체{}가 없습니다.
	public abstract void sound();

}
