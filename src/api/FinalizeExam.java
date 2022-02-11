package api;

public class FinalizeExam {

	public static void main(String[] args) {
		//레퍼런스의 기본 값을 주면 된다. null.
		Counter counter = null;
		
		for(int i = ((int)Math.random())*50; i < 50; i++) {
			//Counter의 생성자에서 int no를 지정하였으므로
			//()안에는 숫자값(i)이 들어간다.
			counter = new Counter(i);
			counter = null;
			System.gc();
		}
		
		
	}

}
