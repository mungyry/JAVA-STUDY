package lambda_example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class App {

	public static void main(String[] args) {
		// 문자열 어레이 리스트 생성
		List<String> list = new ArrayList<>();
		list.add("하나");
		list.add("둘");
		list.add("셋");
		
		list.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				// 익명 클래스에서 추상메소드를 구현
				System.out.println(t+ " \t");
				
			}
		});
		// 익명 클래스 => 람다식으로 
		list.forEach(t -> System.out.println(t+ "\t"));
		

	}

}
