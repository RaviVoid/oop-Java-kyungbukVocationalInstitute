package api;

public class StringBufferExam {

	public static void main(String[] args) {
		StringBuffer sql = new StringBuffer();
		// sql문에서 처음과 끝은 띄워줘야한다.
		sql.append(" select ");
		sql.append(" * ");
		sql.append(" from member ");
		// StringBuffer -> String 클래스 만들기
		String sqlStr = sql.toString();
		System.out.println(sql);
		System.out.println(sqlStr);
		System.out.println("====================");

		// 위 아래 같은 방법
		StringBuffer sql2 = new StringBuffer().append(" select ").append(" * ").append(" from member ");
		String sqlStr2 = sql.toString();
		System.out.println(sql2);
		System.out.println(sqlStr2);
		System.out.println("====================");
		
		// 위 아래 같은 방법
		StringBuilder sql3 = new StringBuilder().append(" select ").append(" * ").append(" from member ");
		String sqlStr3 = sql.toString();
		System.out.println(sql3);
		System.out.println(sqlStr3);

	}

}
