package test; // 테스트용 패키지

import java.util.Random; // 랜덤 클래스 가져옴

import application.RandomWord; // 패키지가 다를때 적어줘야함

public class Test {
	public static void main(String[] args) {
		RandomWord r = new RandomWord();
//		r.getWord(); // 전체 출력
		System.out.println(r.toString());
		// 랜덤으로 단어를 가져오는 방법?
		Random random = new Random();
		
		String[] words = {"펭수", "고양이", "라이언", "늑대","소"};
		
		for(int i=0; i<100; i++) {
			int randomIndex = random.nextInt(words.length); // 0 ~ 배열 갯수 -1까찌 랜덤으로 출력
			System.out.println(words[randomIndex]);
		}
	}
}
