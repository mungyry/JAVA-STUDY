package lambda_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class ReplaceAll {

	public static void main(String[] args) {
		// 리스트의 값을 연산결과로 대체한다.
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(3);
		numbers.add(5);
		numbers.add(4);
		numbers.add(9);
		
		numbers.replaceAll(n ->n*n);
		numbers.forEach(n -> System.out.println(n));
		
		List<String> friends = new ArrayList<String>();
		friends.add("펭수");
		friends.add("길동");
		friends.add("메리");
		friends.add("철수");
		
		friends.replaceAll(a ->"안녕~ " + a);
		friends.forEach(b -> System.out.println(b));
	}

}
