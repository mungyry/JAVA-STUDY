package application;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// 아래 출력 및 입력이 되도록 프로그램 작성
		
		System.out.println("메뉴");
		System.out.println("====");
		System.out.println();
		System.out.println("1. 프린트 '헬로우'");
		System.out.println("2. 프린트 '안녕?'");
		System.out.println("3. 프로그램 종료");
		System.out.println();
		System.out.println("옵션을 선택 >");
		
		Scanner scanner = new Scanner(System.in);		
		int a = scanner.nextInt();
		scanner.close();  //스캐너 종료문
				
//		if (a == 1) {
//			System.out.println("헬로우");			
//		}
//		else if(a == 2) {
//			System.out.println("안녕?");
//		}
//		else if(a == 3) {
//			System.out.println("종료 합니다...");
//		}
//		else if( a == 10000) {
//			System.out.println("이스터에그를 발견했습니다.");
//		}
//		else{
//		System.out.println("잘못된 입력입니다");
		
		// switch 문으로 만들기
		
		switch(a) {
		case 1:
			System.out.println("헬로우");
			break;
		case 2:
			System.out.println("안녕?");
			break;
		case 3:
			System.out.println("종료합니다...");
			break;
		case 10000:
			System.out.println("이스터에그를 발견했습니다.");
			break;
		default :
			System.out.println("잘못된 입력입니다.");
			break;
			
	}
	}
}
