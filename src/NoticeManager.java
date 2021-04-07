import java.util.ArrayList;
import java.util.Scanner;

import Notice.Notice;

public class NoticeManager {
	Scanner input;
	
	NoticeManager(Scanner input){
		this.input = input;
	}
	
	Notice notice;
	public ArrayList<Notice> AddNotice() {
		 ArrayList<Notice> addNotice = new ArrayList<Notice>(); // NoticeŸ���� arrayList�� ���� �߰��� ���� �ִ´�. 
	     System.out.println("���� �ѹ�: (������� �Է��ϼ���.)"); String NoticeNumber = input.nextLine(); 
	     System.out.println("��������: "); String NoticeTitle = input.nextLine();
	   	 System.out.println("�ٹ��� ����");   
	   	 System.out.println("ȸ���: "); String CompanyName = input.nextLine(); 
	   	 System.out.println("�ٹ��� ��ġ: "); String location = input.nextLine(); 
	   	 System.out.println("��������");
	   	 System.out.println("�����Ⱓ: "); String period = input.nextLine(); 
	   	 System.out.println("���: ");  String career = input.nextLine();
	   	 System.out.println("����: "); String gender = input.nextLine(); 
	   	 System.out.println("����: "); String age = input.nextLine(); 
	   	 System.out.println("�з�: "); String academic = input.nextLine(); 
	   	 System.out.println("�ٹ�����");
	   	 System.out.println("�޿�: ");  String salary = input.nextLine();  
	   	 System.out.println("�ٹ��Ⱓ: "); String period2= input.nextLine(); 
	   	 System.out.println("�ٹ�����: "); String day= input.nextLine();
	   	 System.out.println("�ٹ��ð�: "); String time= input.nextLine(); 
	   	 System.out.println("��������");
	   	 System.out.println("��������: "); String type1= input.nextLine();
	   	 System.out.println("�����ο�: "); String personnel= input.nextLine();
	   	 System.out.println("�������: "); String type2= input.nextLine(); 
	   	 System.out.println("�������: "); String condition1= input.nextLine(); 
	   	 System.out.println("��Ÿ����: "); String condition2= input.nextLine(); 
	   	 System.out.println("��Ÿ����");
	   	 System.out.println("�������: "); String way= input.nextLine();
	   	 System.out.println("���⼭��: "); String submission= input.nextLine(); 
	   	 System.out.println("�ڸ�Ʈ: ");  String comment= input.nextLine();   
	   	 notice = new Notice(NoticeNumber, NoticeTitle, CompanyName, location, period, career, gender, age, academic, salary, 
	   			             period2, day, time, type1, personnel, type2, condition1, condition2, way, submission, comment);
	   	
	   	 addNotice.add(notice);	
		 return addNotice; // ���� �ۼ��� ������ ���� ��ȯ�Ѵ�. 
		 }	 
	
		 public void DeleteNotice(ArrayList<Notice> Notice) { // 
			Notice deleteNotice;
			System.out.println("�����ϱ� ���� ���� �ѹ��� �Է��ϼ���: "); 
			String Num = input.nextLine();
			if(Notice.size() == 0) {
				System.out.println("���� �����ϴ�.");
			}

			else if(Notice.size()>0) {
			for(int i=0; i<Notice.size();i++) {
				deleteNotice = Notice.get(i);
				if(Num.equals(deleteNotice.getNoticeNumber())) {
					  Notice.remove(i);
					  System.out.println("���� �����Ǿ����ϴ�!");
				}
			}
			}
		 } 	 
		 
		 public void EditNotice(ArrayList<Notice> Notice) {
			Notice editNotice;
			System.out.println("�����ϱ� ���� ���� �ѹ��� �Է��ϼ���: "); 
			String Num = input.nextLine();
			if(Notice.size() == 0) {
				System.out.println("���� �����ϴ�.");
			}
			else if(Notice.size()>0) {
			for(int i=0; i<Notice.size();i++) {
				editNotice = Notice.get(i);
				if(Num.equals(editNotice.getNoticeNumber())) {
					   System.out.println("������ ���� y�� �����ּ���."); 
					    String YesorNo = input.nextLine();
						System.out.println("������ �׸��� ��ȣ�� �Է��ϼ���. ��ȣ�� �� Ȯ���ϼ���"); 
				    do {
				    	System.out.println("1: �������� 2: ȸ���, 3: �ٹ��� ��ġ, 4: �����Ⱓ, 5: ���, 6: ����, 7: ���� , 8: �з�, 9: �޿�, 10: �ٹ��Ⱓ" );
					    System.out.println("11: �ٹ�����, 12: �ٹ��ð� 13: ��������, 14: �����ο�, 15: �������, 16: �������, 17: ��Ÿ����, 18: ������� , 19: ���⼭��, 20: �ڸ�Ʈ" );
					    String Editnumber = input.nextLine();
					    System.out.println("������ ������ �Է��ϼ���."); 
					    String Edit = input.nextLine();
					     switch(Editnumber){   
					     case "1": editNotice.setNoticeTitle(Edit); break; case "2": editNotice.setCompanyName(Edit); break;
					     case "3": editNotice.setLocation(Edit); break; case "4": editNotice.setPeriod(Edit); break;
					     case "5": editNotice.setCareer(Edit); break; case "6": editNotice.setGender(Edit); break;
					     case "7": editNotice.setAge(Edit); break; case "8": editNotice.setAcademic(Edit); break;
					     case "9": editNotice.setSalary(Edit); break; case "10": editNotice.setPeriod2(Edit); break;
					     case "11": editNotice.setDay(Edit); break; case "12": editNotice.setTime(Edit); break;
					     case "13": editNotice.setType1(Edit); break; case "14": editNotice.setPersonnel(Edit); break;
					     case "15": editNotice.setType2(Edit); break; case "16": editNotice.setCondition1(Edit); break;
					     case "17": editNotice.setCondition2(Edit); break; case "18": editNotice.setWay(Edit); break;
					     case "19": editNotice.setSubmission(Edit); break; case "20": editNotice.setComment(Edit); break;	
					     }
					     System.out.println("������ ����Ͻðڽ��ϱ�?(y/n)"); 
					     YesorNo = input.nextLine();
					    }  while (!(YesorNo.equals("n")));
						System.out.println("���� �Ǿ����ϴ�.");
					}

				}
			} 
		 }
		 public void ViewNotice(ArrayList<Notice> Notice){
			Notice viewNotice;
			int s = 0;
			System.out.println("���� ���ϴ� ���� �ѹ��� �Է��ϼ���: ");
			String Num = input.nextLine();
			if(Notice.size() == 0) {
				System.out.println("���� �����ϴ�.");
			}

			else if(Notice.size()>0) {
			for(int i=0; i<Notice.size();i++) {
				viewNotice = Notice.get(i);
				if(Num.equals(viewNotice.getNoticeNumber())) {
					  viewNotice.printNotice();
					  s++;
				}
				
			}
			if(Notice.size() - s == Notice.size()) {System.out.println("���� �����ϴ�.");}
			}
			
	  }	 	
}
