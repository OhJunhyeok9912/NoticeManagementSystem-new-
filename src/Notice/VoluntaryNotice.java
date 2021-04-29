package Notice;

import java.util.Scanner;

public class VoluntaryNotice extends Notice {
	protected Noticekind kind = Noticekind.voluntary;
	
	protected String place;
	
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	
	public void getUserInput(Scanner input) {
		System.out.println("���� �ѹ�: (������� �Է��ϼ���.)"); String NoticeNumber = input.nextLine(); this.setNoticeNumber(NoticeNumber); 
	     System.out.println("��������: "); String NoticeTitle = input.nextLine(); this.setNoticeTitle(NoticeTitle);
	   	 System.out.println("Ȱ���� ����");  
	   	 System.out.println("����Ȱ��ó: "); String place = input.nextLine(); this.setPlace(place);
	   	 System.out.println("Ȱ��ó ��ġ: "); String location = input.nextLine(); this.setLocation(location);
	   	 System.out.println("��������");
	   	 System.out.println("�����Ⱓ: "); String period = input.nextLine(); this.setPeriod(period);
	   	 System.out.println("���: ");  String career = input.nextLine(); this.setCareer(career);
	   	 System.out.println("����: "); String gender = input.nextLine();  this.setGender(gender);
	   	 System.out.println("����: "); String age = input.nextLine(); this.setAge(age);
	   	 System.out.println("�з�: "); String academic = input.nextLine(); this.setAcademic(academic);
	   	 System.out.println("Ȱ������");
	   	 System.out.println("Ȱ���Ⱓ: "); String period2= input.nextLine();  this.setPeriod2(period2);
	   	 System.out.println("Ȱ������: "); String day= input.nextLine(); this.setDay(day);
	   	 System.out.println("Ȱ���ð�: "); String time= input.nextLine(); this.setTime(time);
	   	 System.out.println("��������");
	   	 System.out.println("�����ο�: "); String personnel= input.nextLine(); this.setPersonnel (personnel);
	   	 System.out.println("�������: "); String condition1= input.nextLine(); this.setCondition1 (condition1);
	   	 System.out.println("��Ÿ����: "); String condition2= input.nextLine(); this.setCondition2 (condition2);
	   	 System.out.println("��Ÿ����");
	   	 System.out.println("�������: "); String way= input.nextLine(); this.setWay(way);
	   	 System.out.println("���⼭��: "); String submission= input.nextLine();  this.setSubmission(submission);
	   	 System.out.println("�ڸ�Ʈ: ");  String comment= input.nextLine(); this.setComment(comment);
	   	 String salary = "����Ȱ��"; this.setSalary(salary);
	}
	public void printNotice(){
		String nkind = null;
		switch(this.kind) {
		case commercial:
			nkind = "���� ����";
			break;
		case voluntary:
			nkind = "���� Ȱ��";
			break;	
		default : break;	
		}
		System.out.println("����: "+ nkind);
		System.out.println("���� �ѹ�: "+NoticeNumber); System.out.println("��������: "+NoticeTitle); 
	   	 System.out.println("Ȱ���� ����");System.out.println("����Ȱ��ó: "+place);System.out.println("Ȱ��ó ��ġ:" +location); 
	   	 System.out.println("��������");
	   	 System.out.println("�����Ⱓ: "+period); System.out.println("���: "+career);System.out.println("����: "+gender);  
	   	 System.out.println("����: "+age); System.out.println("�з�: "+academic); 
	   	 System.out.println("Ȱ������");
	   	 System.out.println("Ȱ���Ⱓ: "+period2); System.out.println("Ȱ������: "+day);  System.out.println("�ٹ��ð�: "+time);
	   	 System.out.println("��������");
	   	  System.out.println("�����ο�: "+personnel);  System.out.println("�������: "+condition1); System.out.println("��Ÿ����: "+condition2); 
	   	 System.out.println("��Ÿ����");
	   	 System.out.println("�������: "+way); System.out.println("���⼭��: "+submission); System.out.println("�ڸ�Ʈ: "+comment);  
	}
}
