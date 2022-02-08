package ext;

public class Main2 {

	public static void main(String[] args) {
		Notice notice = null;
		notice = new Notice();
		// Notice notice = new Notice();
		notice.setTitle("첫번째 공지글입니다.");
		// 객체명.필드 OR 객체명.메소드()
		System.out.println(notice.getTitle());

		Board gallery = null;
		gallery = new Board();
		// Notice notice = new Notice();
		gallery.setTitle("첫번째 갤러리글입니다.");
		// 객체명.필드 OR 객체명.메소드()
		System.out.println(notice.getTitle());
		System.out.println(notice.getFile());

	}

}
