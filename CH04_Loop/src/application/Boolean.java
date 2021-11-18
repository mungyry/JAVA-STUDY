package application;

public class Boolean {

	public static void main(String[] args) {
		// 불린 타입은, 참 거짓(true, false)
		boolean condition1 = false;
		System.out.println("조건1: " + condition1);
		
		// 비교 결과가 참 or 거짓
		boolean condition2 =  4 < 5;
		System.out.println("조건2: " + condition2);
		
		// 비교 결과가 참 or 거짓
		boolean condition3 =  2 > 8;
		System.out.println("조건3: " + condition3);
		
		// 비교 == 같다, != 같지않다, >=, <=
		boolean condition4 =  9 != 10;
		System.out.println("조건4: " + condition4);
		System.out.printf("조건4: %b" + condition4); // 불린은 %b로 printf에 사용
	}

}
