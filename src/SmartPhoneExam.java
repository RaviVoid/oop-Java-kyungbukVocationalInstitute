/**
 * 메인 메소드
 * @author smart04
 *
 */
public class SmartPhoneExam {

	public static void main(String[] args) {//한프로젝트당 메인은 반드시 한개이다.
		// 객체선언, SmartPhone라는 타입, sp는 대문자만 따서 객체명(변수명) 설정
		// 그리고 값을 초기화한다. 레퍼런스의 초기값은 null이다.
		SmartPhone sp = null;
		// 객체생성
		// SmartPhone() 디폴트생성자
		sp = new SmartPhone();
		// 객체초기값
		// 속성 : 객체명.속성
		sp.caseColor = "그레이색이야~!";
		// 객체값출력
		System.out.println("휴대폰색상 : " + sp.caseColor);
		// 객체메소드호출
		sp.takingPictures();
		// 가비지컬랙션호출
		sp = null; //null로 sp값 초기화
		System.gc(); //메모리 비우기. 메모리 누수를 막을 수 있다.
	}

}
