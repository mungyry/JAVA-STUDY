package numbering;

public class App {

	public static void main(String[] args) {
		/*
		 * 10진수 deciaml     0-9
		 * 2진수  binary      0-1 (컴퓨터)
		 * 16진수 hexadecimal 0-F 
		 * 
		 * 1234567890
		 * 0, 1, 10, 11, 100, 111, 1000 => 2진수
		 * A0,FB,CD,FFFF,FF00 (16진수)
		 */
		
		//16진수 리터럴(값) 표시는 0x 이진수는 0b
		int val = 0b11111111;
		
		System.out.println("10진수 :" + val);
		System.out.println(" 2진수 :" + Integer.toBinaryString(val)); //10진수 정수를 => 2진수표현
		System.out.println("16진수 :" + Integer.toHexString(val));
	}

}
