package Vaccine;

import java.util.ArrayList;
import java.util.Scanner;

public class VaccineBook {
	ArrayList<VaccineVar> bookList = new ArrayList<>();
	Scanner sc = new Scanner(System.in);	


public void bookList() throws InterruptedException {
	while(true) {
		System.out.println("코로나 백신 조회 시스템");
		System.out.println(" 번호를 입력해 주세요 ");
		System.out.println("1.백신예약");
		System.out.println("2.예약수정");
		System.out.println("3.예약취소");
		System.out.println("4.예약정보출력");
		System.out.println("0.종료");
		
		String input = sc.nextLine();
		switch(input) {
		case("1"):
			bookVaccine();
		break;
		
		case("2"):
			bookModify();
		break;
		
		case("3"):
			bookCancle();
		break;
		
		case("4"):
			bookInform();
		break;
		
		case("0"):
			System.out.println("프로그램 종료");
		sc.close();
		System.exit(0);
		default:
			System.out.println("잘못입력하였습니다. 다시 입력해주세요");
		break;
		}
	}
}


private void bookVaccine() throws InterruptedException{	
	// 1. 백신예약
	while(true) {
		VaccineVar book = new VaccineVar();
		// 주민번호 중복 불가
		while(true) {
			int cnt=0;
			System.out.println("주민등록번호 입력, ex)881111-1122333");
			String temp = sc.nextLine();
			for(int i=0; i < bookList.size(); i++) {
				if(temp.equals(bookList.get(i).getResidentNum())){
					cnt++;
					System.out.println("이미 존재하는 주민등록번호입니다. 다시 입력해주세요");
					break;
				}
			}
			if(cnt==0) {
				book.setResidentNum(temp);
				break;
			}
		}
		System.out.println("이름");
		book.setName(sc.nextLine());
		System.out.println("휴대포 번호, ex)000-000-0000");
		book.setPhoneNum(sc.nextLine());
		System.out.println("백신 종류 입력, ex) 얀센 1차, 아스트라제네카 2차, 화이자 3차, 모더나 1차");
		book.setVaccinetype(sc.nextLine());
		System.out.println("백신 접종일, ex)2020-12-12 14시");
		book.setDate(sc.nextLine());
		
		System.out.println("이름:"+ book.getName());
		System.out.println("주민등록번호:"+ book.getResidentNum());
		System.out.println("휴대폰 번호:"+ book.getPhoneNum());
		System.out.println("백신 종류:"+ book.getVaccinetype());
		System.out.println("백신 접종일:"+ book.getDate());
		
		System.out.println("입력한 사항이 모두 맞습니까? 예(Y), 아니오(N)");
		
		String confirm = sc.nextLine();
		if(confirm.equalsIgnoreCase("y")) {
			bookList.add(book);
			System.out.println("입력 완료");
			break;
		} else if(confirm.equalsIgnoreCase("n")) {
			System.out.println("예약자 정보를 다시 입력하세요");
		} else {
			System.out.println("잘못누르셨습니다. 시작 메뉴로 이동합니다.");
			break;
		}
			Thread.sleep(1000);
		}
	}

private void bookModify() {
	// 2. 예약수정	
	while(true) {
		System.out.println("예약자 주민번호를 입력해주세요. ex)881111-1122333");
		String temp = sc.nextLine();
		int cnt = 0;
		for(int i=0; i<bookList.size(); i++) {
			if(temp.equals(bookList.get(i).getResidentNum())) {
				System.out.println("수정할 백신 종류 입력해주세요. ex) 얀센 1차, 아스트라제네카 2차, 화이자 3차, 모더나 1차");
				bookList.get(i).setVaccinetype(sc.nextLine());
				System.out.println("수정할 백신 접종일 입력해주세요. ex)2020-12-12 14시");
				bookList.get(i).setDate(sc.nextLine());
				cnt++;
				System.out.println("수정 완료");
				break;
			}
		}
	if(cnt==0) {
		System.out.println("예약자 이름이 존재하지 않습니다. 주민등록번호를 다시 입력해주세요. ex)881111-1122333");
	} else {
		break; // 시작 화면으로 이동
	}
	}	
}

private void bookCancle() {
	// 3. 예약취소
	while(true) {
		System.out.println("예약취소를 원하시면 주민등록번호를 입력해주세요. ex)881111-1122333");
		String temp = sc.nextLine();
		int cnt = 0;
		for(int i=0; i<bookList.size(); i++) {
			if(temp.equals(bookList.get(i).getResidentNum())) {
				bookList.remove(i);
				cnt++;
				System.out.println("예약 취소 완료");
				break;
			}
		}
		if (cnt==0) {
			System.out.println("예약자 이름이 존재하지 않습니다.  주민등록번호를 다시 입력해주세요.");
		} else {
			break;
	   }
	}	
}
private void bookInform() throws InterruptedException {
	// 4. 예약조회
	while(true) {
		System.out.println("예약자 수: " + bookList.size()+"명");
		for(int i=0; i<bookList.size(); i++) {
			System.out.println("이름:" + bookList.get(i).getName());
			System.out.println("주민등록번호:" + bookList.get(i).getResidentNum());
			System.out.println("휴대폰 번호:" + bookList.get(i).getPhoneNum());
			System.out.println("백신 종류:" + bookList.get(i).getVaccinetype());
			System.out.println("백신 접종일:" + bookList.get(i).getDate());
			System.out.println();
		}
		System.out.println("시작 화면으로 이동:[s]");
		System.out.println("프로그램 종료:[0]");
		String temp=sc.nextLine();
		if(temp.equalsIgnoreCase("s")) {
			break;
		} else if(temp.equals("0")) {
			System.out.println("프로그램을 종료합니다.");
			Thread.sleep(1000);
			System.exit(0);
		} else {
			System.out.println("잘못 누르셨습니다. 시작 화면으로 이동합니다.");
			Thread.sleep(1000);
			break; // 시작 화면으로 이동
		}
	}		
}
}