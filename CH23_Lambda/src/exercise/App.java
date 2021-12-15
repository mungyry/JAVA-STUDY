package exercise;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// 연습문제
		List<Integer> numbers = new ArrayList<>();
		numbers.add(3);
		numbers.add(5);
		numbers.add(9);
		numbers.add(6);
		numbers.add(1000);
		numbers.add(10);
		numbers.add(11);
		numbers.add(-20);
		numbers.add(4);
		
		/*
		 * 0~10 값이 아닌 값들은 모두 제거
		 * 그다음, 각 값들에 + 100을 한다.
		 * 그 결과를 콘솔에 표시
		 */
		numbers.removeIf(a -> (a > 10 || a < 0));
		numbers.replaceAll(a -> a+100);
		numbers.forEach(b -> System.out.println(b));
		
	}

}
