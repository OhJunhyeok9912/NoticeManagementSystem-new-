package Notice;

import java.util.Scanner;

public class VoluntaryNotice extends Notice {
	public void getUserInput(Scanner input) {
		System.out.println("���� �ѹ�: (������� �Է��ϼ���.)"); String NoticeNumber = input.nextLine(); 
	     System.out.println("��������: "); String NoticeTitle = input.nextLine();
	   	 System.out.println("Ȱ���� ����");  
	   	System.out.println("Ȱ���� ����");
	   	 System.out.println("����Ȱ��ó: "); String CompanyName = input.nextLine(); 
	   	 System.out.println("Ȱ��ó ��ġ: "); String location = input.nextLine(); 
	   	 System.out.println("��������");
	   	 System.out.println("�����Ⱓ: "); String period = input.nextLine(); 
	   	 System.out.println("���: ");  String career = input.nextLine();
	   	 System.out.println("����: "); String gender = input.nextLine(); 
	   	 System.out.println("����: "); String age = input.nextLine(); 
	   	 System.out.println("�з�: "); String academic = input.nextLine(); 
	   	 System.out.println("Ȱ������");
	   	 System.out.println("Ȱ���Ⱓ: "); String period2= input.nextLine(); 
	   	 System.out.println("Ȱ������: "); String day= input.nextLine();
	   	 System.out.println("Ȱ���ð�: "); String time= input.nextLine(); 
	   	 System.out.println("��������");
	   	 System.out.println("�����ο�: "); String personnel= input.nextLine();
	   	 System.out.println("�������: "); String condition1= input.nextLine(); 
	   	 System.out.println("��Ÿ����: "); String condition2= input.nextLine(); 
	   	 System.out.println("��Ÿ����");
	   	 System.out.println("�������: "); String way= input.nextLine();
	   	 System.out.println("���⼭��: "); String submission= input.nextLine(); 
	   	 System.out.println("�ڸ�Ʈ: ");  String comment= input.nextLine(); 
	}
}
