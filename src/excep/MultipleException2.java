package excep;

public class MultipleException2 {

	public static void main(String[] args) {
		try {
			Class.forName("");
			
			Thread.sleep(100);
			//Thread.sleep(100);에서 3번째 예외추가항목 선택
			//멀티예외처리 가능
		} catch (ClassNotFoundException | InterruptedException e) {
			System.out.println("ClassNotFoundException");
		}
	}

}
