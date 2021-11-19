package application;

public class Break {

	public static void main(String[] args) {
		// break 반복문 안에서 사용시 반복문을 빠져나옴
		int count = 0;
		
		while(true) {
			System.out.println("헬로우 : " + count);
			
			if(count == 5) {
				break; // 카운트가 5가되면 빠져나옴
			}
			System.out.println("How are you");
			
			count ++;
		}

		System.out.println("Program finished.");
	}

}
