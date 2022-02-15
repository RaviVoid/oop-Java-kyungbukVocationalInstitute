package api;

import java.util.Calendar;
import java.util.TimeZone;

public class PrintTimeZoneID {

	public static void main(String[] args) {
		//Locale
		String [] ids = TimeZone.getAvailableIDs();
		TimeZone timeZone = TimeZone.getTimeZone("America/Adak");
		Calendar now = Calendar.getInstance(timeZone);
		System.out.println(now.get(Calendar.YEAR));
		System.out.println(now.get(Calendar.DAY_OF_YEAR));
		System.out.println(now.get(Calendar.MONTH));
		System.out.println(now.get(Calendar.DAY_OF_MONTH));
		System.out.println(now.get(Calendar.DATE));
		System.out.println(now.get(Calendar.HOUR));
		
		
		//ids 배열에서 id로 하나씩 꺼내서 넣겠다.
		//Asia/Seoul
		for(String id : ids) {
			//System.out.println(id);
		}
		
	}

}
