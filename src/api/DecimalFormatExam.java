package api;

import java.text.DecimalFormat;

public class DecimalFormatExam {

	public static void main(String[] args) {
		double num = 123456.89;
		DecimalFormat df = new DecimalFormat("#,###.0");
		String str = df.format(num);
		System.out.println(str);
		
		DecimalFormat df2 = new DecimalFormat("\u00A4+0,000;\u00A4-0,000");
		for(int i = -51; i < 50; i++) {
			String str2 = df2.format(i+1);
			System.out.println(str2);
		}
		
	}

}
