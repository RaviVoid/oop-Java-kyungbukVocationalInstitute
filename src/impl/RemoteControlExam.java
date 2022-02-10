package impl;

public class RemoteControlExam {

	public static void main(String[] args) {

		Remotocontrol rc = new Television();
		rc.turnOn();
		rc.setVolume(-15);
		rc.turnOff();
	}

}
