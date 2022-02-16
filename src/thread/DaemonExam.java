package thread;

public class DaemonExam {

	public static void main(String[] args) {
		AutoSaveThread ast = new AutoSaveThread();
		ast.setDaemon(true);
		ast.start();
		
		try {
			Thread.sleep(3050);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("메인스레드 종료");
		
	}

}
