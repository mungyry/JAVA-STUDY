package application;

public class App { // 프로제긑를 실행하기 위한 클래스

	public static void main(String[] args) {
		// 행맨 게임 시작
		Hangman game = new Hangman();
		game.run();
		game.close(); // hangman.java close 메소드 위에 별2개짜리 주석 달고 적고 클로즈에 마우스 갖다대면 설명나옴

	}
 
}
 