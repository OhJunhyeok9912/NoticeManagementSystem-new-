package Notice;

import java.util.Scanner;

public class CommercialNotice extends Notice {
	protected Noticekind kind = Noticekind.commercial;
	
	public CommercialNotice(Noticekind kind) {
		super(kind);
	}
    
	public void getUserInput(Scanner input) {
		System.out.println("*�� �ݵ�� �Է��ؾ� �մϴ�. ");
		 setNoticeNumber(this, input);
		 String x = input.nextLine(); 
		 setNoticeTitle(this, input);
	   	 System.out.println("�ٹ��� ����");   
	   	 setCompanyName(this, input);
	   	 setLocation(this, input);
	   	 System.out.println("��������");
	   	 setPeriod(this, input);
	   	 setCareer(this, input);
	   	 setGender(this, input);
	   	 setAge(this, input);
	   	 setAcademic(this, input);
	   	 System.out.println("�ٹ�����");
	   	 setSalary(this, input);
	   	 setPeriod2(this, input);
	   	 setDay(this, input);
	   	 setTime(this, input);
	   	 System.out.println("��������");
	     setType1(this, input);
	     setPersonnel(this, input);
	     setType2(this, input);
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
	   	 System.out.println("�ٹ��� ����");System.out.println("ȸ���: "+CompanyName);System.out.println("�ٹ��� ��ġ:" +location); 
	   	 System.out.println("��������");
	   	 System.out.println("�����Ⱓ: "+period); System.out.println("���: "+career);System.out.println("����: "+gender);  
	   	 System.out.println("����: "+age); System.out.println("�з�: "+academic); 
	   	 System.out.println("�ٹ�����");
	   	 System.out.println("�޿�: "+salary);  System.out.println("�ٹ��Ⱓ: "+period2); System.out.println("�ٹ�����: "+day); 
	   	 System.out.println("�ٹ��ð�: "+time);
	   	 System.out.println("��������");
	   	 System.out.println("��������: "+type1);  System.out.println("�����ο�: "+personnel); System.out.println("�������: "+type2); 
	   	 System.out.println("�������: "+condition1); System.out.println("��Ÿ����: "+condition2); 
	   	 System.out.println("��Ÿ����");
	   	 System.out.println("�������: "+way); System.out.println("���⼭��: "+submission); System.out.println("�ڸ�Ʈ: "+comment);  
	}
	
	
}