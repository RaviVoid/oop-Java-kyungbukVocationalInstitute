package excep;

public class NullPointerExceptionExam {
	//똑같이 명을 줄 수 없기 때문에 Exam을 붙이는 것
	public static void main(String[] args) {
		String data = args[0];
		System.out.println(data);
		System.out.println(data.toString());
		//null인데 호출을 하니 에러가 발생한다.
		
	}

}
