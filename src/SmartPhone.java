/**
 * 스마트폰 메소드
 * 
 * @author smart04
 *
 */
public class SmartPhone {
	// 멤버변수
	String caseColor;// 폰케이스색상
	String cameraPixel;// 카메라화소
	String lcdSize;// 화면 크기
	String modelName;// 모델명
	String phoneNumber;// 전화번호

	// 멤버메소드
	/**
	 * 사진을 찍다
	 */
	void takingPictures() {
		System.out.println("사진을 찍다. 찰칵찰칵!");
	}

	/**
	 * 전화걸기
	 * @param toPhoneNumber
	 */
	void makeACall(String toPhoneNumber) {
		System.out.println("전화를 걸다.띠로리띠로리~♬");
	}

	/**
	 * 앱실행
	 * @param appName
	 */
	void playApp(String appName) {
		System.out.println("앱을 실행한다. 짜잔!");

	}
}
