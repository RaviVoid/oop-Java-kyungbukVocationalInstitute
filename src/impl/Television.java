package impl;

public class Television implements Remotocontrol{

	//이것이 구현클래스이다.
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > MAX_VOLUME) {
			volume = MAX_VOLUME;
		} else if(volume < MIN_VOLUME) {
			volume = MIN_VOLUME;
		}

		System.out.println("현재 TV 볼륨 : " + volume);
	}

	
}
