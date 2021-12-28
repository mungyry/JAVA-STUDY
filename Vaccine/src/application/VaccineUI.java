package application;

import java.util.Scanner;
public class VaccineUI {
	Scanner sc = new Scanner(System.in);
	Vaccine vc = new Vaccine();
	
	int sel1, sel2 ;
	/**
	 * 프로그램 실행시 최초 출력화면
	 * 코로나 백신 조회 시스템 출력
	 */
	public void displayList() { 
		System.out.println("코로나 백신 조회 시스템");
		System.out.println(" 번호를 입력해 주세요 ");
		System.out.println("1. 예약자 조회");
		System.out.println("2. 백신 접종 내역");
		System.out.println("3. 백신 재고 현황");		
	
		int choice = sc.nextInt();
		
		switch(choice) {
			case 1:
				reserveList();
				break;
			case 2:
				vaccineHistory();
				break;
			case 3:
				remainVaccine();
				break;
			default:
				System.out.println("번호를 잘못 입력하셨습니다. 프로그램을 다시 시작해주세요.");
				System.exit(0); 
				break;			
			}		
		}
	public void reserveList(){
		do {
			System.out.println("백신 번호를 선택하세요");
			System.out.println("1.janssen");
			System.out.println("2.astrazeneca");
			System.out.println("3.pfizer");
			System.out.println("4.moderna");
			
			sel1=sc.nextInt();
			if(sel1==1) {
				// janssen
				System.out.println();
				sc.nextLine();
				int 
			}
	
	
		
	}
	
	
	
	public void vaccineHistory(){
		
	}
	
	
	
	public void remainVaccine() {
		
	}

}
