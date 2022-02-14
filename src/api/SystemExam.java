package api;

import java.sql.Date;

/**
 * System 클래스
 * @author smart9
 *
 */
public class SystemExam {

	public static void main(String[] args) {
		//currentTimeMillis() <== Timestamp
		//1644552259850
		//그리니치 표준시를 이용한 타임스탬프 출력
		long now = System.currentTimeMillis();
		System.out.println(now);
		//시간이 0 흐름. 기준시간 출력
		System.out.println(new Date(0));
		//now만큼 시간이 흐름. 현재시간 출력
		System.out.println(new Date(now));
		

	}

}
