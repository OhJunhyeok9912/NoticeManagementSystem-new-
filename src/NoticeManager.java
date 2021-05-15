import java.util.ArrayList;
import java.util.InputMismatchException;
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
	NoticeInput NoticeInput;
	public ArrayList<NoticeInput> AddNotice() {
		 ArrayList<NoticeInput> addNotice = new ArrayList<NoticeInput>(); // NoticeŸ���� arrayList�� ���� �߰��� ���� �ִ´�. 
		 int Kind = 0;
		 System.out.println("���� ������ ������ �����ϼ���  1: ������ ����, 2: ���, ������ ���� ");
		 while (Kind !=1 && Kind !=2) {
		 try {
		 Kind = input.nextInt();
		 if(Kind == 1) {
			 NoticeInput = new VoluntaryNotice(Noticekind.voluntary);
			 NoticeInput.getUserInput(input);
			 addNotice.add(NoticeInput);	
		 }
		 else if(Kind == 2) {
			 NoticeInput = new CommercialNotice(Noticekind.commercial);
			 NoticeInput.getUserInput(input);
			 addNotice.add(NoticeInput);	
		 }
		 else System.out.println("1, 2�߿��� �ϳ��� ������ �ּ���.");  
		 }catch(InputMismatchException e) {
			 System.out.println("1, 2�߿��� �ϳ��� ������ �ּ���." );
				if(input.hasNext()) {
					input.next();
				}
				Kind = 0;
		 }
		 }
		 return addNotice; // ���� �ۼ��� ������ ���� ��ȯ�Ѵ�. 
		}	 
	
		 public void DeleteNotice(ArrayList<NoticeInput> Notice) { // 
			int cnt =0;
			System.out.println("�����ϱ� ���� ���� �ѹ��� �Է��ϼ���: "); 
			while(true) {
		    try {
			int Num = input.nextInt();
			NoNotice(Notice, 1);
			if(Notice.size()>0) {
			for(int i=0; i<Notice.size();i++) {
				NoticeInput = Notice.get(i);
				if(Num == NoticeInput.getNoticeNumber()) {
					  Notice.remove(i);
					  System.out.println(Num+"�� ���� �����Ǿ����ϴ�!");
					  cnt++;
				}
			}
			NoNotice(Notice, cnt);
			}
			break;
		    }catch(InputMismatchException e) {
		    	System.out.println("���ڸ� �Է��ϼ���!" );
				if(input.hasNext()) {
					input.next();
				}
		    }
		  }
		 } 	 
		 
		 public void EditNotice(ArrayList<NoticeInput> Notice) {
			int cnt =0;
			int Editnumber = 0;
			char YesorNo = 'y';
			System.out.println("�����ϱ� ���� ���� �ѹ��� �Է��ϼ���: "); 
			while(true) {
			try {
			int Num = input.nextInt();
			NoNotice(Notice, 1);
			if(Notice.size()>0) {
			for(int i=0; i<Notice.size();i++) {
				NoticeInput = Notice.get(i);
				if(Num == NoticeInput.getNoticeNumber()) {
						System.out.println("������ �׸��� ��ȣ�� �Է��ϼ���. ��ȣ�� �� Ȯ���ϼ���"); 
						if(NoticeInput.getKind() == Noticekind.voluntary) {	
							 do {
								 showEditMenu(NoticeInput);   
								 while(true) {
								 try {								     
     							     Editnumber = input.nextInt();
     							     break;
								    }catch(InputMismatchException e) {
								    	System.out.println("���ڸ� �Է��ϼ���!" );
								    	if(input.hasNext()) {
											input.next();
										}
								    }
								 }
								    System.out.println("������ ������ �Է��ϼ���."); 
								    String x = input.nextLine(); 
								     switch(Editnumber){   
								     case 1: NoticeInput.setNoticeTitle(NoticeInput, input); break; case 2: NoticeInput.setCompanyName(NoticeInput, input); break;
								     case 3: NoticeInput.setLocation(NoticeInput, input); break; case 4: NoticeInput.setPeriod(NoticeInput, input); break;
								     case 5: NoticeInput.setCareer(NoticeInput, input); break; case 6: NoticeInput.setGender(NoticeInput, input); break;
								     case 7: NoticeInput.setAge(NoticeInput, input); break; case 8: NoticeInput.setAcademic(NoticeInput, input); break;
								     case 9: NoticeInput.setPeriod2(NoticeInput, input); break; case 10: NoticeInput.setDay(NoticeInput, input); break;
								     case 11:  NoticeInput.setTime(NoticeInput, input); break; case 12:  NoticeInput.setPersonnel(NoticeInput, input); break;
								     case 13: NoticeInput.setCondition1(NoticeInput, input); break; case 14: NoticeInput.setCondition2(NoticeInput, input);
								     case 15:  NoticeInput.setWay(NoticeInput, input); break; case 16: NoticeInput.setSubmission(NoticeInput, input);break;
								     case 17: NoticeInput.setComment(NoticeInput, input); break; default: continue;
								     }
								     System.out.println("������ ����Ͻðڽ��ϱ�?(����Ϸ��� �ƹ� ���ڸ� �Է��� �ּ���. ������ �׸��Ϸ��� n�� �����ּ���.)"); 
								     YesorNo = input.next().charAt(0);
								    }  while (YesorNo != 'n' );
									System.out.println("���� �Ǿ����ϴ�.");
									cnt++;
						}
						else if(NoticeInput.getKind() == Noticekind.commercial)  {
				    do {
				    	showEditMenu(NoticeInput);   
				    	while(true) { 
				    	try {								     
						     Editnumber = input.nextInt();
						     break;
						    }catch(InputMismatchException e) {
						    	System.out.println("���ڸ� �Է��ϼ���!" );
						    	if(input.hasNext()) {
									input.next();
								}
						    }
				    	}
					    System.out.println("������ ������ �Է��ϼ���."); 
					    String x = input.nextLine(); 
					     switch(Editnumber){   
					     case 1: NoticeInput.setNoticeTitle(NoticeInput, input); break; case 2: NoticeInput.setCompanyName(NoticeInput, input); break;
					     case 3: NoticeInput.setLocation(NoticeInput, input); break; case 4: NoticeInput.setPeriod(NoticeInput, input); break;
					     case 5: NoticeInput.setCareer(NoticeInput, input); break; case 6: NoticeInput.setGender(NoticeInput, input); break;
					     case 7: NoticeInput.setAge(NoticeInput, input); break; case 8: NoticeInput.setAcademic(NoticeInput, input); break;
					     case 9: NoticeInput.setSalary(NoticeInput, input); break; case 10: NoticeInput.setPeriod2(NoticeInput, input); break;
					     case 11: NoticeInput.setDay(NoticeInput, input); break; case 12: NoticeInput.setTime(NoticeInput, input); break;
					     case 13: NoticeInput.setType1(NoticeInput, input); break; case 14: NoticeInput.setPersonnel(NoticeInput, input); break;
					     case 15:NoticeInput.setType2(NoticeInput, input); break; case 16: NoticeInput.setCondition1(NoticeInput, input); break;
					     case 17: NoticeInput.setCondition2(NoticeInput, input); break; case 18: NoticeInput.setWay(NoticeInput, input); break;
					     case 19: NoticeInput.setSubmission(NoticeInput, input); break; case 20: NoticeInput.setComment(NoticeInput, input); break;	
					     default: continue;
					     }
					     System.out.println("������ ����Ͻðڽ��ϱ�?(����Ϸ��� �ƹ� ���ڸ� �Է��� �ּ���. ������ �׸��Ϸ��� n�� �����ּ���.)"); 
					     YesorNo = input.next().charAt(0);
					    }  while (YesorNo != 'n' );
						System.out.println("���� �Ǿ����ϴ�.");
						cnt++;
					}
				}
				}
			NoNotice(Notice, cnt);
			} 
			 break;
			}catch(InputMismatchException e) {
				System.out.println("���ڸ� �Է��ϼ���!" );
				if(input.hasNext()) {
					input.next();
				}
			}
			}
		 }
		 public void ViewNotice(ArrayList<NoticeInput> Notice){
			int cnt = 0;
			System.out.println("���� ���ϴ� ���� �ѹ��� �Է��ϼ���: (-1�� �Է��ϸ� ��ϵ� ��� ���� �� �� �ֽ��ϴ�.)");
			while(true) {
			try {
			    int Num = input.nextInt();
			    NoNotice(Notice, 1);
			    if(Notice.size()>0) {
			        if(Num != -1) {	
			            for(int i=0; i<Notice.size();i++) {
				        NoticeInput = Notice.get(i);
				            if(Num == NoticeInput.getNoticeNumber()) {
					           NoticeInput.printNotice();
					           cnt++;
				             }				
			            }
			        NoNotice(Notice, cnt);
			           }
			    else {
				    System.out.println("���� ��ϵ� ������ ��: "+ Notice.size());
				    for(int i=0; i<Notice.size();i++) {
				        NoticeInput = Notice.get(i);
					    NoticeInput.printNotice();
			           }
				    }		
	             }
			     break;
			}catch(InputMismatchException e ) {
				System.out.println("���ڸ� �Է��ϼ���!" );
				if(input.hasNext()) {
					input.next();
				}
			}
		   }
		 }
		 
       public void showEditMenu(NoticeInput NoticeInput) {
    	   if(NoticeInput.getKind() == Noticekind.voluntary) {
    		   System.out.println("1: �������� 2: ����Ȱ��ó, 3: Ȱ��ó ��ġ, 4: �����Ⱓ, 5: ���, 6: ����, 7: ���� , 8: �з�, 9: Ȱ���Ⱓ, 10: Ȱ������" );
			    System.out.println("11: Ȱ���ð�, 12: �����ο� 13: �������, 14: ��Ÿ����, 15: �������, 16: ���⼭��, 17: �ڸ�Ʈ" );
    	   }
    	   else if (NoticeInput.getKind() == Noticekind.commercial) {
    		   System.out.println("1: �������� 2: ȸ���, 3: �ٹ��� ��ġ, 4: �����Ⱓ, 5: ���, 6: ����, 7: ���� , 8: �з�, 9: �޿�, 10: �ٹ��Ⱓ" );
			    System.out.println("11: �ٹ�����, 12: �ٹ��ð� 13: ��������, 14: �����ο�, 15: �������, 16: �������, 17: ��Ÿ����, 18: ������� , 19: ���⼭��, 20: �ڸ�Ʈ" );   
    	   }
       }
       
       
       public void NoNotice(ArrayList<NoticeInput> Notice, int cnt) {
    	   if(Notice.size() == 0) {
				System.out.println("���� �ۼ��Ǿ� �ִ� ���� �����ϴ�.");
			}
    	   else if(Notice.size() - cnt == Notice.size()) {
    		   System.out.println("�ش� ���� �����ϴ�.");
    		   }
       }
}
