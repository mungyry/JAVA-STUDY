package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	 public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);		 
		 ArrayList<Double> numbers = new ArrayList<>();		 
		 double total = 0;
		 
		 while(true) {		 
		 System.out.println("숫자 또는 'q' 입력> ");
		 String input = scanner.nextLine();
		 input = input.trim(); // 공백제거
//		 System.out.println(input);
		 if(input.equalsIgnoreCase("q")) { // 입력을 q로 하면 반복문 종료      equalsIgnoreCase 대소문자 상관없음
			 break;
		 }
		 try {
			 double value = Double.parseDouble(input); // 문자열 => 실수로 변환		 
			 numbers.add(value); // 실수로 변환된 값을 리스트에 입력
		} catch (NumberFormatException e) {
				System.out.println("숫자가 아닙니다");
		}
	
		 }
		 scanner.close(); // 스캐너 종료
		 System.out.println();
		 if (numbers.size() > 0) {
			 System.out.println("입력된 숫자 : ");
			 for(Double num : numbers) {
				 System.out.printf("%.2f\n", num);
			 }
	 } else {
		 System.out.println("숫자가 입력되지 않음");
	 }
	 }
}
