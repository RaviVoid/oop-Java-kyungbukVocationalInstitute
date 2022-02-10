package excep;

import java.io.File;
import java.io.IOException;

public class FileExcetion {

	public static void main(String[] args) {
		File file = new File("12466.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {}
		
	}

}
