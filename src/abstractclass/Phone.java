package abstractclass;
/**
 * 몸체 : 필드, 상수, 구현된메소드, 추상메소드 포함
 * @author smart9
 *
 */
public abstract class Phone {
	//Phone는 추상클래스다. -> 아래 내용이 다 구현된 구현된클래스다.
	
	//필드
	public String owner;

	//생성자(source->field를 가지고 생성)
	public Phone(String owner) {
		super();
		this.owner = owner;
	}
	
	//메소드
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
	
	public abstract void call();
	
}
