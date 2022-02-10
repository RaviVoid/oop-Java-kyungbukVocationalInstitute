package impl;

/**
 * 인터페이스 구성은 상수, 추상메소드만 사용가능하다.
 * 
 * @author smart9
 *
 */
public interface Remotocontrol {

	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//interface에서는 변수가 올 수 없으므로 final을 쓸 필요가없다.
	//fianl이 자동으로 붙어 있는 상태.

	//{}몸체가 없는 객체는 추상메소드이지만
	//interface에서는 추상메소드만 올 수 있어서
	//abstract를 적지 않아도 그냥 추상메소드로 취급한다.
	public abstract void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	
}


