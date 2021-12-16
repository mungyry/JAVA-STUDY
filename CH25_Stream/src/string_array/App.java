package string_array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {
		// 리스트 => .stream()
		// 리스트가 아닐경우 1. stream.of(1,2,3) 정수형 스트림 Stream.of("하나","둘") 문자열 스트림
		// 2. 배열일 경우 Array.stream(배열입력)
		Stream.of("Hello","Bottle","Afria")
				.sorted() // 정렬 : 알파벳순
				.findFirst() // 첫번째
				.ifPresent(x -> System.out.println(x)); // Afria 출력됨
		
		String[] items = {"치킨","원숭이","고릴라","치약","고라니","치과","고양이"};
		Stream.of(items) // 배열을 입력해서 스트림 생성
			.filter(s -> s.startsWith("치")) // 필터는 참이면 남기고 거짓이면 제거한다.
			.forEach(x -> System.out.printf(x + ", "));
		
		System.out.println();
		
		int[] numbers= {2,4,6,8,10};
		Arrays.stream(numbers)
			.map(n -> n*n) // 제곱
			.average() // 평균, max(), min()
			.ifPresent( n-> System.out.println(n));
	
		// 배열을 리스트로
		List<String> list = Arrays.asList(items);
		list.stream()
			.filter(x -> x.startsWith("고"))
			.sorted()
			.forEach(x -> System.out.printf(x + ","));
		
		
		int[] nums = {9,4,6,3,1,2,7};
		Arrays.stream(nums)
			.filter(n ->n>3)  // 9 4 6 7 
			.sorted()       // 4 6 7 9
			.map(s->s*10)  //  40 60 70 90
			.forEach(n -> System.out.println(n));
		
	}

}
