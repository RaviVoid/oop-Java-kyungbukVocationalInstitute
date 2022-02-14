package api;

import java.io.UnsupportedEncodingException;

public class StringExam {

	public static void main(String[] args) {
		//format: 서식문자열을 이용해서 서식화된 문자열을 반환한다.
		int i = 123456789;
		System.out.println(String.format("%,d", i));
		System.out.println("===================");
		
		//split(구분자) 구분자를 이용하여 문자열 배열생성
		String splitStr = "boo:and:foo";
		String[] strArr = splitStr.split("o");
		System.out.println(strArr.length);
		System.out.println(strArr[0]);
		System.out.println(strArr[1]);
		System.out.println(strArr[2]);
		System.out.println("--------------------");
		String[] strArr2 = splitStr.split(":");
		System.out.println(strArr2.length);
		System.out.println(strArr2[0]);
		System.out.println(strArr2[1]);
		System.out.println(strArr2[2]);
		System.out.println("===================");
		//startWith: 문자열이 지정한 문자로 시작하는지 판단 같으면 true 반환
		//아니면 false를 반환한다.(대소문자구별)
		String msg = "apple";
		System.out.println(msg.startsWith("a"));
		System.out.println(msg.startsWith("p"));
		System.out.println("===================");
		
		//isEmpty() //문자열의 길이가 0인 경우에, true를 리턴합니다.
		String isEmpty = "";
		System.out.println(isEmpty.length());
		System.out.println(isEmpty.length() == 0);
		System.out.println(isEmpty.isEmpty());
		System.out.println("===================");
		
		//concat(String)문자열 합치기
		String fStr = "Java";
		String lStr = " Programing";
		System.out.println(fStr.concat(lStr));
		System.out.println(fStr + lStr);
		
		System.out.println("===================");
		
		//다른타입을 문자열로 변환 valueOf()
		//메소드 오버로딩
		System.out.println(String.valueOf(false));
		System.out.println(String.valueOf(1));
		System.out.println(String.valueOf(1.));
		System.out.println(String.valueOf('a'));
		System.out.println("===================");
		
		//trim() 문자열 앞 뒤의 공백 제거
		String oldStr1 = "            자바 프로그램    ";
		System.out.println(oldStr1);
		System.out.println("[DEG]["+oldStr1+"]");
		//가운데 공백은 제거하지 않는다.
		System.out.println("[DEG]["+oldStr1.trim()+"]");
		System.out.println("===================");
		
		//알파벳 소대문자 변경
		//toLowerCase(): 소문자
		//toUpperCase(): 대문자
		String oriStr = "Java Programing";
		System.out.println(oriStr.toLowerCase());
		System.out.println(oriStr.toUpperCase());
		System.out.println("===================");
		
		//substring() 문자열 잘라내기
		String ssn = "880815-1234567";
		System.out.println(ssn.substring(0, 6));
		System.out.println(ssn.substring(7, ssn.length()));
		System.out.println(ssn.substring(7));
		System.out.println("===================");

		//replace() 문자열 대치(교체)
		String oldStr = "자바 프로그래밍 자바";
		String newStr = oldStr.replace("자바", "Java");
		System.out.println(newStr);
		System.out.println("===================");
		
		//length() 문자열의 길이
		String subject2 = "자바 프로그래밍 자바";
		System.out.println(subject2.length());
		//공백 포함 글자의 길이 출력
		System.out.println("===================");
		
		
		//indexOf(찾을 문자열) 문자열 찾기 charAt(인덱스)
		String subject1 = "자바 프로그래밍 자바";
		int idx = subject1.indexOf("바");
		//못찾으면 -1이 출력된다. 찾으면 해당위치의 칸 번호를 출력
		//좌측부터 시작해서 우측으로 진행하면서 검색함. 찾으면 정지됨
		System.out.println(idx);
		int idx1 = subject1.lastIndexOf("바");
		//우측부터 시작해서 좌측으로 진행하면서 검색함. 찾으면 정지됨
		System.out.println(idx1);
		
		//getBytes() 바이트 배열로 변환
		String str = "안녕하세요";
		//ㅇㅏㄴㄴㅕㅇㅎㅏㅅㅔㅇㅛ 는 아니고 UTF-8은 한글자가 3bytes다.
		byte[] bytes1 = str.getBytes();
		System.out.println(bytes1.length);
		String str1 = new String(bytes1);
		System.out.println(str1);
		System.out.println("=====================");
		
		try {
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println(bytes2.length);
			String str2 = new String(bytes2);
			System.out.println(str2);
			
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println(bytes3.length);
			String str3 = new String(bytes3);
			System.out.println(str3);
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("====================");
		
		//byte[] bytes = "문자열".getBytes();
		//byte[] bytes = "문자열".getBytes("UTF-8");
		//System.out.println(new String(bytes));
		
		//equals(other Object) 문자열비교
		// == OR equals
		String strVar1 = null;
		String strVar2 = "Abc";
		String strVar3 = "abc";
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar2 == strVar3);
		//System.out.println(strVar1.equals(strVar2));
		System.out.println("====================");
		
		//System.out.println(strVar1.equals("신민철"));
		System.out.println("ABC".equals(strVar2));
		//대소문자를 구분하지 않겠다. equalsIgnoreCase
		System.out.println("ABC".equalsIgnoreCase(strVar2));
		
		
		//charAt(); 인덱스에 해당하는 문자[char]를 리턴한다.
		String subject = "자바 프로그래밍"; //8칸 생성
		char charVal = subject.charAt(3); //0부터 시작하므로 4번째칸의 값을 가져옴.
		System.out.println(charVal);
		
		//주민등록번호 남&여 검출
		String subject5 = "990101-2000000"; //8칸 생성
		char charVal5 = subject.charAt(7); //0부터 시작하므로 4번째칸의 값을 가져옴.
		if((charVal-'0') % 2 == 0) {
			System.out.println("여자");
		} else {
		System.out.println("남자");
		}
		
	}

}
