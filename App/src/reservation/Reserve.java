package reservation;

import java.util.*;

public class Reserve extends SeatType {	
	int run(){ //run() �޼ҵ�
		int num; // �޴���ȣ�� ����
		
		while(true)
		{
			Scanner input = new Scanner(System.in);
			System.out.print("����(1), ��ȸ(2), ���(3), ������(4) >> ");
			num = input.nextInt(); // �޴���ȣ�� ����ڿ��� �Է� ����.
			
			switch(num) // �Է��� ���ڿ� ���� �޴�����
			{
				case 1:
					book(s,a,b); // seatType�� �ִ� book()�޼ҵ带 ���
					break;
				case 2:
					check(s,a,b); // seatType�� �ִ� check()�޼ҵ带 ��� 
					break;
				case 3:
					cancel(s,a,b); // seatType�� �ִ� cancel()�޼ҵ带 ���
					break;
				case 4:
					end(); // seatType�� �ִ� end()�޼ҵ带 ���
					break;
				default:
					System.out.println("�߸��Է��ϼ˽��ϴ�.");
					break;
			}
		}
	}

}