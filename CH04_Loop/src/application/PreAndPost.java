package application;

public class PreAndPost {

	public static void main(String[] args) {
		// 증감연산자의 위치에 따라 먼저 증감하고 할당(=), 할당(=)하고 증감
		
		int x = 5;
		System.out.println(x++);
		System.out.println(x);
		
		int y = 3;
		System.out.println(++y);
		
		int z = 10;
		
		int sum = x + z++;
		
		System.out.println(sum);
		
		int a = 5;
		int b = 4;
		
		int c = ++a + b++;
		System.out.println(c);


	}

}
