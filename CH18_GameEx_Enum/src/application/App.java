package application;

import game.Game;

public class App {

	public static void main(String[] args) {
//		Game game = new Game(); // control + shift + o 클래스 임포트
//		game.run();

		new Game().run(); // 실행은 되지만 game이라는 주소를 알수가 없음
		
	}

}
