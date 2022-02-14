package api;

public class ClassExam {

	public static void main(String[] args) throws ClassNotFoundException {
		ClassExam ce = new ClassExam();
		System.out.println(ce.getClass());
		//중첩메소드 = 객체명.메소드.메소드.메....드
		System.out.println(ce.getClass().getName());
		Class clazz = Class.forName("api.Counter");
		System.out.println(clazz.getName());
	}

}
