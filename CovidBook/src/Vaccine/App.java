package Vaccine;

public class App {
	public static void main(String[] args) throws InterruptedException {		
		VaccineBook books = new VaccineBook(); // 클래스타입 VaccineBook 객체 생성
		books.bookList(); // 프로그램 실행시 화면에 출력될 메소드
//		new VaccineBook().bookList() 위의 코드 대신 한줄로 실행가능
	}
}

