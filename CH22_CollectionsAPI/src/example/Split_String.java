package example;

public class Split_String {

	public static void main(String[] args) {
		// split() 문자열 쪼개서 배열로 리턴
		String text1 = "(CNN)As the world learns more about the Omicron coronavirus variant and Delta continues to cause Covid-19 cases to rise around much of the United States, the need for booster shots becomes clearer than ever";
		String text2 = "맨체스터 유나이티드 시절 박지성의 최고의 경기 중 하나를 꼽으라면, AC밀란과 2009-10시즌 챔피언스리그 16강전을 들 수 있다. 당시 퍼거슨 감독은 박지성에게 피를로의 맨마킹을 주문했는데, 작전은 대성공이었다.";
//		String[] words = text1.split("[^a-zA-Z]+"); // 영문 철자를 제외한 특수문자 스페이스 점 슬래시 같은 것들 제외하고 단어만 리턴
		String[] words = text2.split("[^가-힣]+");
		for(String w : words) {
			if(w.length() < 3) { // 철자가 2개 이하는 제외
				continue;
			}
			System.out.println(w.toLowerCase()); // 소문자로 변환해서 출력
		}
		
	}

}
