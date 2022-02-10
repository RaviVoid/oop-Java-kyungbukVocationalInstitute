package excep;

/**
 * try{ 예외발생 코드 } catch(Exception){ 예외처리 코드} finally { 예외발생하더라도 무조건 수행 }
 * 
 * @author smart00
 *
 */
public class NumberFormatException {

	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "abaab";
		int value1 = 0;
		try {
			value1 = Integer.parseInt(data1);
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		} finally {
			System.out.println("무조건 실행됩니다.");
			value1 = 10;
		}
		System.out.println(value1);
	}

}
