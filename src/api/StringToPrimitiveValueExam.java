package api;

public class StringToPrimitiveValueExam {

	public static void main(String[] args) {
		String number = "10";
		
		//언박싱
		int value1 = Integer.parseInt(number);
		
		//자동박싱
		Integer intValue = value1;
		
		//출력
		System.out.println(intValue);
		System.out.println(intValue.MAX_VALUE);
		System.out.println(intValue.MIN_VALUE);
	}

}
