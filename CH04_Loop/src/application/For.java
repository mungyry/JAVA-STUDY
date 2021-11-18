package application;

public class For {

	public static void main(String[] args) {
		// for 반복문 for(초기값;조건;증감) {명령문;}
		
//		for(int i=0; i < 10; i++) {
//			System.out.println("1: " + i);
//		}
		
//		for(;;) {
//			System.out.println("헬로우");
			
			
		// 예제) for 반복문을 사용하여 1에서 100까지의 합을 출력하라
		
		for(int a=0; a <= 100; a++) {
			int sum = 0;
			sum = sum + a;
			System.out.println(sum);
		}
	}

}
