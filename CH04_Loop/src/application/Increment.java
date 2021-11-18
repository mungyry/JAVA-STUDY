package application;

public class Increment {

	public static void main(String[] args) {
		// 정수값을 1씩 증가 1씩 감소하는 반복문
		
		int count =0;
		
		count = count+1;
		System.out.println(count);
		count += 1;
		System.out.println(count);
		count ++;
		System.out.println(count);
		++count;
		System.out.println(count);		
		
		
		// 위와 같이 4가지 방법으로 1씩 감소 시켜라.
		count = count-1;
		System.out.println(count);
		count -= 1;
		System.out.println(count);
		count --;
		System.out.println(count);
		--count;
		System.out.println(count);	
		
		
		

	}

}
