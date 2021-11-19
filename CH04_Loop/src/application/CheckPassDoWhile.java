package application;

import java.util.Scanner;

public class CheckPassDoWhile {

	public static void main(String[] args) {
		// 패스워드를 입력받아 do while문으로 맞는지 검사한다. 패스워드가 맞으면
		
		final String USER_PASSWORD = "1234";
		
		Scanner scanner = new Scanner(System.in);
		
		String password = ""; // 전역 변수, 문자열 선언과 초기값을 공백(null)
		
		do { 
			System.out.print("비번을 입력 > ");
			password = scanner.nextLine();
		}
		while(!password.equals(USER_PASSWORD)); // !(느낌표) true 또는 false의 반대값, 패스워드가 맞지 않으면 계속 머뭄

		scanner.close();
		
		System.out.println("접속 승인");
	}

}
