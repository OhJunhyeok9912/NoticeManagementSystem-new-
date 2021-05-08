import java.util.ArrayList;
import java.util.Scanner;

import Notice.CommercialNotice;
import Notice.Notice;
import Notice.NoticeInput;
import Notice.VoluntaryNotice;
import Notice.Noticekind;


public class NoticeManager {
	Scanner input;
	
	NoticeManager(Scanner input){
		this.input = input;
	}
	
	Notice notice;
	public ArrayList<NoticeInput> AddNotice() {
		 ArrayList<NoticeInput> addNotice = new ArrayList<NoticeInput>(); // NoticeŸ���� arrayList�� ���� �߰��� ���� �ִ´�. 
		 String Kind = "0";
		 NoticeInput NoticeInput;
		 while (!Kind.equals("1") && !Kind.equals("2")) {
		 System.out.println("���� ������ ������ �����ϼ���  1: ������ ����, 2: ���, ������ ���� ");
		 Kind = input.nextLine();
		 if(Kind.equals("1")) {
			 NoticeInput = new VoluntaryNotice(Noticekind.voluntary);
			 NoticeInput.getUserInput(input);
			 addNotice.add(NoticeInput);	
		 }
		 else if(Kind.equals("2")) {
			 NoticeInput = new CommercialNotice(Noticekind.commercial);
			 NoticeInput.getUserInput(input);
			 addNotice.add(NoticeInput);	
		 }
		 else {
			 System.out.println("1, 2�߿��� �ϳ��� ������ �ּ���.");
		 }  
		 }
		 return addNotice; // ���� �ۼ��� ������ ���� ��ȯ�Ѵ�. 
		 }	 
	
		 public void DeleteNotice(ArrayList<NoticeInput> Notice) { // 
			NoticeInput deleteNotice;
			int s =0;
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
					  s++;
				}
			}
			if(Notice.size() - s == Notice.size()) {System.out.println("���� �����ϴ�.");}
			}
		 } 	 
		 
		 public void EditNotice(ArrayList<NoticeInput> Notice) {
			NoticeInput editNotice;
			int s =0;
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
						if(editNotice.getKind() == Noticekind.voluntary) {	
							 do {
							    	System.out.println("1: �������� 2: ����Ȱ��ó, 3: Ȱ��ó ��ġ, 4: �����Ⱓ, 5: ���, 6: ����, 7: ���� , 8: �з�, 9: Ȱ���Ⱓ, 10: Ȱ������" );
								    System.out.println("11: Ȱ���ð�, 12: �����ο� 13: �������, 14: ��Ÿ����, 15: �������, 16: ���⼭��, 17: �ڸ�Ʈ" );
								    String Editnumber = input.nextLine();
								    System.out.println("������ ������ �Է��ϼ���."); 
								    String Edit = input.nextLine();
								     switch(Editnumber){   
								     case "1": editNotice.setNoticeTitle(Edit); break; case "2": editNotice.setCompanyName(Edit); break;
								     case "3": editNotice.setLocation(Edit); break; case "4": editNotice.setPeriod(Edit); break;
								     case "5": editNotice.setCareer(Edit); break; case "6": editNotice.setGender(Edit); break;
								     case "7": editNotice.setAge(Edit); break; case "8": editNotice.setAcademic(Edit); break;
								     case "9": editNotice.setPeriod2(Edit); break; case "10": editNotice.setDay(Edit); break;
								     case "11":  editNotice.setTime(Edit); break; case "12":  editNotice.setPersonnel(Edit); break;
								     case "13": editNotice.setCondition1(Edit); break; case "14": editNotice.setCondition2(Edit);
								     case "15":  editNotice.setWay(Edit); break; case "16": editNotice.setSubmission(Edit);break;
								     case "17": editNotice.setComment(Edit); break; 
								     }
								     System.out.println("������ ����Ͻðڽ��ϱ�?(y/n)"); 
								     YesorNo = input.nextLine();
								    }  while (!(YesorNo.equals("n")));
									System.out.println("���� �Ǿ����ϴ�.");
									s++;
						}
						else if(editNotice.getKind() == Noticekind.commercial)  {
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
					     case "15":editNotice.setType2(Edit); break; case "16": editNotice.setCondition1(Edit); break;
					     case "17": editNotice.setCondition2(Edit); break; case "18": editNotice.setWay(Edit); break;
					     case "19": editNotice.setSubmission(Edit); break; case "20": editNotice.setComment(Edit); break;	
					     }
					     System.out.println("������ ����Ͻðڽ��ϱ�?(y/n)"); 
					     YesorNo = input.nextLine();
					    }  while (!(YesorNo.equals("n")));
						System.out.println("���� �Ǿ����ϴ�.");
						s++;
					}
				}
				}
			if(Notice.size() - s == Notice.size()) {System.out.println("���� �����ϴ�.");}
			} 
		 }
		 public void ViewNotice(ArrayList<NoticeInput> Notice){
			NoticeInput viewNotice;
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
