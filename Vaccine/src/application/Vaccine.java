package application;

import java.util.ArrayList;
import java.util.Scanner;
public class Vaccine {
	private static Vaccine is;
	public static Vaccine getis() {
		
	}
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	
//	public String[] existingName = new String[5];
//	private ArrayList<Name> names = new ArrayList<>();
//	String newName;
//	
//	private ArrayList<Reservation> Reservation = new ArrayList<>();
//	private boolean running = true;
//	private Scanner scanner = new Scanner(System.in);
//	
//	Reservation[] janssen = new Reservation[2];
//	Reservation[] astrazeneca = new Reservation[2];
//	Reservation[] pfizer = new Reservation[2];
//	Reservation[] moderna = new Reservation[2];
//	
//	int vaccineNo; // 예약자자가 선택한 백신 번호	
//	
//	public void run() {
//		while(running) {
//			displayList();
//		}
//		scanner.close();
//	}
//
//	/**
//	 * 프로그램 실행시 최초 출력화면
//	 * 코로나 백신 조회 시스템 출력
//	 */
//	public void displayList() {
//		System.out.println("코로나 백신 조회 시스템");
//		System.out.println(" 번호를 입력해 주세요 ");
//		System.out.println("1. 예약자 조회");
//		System.out.println("2. 백신 접종 내역");
//		System.out.println("3. 백신 재고 현황");	
//		
//		int choice = scanner.nextInt();
//		
//		switch(choice) {
//			case 1:
//				reserveList();
//				break;
//			case 2:
//				vaccineHistory();
//				break;
//			case 3:
//				remainVaccine();
//				break;
//			default:
//				System.out.println("번호를 잘못 입력하셨습니다. 프로그램을 다시 시작해주세요.");
//				System.exit(0); 
//				break;			
//			}		
//		}
//	
//	/**
//	 * 1 . 예약자 조회
//	 */
//	private void reserveList() {
//		System.out.println("예약자를 조회합니다!");
//
//        String name = input(1);
//        String resident_num = input(3);
//
//        boolean exist = false;
//        for (Name each : names) {
//            String eachname = each.getName();
//            String eachnum = each.getResident_num();
//
//            if (name.equals(eachname) && resident_num.equals(eachnum)) {
//                System.out.println("%s, 조회 내역입니다.");
//                System.out.printf("이름 : %s, 주민번호 : %s, 백신종류 : %s", eachname, eachnum);
//                System.out.println();
//                exist = true;
//                break;
//            }
//        }
//        if (!exist) {
//            System.out.println(name + "님은 예약되어 있지않습니다.");
//        }
//    }
//	
//	/**
//	 * 3. 백신 재고 현황
//	 */
//	private void reserveVaccine() {
//		System.out.println("백신을 예약합니다");
//		
//		janssen[0] = new VaccineKind("얀센", 5);
//		astrazeneca[1] = new VaccineKind("아스트라제네카", 8);
//		pfizer[2] = new VaccineKind("화이자", 7);
//		moderna[3] = new VaccineKind("모더나", 9);
//		
//		int vaccineNum = scanner.nextInt();
//		
//		printVaccineList(vaccineNum);
//	}
//			
//	
//	
//	
//	private void vaccineHistory() {
//		
//	}
//	
//	private void remainVaccine() {
//		
//	}
//		
//}
///**
// * 백신 이름 출력
// * @param vaccineNum
// */
//public void printVaccineList(int vaccineNum) {
//	switch(vaccineNum) {
//		case 0:				
//			check(); break;
//			
//		case 1:				
//			selectVaccine(janssen); break;
//			
//		case 2:				
//			selectVaccine(astrazeneca); break;
//			
//		case 3:				
//			selectVaccine(pfizer); break;
//			
//		case 4:				
//			selectVaccine(moderna); break;
//			
//		default:				
//			System.out.println("#  범위를 벗어났습니다. 프로그램이 종료되었습니다.");
//			System.exit(0); break;
//	}
//	
//}

