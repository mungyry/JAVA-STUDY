package operators;

public class SHIFT {

	public static void main(String[] args) {
		// 비트 SHIFT >>, << 연산
		int value = 0b00010001;		
		System.out.println(toBinary(value));
		int result1 = value << 3;
		System.out.println(toBinary(result1));
		int result2 = result1 >> 3;
		System.out.println(toBinary(result2));
		
		System.out.println(100 << 2); // 곱하기 값이 2^n승 즉 2*2
		System.out.println(100 >> 1); // 나누기 값이 2%n승 즉 2%2
	}

	private static String toBinary(int value) { // 이진수 문자열로 출력
		// String.format은 printf처럼 사용하면 문자열로 리턴된다
		return String.format("%8s", Integer.toBinaryString(value)).replace(" ","0");
	}

}
