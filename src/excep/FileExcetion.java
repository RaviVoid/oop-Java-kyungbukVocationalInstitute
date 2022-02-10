package excep;

import java.io.File;
import java.io.FileInputStream;

public class FileExcetion {
	
	
	public static void main(String[] args) {
		File file = new File("1234.txt");
		int data = 0;
		try {
			FileInputStream fis = new FileInputStream(file);
			
			while((data = fis.read()) != -1) {
				System.out.print((char)data);
			}
		} catch (Exception e1) {
			
		} finally {
			fis.close(); //전역변수로 바꾸시오.			
		}
		
		
	}

}
