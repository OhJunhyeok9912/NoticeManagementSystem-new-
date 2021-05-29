package Notice;

import java.util.Scanner;

public class VoluntaryNotice extends Notice {
	protected Noticekind kind = Noticekind.voluntary;
	
	public VoluntaryNotice(Noticekind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		System.out.println("*�� �ݵ�� �Է��ؾ� �մϴ�. ");
		setNoticeNumber(this, input); 
		 String x = input.nextLine(); 
		 setNoticeTitle(this, input);
	   	 System.out.println("Ȱ���� ����");  
	   	 setCompanyName(this, input);
	   	 setLocation(this, input);
	   	 System.out.println("��������");
	   	 setPeriod(this, input);
	   	 setCareer(this, input);
	   	 setGender(this, input);
	   	 setAge(this, input);
	   	 setAcademic(this, input);
	   	 System.out.println("Ȱ������");
	   	 setPeriod2(this, input);
	   	 setDay(this, input);
	   	 setTime(this, input);
	   	 System.out.println("��������");
	   	 setPersonnel(this, input);
	   	 setCondition1(this, input);
	     setCondition2(this, input);
	   	 System.out.println("��Ÿ����");
	   	 setWay(this, input);
	   	 setSubmission(this, input);
	   	 setComment(this, input);
	}
	
	public void printNotice(){
		String nkind = getKindString();
		System.out.println("����: "+ nkind);
		System.out.println("���� �ѹ�: "+NoticeNumber); System.out.println("��������: "+NoticeTitle); 
	   	 System.out.println("Ȱ���� ����");System.out.println("�������: "+CompanyName);System.out.println("Ȱ��ó ��ġ:" +location); 
	   	 System.out.println("��������");
	   	 System.out.println("�����Ⱓ: "+period); System.out.println("���: "+career);System.out.println("����: "+gender);  
	   	 System.out.println("����: "+age); System.out.println("�з�: "+academic); 
	   	 System.out.println("Ȱ������");
	   	 System.out.println("Ȱ���Ⱓ: "+period2); System.out.println("Ȱ������: "+day);  System.out.println("Ȱ���ð�: "+time);
	   	 System.out.println("��������");
	   	  System.out.println("�����ο�: "+personnel);  System.out.println("�������: "+condition1); System.out.println("��Ÿ����: "+condition2); 
	   	 System.out.println("��Ÿ����");
	   	 System.out.println("�������: "+way); System.out.println("���⼭��: "+submission); System.out.println("�ڸ�Ʈ: "+comment);  
	}
	

}