package api;

public class ByteToStringExam {

	public static void main(String[] args) {
		byte [] bytes = {72,101,108,108,111,32,74,97,118,97};
		String str1 = new String(bytes);
		System.out.println(str1);
		
		String str2 = new String(bytes,6,4);
		System.out.println(str2);
		
		//bytes 배열에서 3번째 칸이 시작지점, 네칸까지 값을 가져와라.
		String str3 = new String(bytes,3,4);
		System.out.println(str3);
	}

}
