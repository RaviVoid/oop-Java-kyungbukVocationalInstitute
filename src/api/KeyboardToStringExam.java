package api;

import java.io.IOException;

public class KeyboardToStringExam {

	public static void main(String[] args) throws IOException {
		byte [] bytes = new byte[10];//buffer 크기 100
		System.out.println("입력:");
		int readByteNo = System.in.read(bytes);
		String str0 = new String(bytes, 0, readByteNo+2);
		System.out.println("[" + str0 + "]");
		String str1 = new String(bytes, 0, readByteNo-0);
		System.out.println("[" + str1 + "]");

		String str2 = new String(bytes, 0, readByteNo-1);
		System.out.println("[" + str2 + "]");
		String str3 = new String(bytes, 0, readByteNo-2);
		System.out.println("[" + str3 + "]");
		
		
	}

}
