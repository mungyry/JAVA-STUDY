package operators;

public class XOR_NOT {

	public static void main(String[] args) {
		// 비트 XOR 연산
		int v1 = 0b01010011;
		int v2 = 0b11010110;
		
		int result1 = v1 ^ v2; // xor 비트 연산 : 같으면 0 다르면 1
		System.out.println(toBinary(v1));
		System.out.println(toBinary(v2));
		System.out.println(toBinary(result1));
		
		System.out.println();
		
		//NOT(~) 연산 : 1->0, 0->1
		int result2 = v1 | v2; // or 비트 연산
		System.out.println(toBinary(~result1));

	}

	private static String toBinary(int value) { // 이진수 문자열로 출력
		// String.format은 printf처럼 사용하면 문자열로 리턴된다
		return String.format("%8s", Integer.toBinaryString(value)).replace(" ","0");
	}

}
