import java.util.ArrayList;
import java.util.Scanner;

public class NoticeManager {
	Scanner input, input1;
	
	NoticeManager(Scanner input){
		this.input = input;
	}
	
	Notice notice;
	public ArrayList<Notice> AddNotice() {
		 notice = new Notice();
		 ArrayList<Notice> addNotice = new ArrayList<>(); // NoticeŸ���� arrayList�� ���� �߰��� ���� �ִ´�. 
	     System.out.println("���� �ѹ�: (������� �Է��ϼ���.)"); notice.NoticeNumber = input.nextLine(); 
	     System.out.println("��������: "); notice.NoticeTitle = input.nextLine();
	   	 System.out.println("�ٹ��� ����");   
	   	 System.out.println("ȸ���: "); notice.CompanyName = input.nextLine(); 
	   	 System.out.println("�ٹ��� ��ġ: "); notice.location = input.nextLine(); 
	   	 System.out.println("��������");
	   	 System.out.println("�����Ⱓ: "); notice.period = input.nextLine(); 
	   	 System.out.println("���: ");  notice.career = input.nextLine();
	   	 System.out.println("����: "); notice.gender = input.nextLine(); 
	   	 System.out.println("����: "); notice.age = input.nextLine(); 
	   	 System.out.println("�з�: "); notice.academic = input.nextLine(); 
	   	 System.out.println("�ٹ�����");
	   	 System.out.println("�޿�: ");  notice.salary = input.nextLine();  
	   	 System.out.println("�ٹ��Ⱓ: "); notice.period2= input.nextLine(); 
	   	 System.out.println("�ٹ�����: "); notice.day= input.nextLine();
	   	 System.out.println("�ٹ��ð�: "); notice.time= input.nextLine(); 
	   	 System.out.println("��������");
	   	 System.out.println("��������: "); notice.type1= input.nextLine();
	   	 System.out.println("�����ο�: "); notice.personnel= input.nextLine();
	   	 System.out.println("�������: "); notice.type2= input.nextLine(); 
	   	 System.out.println("�������: "); notice.condition1= input.nextLine(); 
	   	 System.out.println("��Ÿ����: "); notice.condition2= input.nextLine(); 
	   	 System.out.println("��Ÿ����");
	   	 System.out.println("�������: "); notice.way= input.nextLine();
	   	 System.out.println("���⼭��: "); notice.submission= input.nextLine(); 
	   	 System.out.println("�ڸ�Ʈ: ");  notice.comment= input.nextLine();   	
	   	 notice.setnotice(notice.NoticeNumber,notice.NoticeTitle ,notice.CompanyName, notice.location, notice.period , notice.career,notice.gender,
	   	                   notice.age,notice.academic,notice.salary,notice.period2,notice.day,notice.time,notice.type1,notice.personnel,notice.type2,
	   	                notice.condition1,notice.condition2,notice.way,notice.submission,notice.comment);
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
				if(Num.equals(deleteNotice.NoticeNumber)) {
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
				if(Num.equals(editNotice.NoticeNumber)) {
						System.out.println("������ �׸��� ��ȣ�� �Է��ϼ���. ��ȣ�� �� Ȯ���ϼ���"); 
						System.out.println("1: �������� 2: ȸ���, 3: �ٹ��� ��ġ, 4: �����Ⱓ, 5: ���, 6: ����, 7: ���� , 8: �з�, 9: �޿�, 10: �ٹ��Ⱓ" );
						System.out.println("11: �ٹ�����, 12: �ٹ��ð� 13: ��������, 14: �����ο�, 15: �������, 16: �������, 17: ��Ÿ����, 18: ������� , 19: ���⼭��, 20: �ڸ�Ʈ" );
						String Editnumber = input.nextLine();
						System.out.println("������ ������ �Է��ϼ���."); 
						String Edit = input.nextLine();
						switch(Editnumber){   
						     case "1": editNotice.NoticeTitle = Edit; break; case "2": editNotice.CompanyName = Edit; break;
						     case "3": editNotice.location = Edit; break; case "4": editNotice.period = Edit; break;
						     case "5": editNotice.career = Edit; break; case "6": editNotice.gender = Edit; break;
						     case "7": editNotice.age = Edit; break; case "8": editNotice.academic = Edit; break;
						     case "9": editNotice.salary = Edit; break; case "10": editNotice.period2 = Edit; break;
						     case "11": editNotice.day = Edit; break; case "12": editNotice.time = Edit; break;
						     case "13": editNotice.type1 = Edit; break; case "14": editNotice.personnel = Edit; break;
						     case "15": editNotice.type2 = Edit; break; case "16": editNotice.condition1 = Edit; break;
						     case "17": editNotice.condition2 = Edit; break; case "18": editNotice.way = Edit; break;
						     case "19": editNotice.submission = Edit; break; case "20": editNotice.comment = Edit; break;
							
						}	
						System.out.println("���� �Ǿ����ϴ�.");
					}

				}
			} 
		 }
		 public void ViewNotice(ArrayList<Notice> Notice){
			Notice viewNotice;
			System.out.println("���� ���ϴ� ���� �ѹ��� �Է��ϼ���: ");
			String Num = input.nextLine();
			if(Notice.size() == 0) {
				System.out.println("���� �����ϴ�.");
			}
			else if(Notice.size()>0) {
			for(int i=0; i<Notice.size();i++) {
				viewNotice = Notice.get(i);
				if(Num.equals(viewNotice.NoticeNumber)) {
					  viewNotice.printNotice();
				}
				else if (viewNotice.NoticeNumber == null) {
					System.out.println("���� �����ϴ�.");
				}
			}
			}
	  }	 
		
}
