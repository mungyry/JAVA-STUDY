package reservation;

import java.util.Scanner;

public class Seat {
	
	int i;
	int j;
	String[][] s = new String[15][2];
	String[][] a = new String[20][2];
	String[][] b = new String[25][2];
	
	Seat(){ // �ڸ��� �ʱ�ȭ �ϴ� ������
		for(i=0; i<10; i++)
		{
			s[i][0] = "--- ";
			s[i][1] = "0";
		}
		for(i=0; i<15; i++)
		{
			a[i][0] = "--- ";
			a[i][1] = "0";
		}
		for(i=0; i<20; i++)
		{
			b[i][0] = "--- ";
			b[i][1] = "0";
		}
	}
	
	void seatPerson(int seat, int number, String name){ // �����ڸ� �Ҵ��ϴ� �޼ҵ�
		switch(seat)
		{
		case 1:
			s[number][0] = name;
			s[number][1] = "1";
			break;
		case 2:
			a[number][0] = name;
			a[number][1] = "1";
			break;
		case 3:
			b[number][0] = name;
			b[number][1] = "1";
			break;
		}
	}
	
	String getName(){ //�¼� ������ �̸��� �޴� �޼ҵ�
		System.out.print("�̸�>>");
		Scanner input = new Scanner(System.in);
		String name = input.next();
		return name;
	}
	
	int getSeatNumber(){ //�¼� ��ȣ�� �޴� �޼ҵ�
		System.out.print("��ȣ>>");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		return num;
	}
	
	int seatChk(int seat, int number , String name){ //�̹� ����Ǿ� �ִ����� �Ǻ��ϴ� �޼ҵ�
		int ret = 0;
		
		switch(seat)
		{
		case 1:
			if(s[number][1] == "1") // �̹� ������ �Ǿ� �ִ� �ڸ��� ���
				{
					System.out.println("�ش� �¼��� ����Ǿ��ֽ��ϴ�. �ٽ� ������ �ּ���.");
					ret = 0;
				}
				
			else // ���࿡ ���� �� ���
			{
				seatPerson(seat, number, name);
				System.out.println("����Ǿ����ϴ�!");
				ret = 1;
			}	
			break;
		case 2:
			if(a[number][1] == "1") // �̹� ������ �Ǿ� �ִ� �ڸ��� ���
			{
				System.out.println("�ش� �¼��� ����Ǿ��ֽ��ϴ�. �ٽ� ������ �ּ���.");
				ret = 0;
			}
			else // ���࿡ ���� �� ���
			{
				seatPerson(seat, number, name);
				System.out.println("����Ǿ����ϴ�!");
				ret = 1;
			}
				break;
		case 3:
			if(b[number][1] == "1") // �̹� ������ �Ǿ� �ִ� �ڸ��� ���
			{
				System.out.println("�ش� �¼��� ����Ǿ��ֽ��ϴ�. �ٽ� ������ �ּ���.");
				ret = 0;
			}
			else // ���࿡ ���� �� ���
			{
				seatPerson(seat, number, name);
				System.out.println("����Ǿ����ϴ�!");
				ret = 1;
			}
				break;
		}
		return ret;
	}
	
	int cancleChk(int num, String name){ // ������ ����ϴ� �޼ҵ�
		
		switch(num)
		{
		case 1:
			while(true)
		{
			
			for(i=0; i<10; i++)
			{
				if(name.equals(s[i][0])) //���� �̸��� �����ڰ� ������ ������ ��ҽ�Ŵ
				{
					s[i][0] = "--- ";
					s[i][1] = "0";
					break;
				}
			}
			
			if(i == 10) // ���� �̸��� �����ڰ� ���� ���
			{
				System.out.println("�������� �����ϴ�. �ٽ� �Է����ּ���!");
				return 0;
			}
			else //���� �̸��� �����ڰ� �־� ��Ҹ� ���� ���
			{
				System.out.println("������ ��ҵǾ����ϴ�!");
				break;
			}
			
		}
			break;
			
		case 2:
			while(true)
		{
			
			for(i=0; i<15; i++)
			{
				if(name.equals(a[i][0])) //���� �̸��� �����ڰ� ������ ������ ��ҽ�Ŵ
				{
					a[i][0] = "--- ";
					a[i][1] = "0";
					break;
				}
			}
			
			if(i == 15) // ���� �̸��� �����ڰ� ���� ���
			{
				System.out.println("�������� �����ϴ�. �ٽ� �Է����ּ���!");
				return 0;
			}
			else //���� �̸��� �����ڰ� �־� ��Ҹ� ���� ���
			{
				System.out.println("������ ��ҵǾ����ϴ�!");
				break;
			}
			
		}
			break;
		case 3:
			while(true)
		{
			
			for(i=0; i<20; i++)
			{
				if(name.equals(b[i][0])) //���� �̸��� �����ڰ� ������ ������ ��ҽ�Ŵ
				{
					b[i][0] = "--- ";
					b[i][1] = "0";
					break;
				}
			}
			
			if(i == 20) // ���� �̸��� �����ڰ� ���� ���
			{
				System.out.println("�������� �����ϴ�. �ٽ� �Է����ּ���!");
				return 0;
			}
			else //���� �̸��� �����ڰ� �־� ��Ҹ� ���� ���
			{
				System.out.println("������ ��ҵǾ����ϴ�!");
				break;

			}
			
		}
			break;
	}
		return 1;
	}
}