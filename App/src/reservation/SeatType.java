package reservation;

import java.util.*;

public class SeatType extends Seat{
	
		void book(String[][] s,String[][] a,String[][] b){ 
			System.out.print("�¼����� S(1), A(2), B(3) >> ");
			Scanner input = new Scanner(System.in);
			int seatT;
			String name;
			int seatN;
			seatT = input.nextInt(); 
			
			if(seatT != 1 && seatT != 2 && seatT != 3) 
			{
				System.out.println("�� �� �Է��ϼ˽��ϴ�!");
				book(s,a,b);
			}
			
			switch(seatT)
			{
			case 1: // 
				while(true)
				{
					System.out.print("S>> ");
					for(int i=0; i<10; i++) 
						System.out.print(s[i][0]);
					System.out.println();
					name = getName() + " ";
					seatN = getSeatNumber() - 1; 
					
					if(seatN >= 0 && seatN < 10)
					{
						if( seatChk(seatT,seatN,name) == 1) 
							break;
					}
					
					else
						System.out.println("�ڸ���ȣ �����Դϴ�. �ٽ� �Է����ּ���!");
				}
				break;
				
			case 2:
				while(true)
				{
					System.out.print("A>> ");
					for(int i=0; i<15; i++) 
						System.out.print(a[i][0]);
					System.out.println();
					name = getName() + " ";
					seatN = getSeatNumber() - 1; 
					
					if(seatN >= 0 && seatN < 15)  
					{
						if( seatChk(seatT,seatN,name) == 1)
							break;
					}
					
					else
						System.out.println("�ڸ���ȣ �����Դϴ�. �ٽ� �Է����ּ���!");

				}
				break;
			case 3:
				while(true)
				{
					System.out.print("B>> ");
					for(int i=0; i<20; i++) 
						System.out.print(b[i][0]);
					System.out.println();
					name = getName()+ " "; 
					seatN = getSeatNumber() - 1; 
					if(seatN >= 0 && seatN < 20)
					{
						if( seatChk(seatT,seatN,name) == 1) // seat Ŭ������ �ִ� seatChk() �޼ҵ带 �̿��Ͽ� �̹� ����� �ڸ������� Ȯ��
							break;
					}
					
					else
						System.out.println("�ڸ���ȣ �����Դϴ�. �ٽ� �Է����ּ���!");

				}
				break;
			}
			
		}
		
		void check(String[][] s, String[][] a, String[][] b){ // ��ȸ�� �� �� ����ϴ� �޼ҵ�
			System.out.print("S>> ");
			for(int i=0; i<10; i++) //s���� �¼� ��Ȳ�� ���
				System.out.print(s[i][0]);
			System.out.println();
			
			System.out.print("A>> "); 
			for(int i=0; i<15; i++) //a���� �¼� ��Ȳ�� ���
				System.out.print(a[i][0]);
			System.out.println();
			
			System.out.print("B>> ");
			for(int i=0; i<20; i++) //b���� �¼� ��Ȳ�� ���
				System.out.print(b[i][0]);
			System.out.println();
			
			System.out.println("<<<��ȸ�� �Ϸ��Ͽ����ϴ�.>>>");
		}
		
		void cancel(String[][] s, String[][] a, String[][] b){ // ��Ҹ� �� �� ����ϴ� �޼ҵ�

			System.out.print("�¼����� S(1), A(2), B(3)>>");
			Scanner input = new Scanner(System.in);
			int num = input.nextInt(); //�¼��� Ÿ���� ���ϱ� ���� ����ڿ��� �Է¹���
			
			if(num != 1 && num != 2 && num != 3) // �¼�Ÿ���� �� �� �Է��������
			{
				System.out.println("�� �� �Է��ϼ˽��ϴ�!");
				cancel(s,a,b);
			}
			
			switch(num)
			{
			case 1:
				System.out.print("S>> ");
				for(int i=0; i<10; i++) //s���� �¼� ��Ȳ�� ���
					System.out.print(s[i][0]);
				System.out.println();
				break;
			case 2:
				System.out.print("A>> "); 
				for(int i=0; i<15; i++) //a���� �¼� ��Ȳ�� ���
					System.out.print(a[i][0]);
				System.out.println();
				break;
			case 3:
				System.out.print("B>> ");
				for(int i=0; i<20; i++) //b���� �¼� ��Ȳ�� ���
					System.out.print(b[i][0]);
				System.out.println();
				break;
			}
			
			String name = getName() + " "; // ����� �̸��� �Է� ����
			
			if(cancleChk(num, name) == 0) // ����� �̸��� ������ ��Ͽ� �������
				cancel(s,a,b); // �ٽ� cancel() �޼ҵ带 ȣ���Ͽ� �ٽ� ���� 
		}
		
		void end (){ //���α׷� ���� �޼ҵ�
			System.out.println("���α׷��� ����˴ϴ�.");
			System.exit(0);
		}
}