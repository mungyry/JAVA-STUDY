package application;

import java.util.Random;

public class RandomWord {
	// 스페이스바로 띄어진 단어들을 문자열 str에 저장
	// https://randomwordgenerator.com/ 랜덤 단어 생성
	// https://www.browserling.com/tools/newlines-to-spaces  // 줄띄움을 스페이스바로 바꿈
	private String str = "satisfaction performance difficulty marketing friendship television advertising guidance department entertainment combination permission instance recording literature introduction philosophy leadership possibility communication appearance depression computer secretary activity personality assignment attitude director government internet employment community atmosphere intention hospital girlfriend organization restaurant accident maintenance awareness priority initiative argument comparison direction celebration inspector difference";
	private String[] words = str.split(" "); // 문자열을 스페이스로 잘라서 배열에 단어로 입력
	
	private String selectWord; // 랜덤으로 선택된 단어
	private char[] characters; // 문자 배열 선언(철자를 맞추면 저장)
	private Random random = new Random();
	
	public RandomWord() {
		// 생성자에 랜덤 단어를 선택
		selectWord = words[random.nextInt(words.length)]; // 1. 랜덤으로 선택 수정
		characters = new char[selectWord.length()]; // 선택 단어의 길이만큼 문자배열 크기로 생성 
	}
	
	public void getWord() { // 현재 words배열에 있는 전체 단어를 출력
		for(String w : words) {
			System.out.println(w);
		}
	}
	
	public String toString() {
		// 단어를 _로 출력한다.
		// String text = "";
		StringBuilder sb = new StringBuilder();
//		characters[3] = 'X'; // 텍스트 
		for(char c : characters) {
//			if(c=='\u0000') { //문자('')의 초기값이 아직 맞추지 못한 문자
////				text += '_';
//				sb.append('_');
//			}
//			else {
////				text += c; // 문자를 맞춘 경우		
//				sb.append(c);
//			}
//			text += ' '; // 철자를 한칸씩 띄움
			sb.append(c=='\u0000' ? '_' : c);
			sb.append(' ');
		}
		// System.out.println(selectWord); // 정답 출력(테스트용)
//		return text; // 선택된 랜덤 단어를 가져옴
		return sb.toString();
	}

	public void addGuess(char c) {
		// 넘어온 문자를 검사해서 선택 단어에 있으면 characters 배열에 저장
		for(int i=0; i < selectWord.length(); i++) { // 단어 길이만큼 반복
			if(c == selectWord.charAt(i)) {
				characters[i] = c;
			}
		}
		
	}
}
