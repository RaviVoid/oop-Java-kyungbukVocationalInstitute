package excep;

public class MultipleException {

	public static void main(String[] args) {
		try {
			Class.forName("");
			
			Thread.sleep(100);
		} catch (InterruptedException e) {
			System.out.println("InterruptedException");
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException");
		}
	}

}
