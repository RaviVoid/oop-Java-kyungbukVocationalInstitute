package excep;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileExcetion {
	
	
	public static void main(String[] args) {
		
		File file = new File("1234.txt");
		int data = 0;
		FileInputStream fis = null;
		
		
		try {
			fis = new FileInputStream(file);
			
			while((data = fis.read()) != -1) {
				System.out.print((char)data);
			}
		} catch (Exception e1) {
			
		} finally {
			
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			} //전역변수로 바꾸시오.			
		}
		

	}

}
