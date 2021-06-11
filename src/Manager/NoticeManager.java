package Manager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Notice.CommercialNotice;
import Notice.Notice;
import Notice.NoticeInput;
import Notice.VoluntaryNotice;
import Notice.Noticekind;


public class NoticeManager implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5111972554540417328L;

	
	NoticeManager(){ //input �Ű������� ����
		
	}
	
	Notice notice;
	NoticeInput NoticeInput;
	ArrayList<NoticeInput> Notices = new ArrayList<NoticeInput>();
	
	public void AddNotice(NoticeInput noticeinput) {
		Notices.add(noticeinput);
	}
	
	public void AddNotice() {
		 Scanner input = new Scanner(System.in); //������������ input�� ���������� �ٲپ� ���� ������ ���� �����ϱ����� ������ �״�� ������ �� �ִ�.  
		 int Kind = 0;
		 System.out.println("���� ������ ������ �����ϼ���  1: ������ ����, 2: ���, ������ ���� ");
		 while (Kind !=1 && Kind !=2) {
		 try {
		 Kind = input.nextInt();
		 if(Kind == 1) {
			 NoticeInput = new VoluntaryNotice(Noticekind.voluntary);
			 NoticeInput.getUserInput(input);
			 Notices.add(NoticeInput);	
			 MenuManager.logger.log("voluntary ���� �߰�");
		 }
		 else if(Kind == 2) {
			 NoticeInput = new CommercialNotice(Noticekind.commercial);
			 NoticeInput.getUserInput(input);
			 Notices.add(NoticeInput);	
			 MenuManager.logger.log("commercial ���� �߰�");
		 }
		 else {
			 System.out.println("1, 2�߿��� �ϳ��� ������ �ּ���."); 
			 MenuManager.logger.log("�߸��� ���� �Է�");
		 }
		 }catch(InputMismatchException e) {
			 System.out.println("1, 2�߿��� �ϳ��� ������ �ּ���." );
			 MenuManager.logger.log("���ڸ� �Է�");
				if(input.hasNext()) {
					input.next();
				}
				Kind = 0;
		 }
		 } 
		}	 
	
		 public void DeleteNotice() { 
			 Scanner input = new Scanner(System.in);// 
			int cnt =0;
			System.out.println("�����ϱ� ���� ���� �ѹ��� �Է��ϼ���: "); 
			while(true) {
		    try {
			int Num = input.nextInt();
			NoNotice(Notices, 1);
			if(Notices.size()>0) {
			for(int i=0; i<Notices.size();i++) {
				NoticeInput = Notices.get(i);
				if(Num == NoticeInput.getNoticeNumber()) {
					  Notices.remove(i);
					  System.out.println(Num+"�� ���� �����Ǿ����ϴ�!");
					  MenuManager.logger.log(Num+"�� ���� ����");
					  cnt++;
				}
			}
			NoNotice(Notices, cnt);
			}
			break;
		    }catch(InputMismatchException e) {
		    	System.out.println("���ڸ� �Է��ϼ���!" );
		    	MenuManager.logger.log("���ڸ� �Է�");
				if(input.hasNext()) {
					input.next();
				}
		    }
		  }
		 } 	 
		 
		 public void EditNotice() {
			 Scanner input = new Scanner(System.in);
			int cnt =0;
			int Editnumber = 0;
			char YesorNo = 'y';
			System.out.println("�����ϱ� ���� ���� �ѹ��� �Է��ϼ���: "); 
			while(true) {
			try {
			int Num = input.nextInt();
			NoNotice(Notices, 1);
			if(Notices.size()>0) {
			for(int i=0; i<Notices.size();i++) {
				NoticeInput = Notices.get(i);
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
								    	MenuManager.logger.log("���ڸ� �Է�");
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
								     case 17: NoticeInput.setComment(NoticeInput, input); break; default: System.out.println("��ȣ�� �ٽ� �Է��ϼ���!"); continue;
								     }
								     System.out.println("������ ����Ͻðڽ��ϱ�?(����Ϸ��� �ƹ� ���ڸ� �Է��� �ּ���. ������ �׸��Ϸ��� n�� �����ּ���.)"); 
								     YesorNo = input.next().charAt(0);
								    }  while (YesorNo != 'n' );
									System.out.println("���� �Ǿ����ϴ�.");
									MenuManager.logger.log(Num+"�� ���� ����");
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
						    	MenuManager.logger.log("���ڸ� �Է�");
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
					     default: System.out.println("��ȣ�� �ٽ� �Է��ϼ���!"); continue;
					     }
					     System.out.println("������ ����Ͻðڽ��ϱ�?(����Ϸ��� �ƹ� ���ڸ� �Է��� �ּ���. ������ �׸��Ϸ��� n�� �����ּ���.)"); 
					     YesorNo = input.next().charAt(0);
					    }  while (YesorNo != 'n' );
						System.out.println("���� �Ǿ����ϴ�.");
						MenuManager.logger.log(Num+"�� ���� ����");
						cnt++;
					}
				}
				}
			NoNotice(Notices, cnt);
			} 
			 break;
			}catch(InputMismatchException e) {
				System.out.println("���ڸ� �Է��ϼ���!" );
				MenuManager.logger.log("���ڸ� �Է�");
				if(input.hasNext()) {
					input.next();
				}
			}
			}
		 }
		 public void ViewNotice(){
			Scanner input = new Scanner(System.in);
			int cnt = 0;
			System.out.println("���� ���ϴ� ���� �ѹ��� �Է��ϼ���: (-1�� �Է��ϸ� ��ϵ� ��� ���� �� �� �ֽ��ϴ�.)");
			while(true) {
			try {
			    int Num = input.nextInt();
			    NoNotice(Notices, 1);
			    if(Notices.size()>0) {
			        if(Num != -1) {	
			            for(int i=0; i<Notices.size();i++) {
				        NoticeInput = Notices.get(i);
				            if(Num == NoticeInput.getNoticeNumber()) {
					           NoticeInput.printNotice();
					           cnt++;
					           MenuManager.logger.log(Num+"�� ���� ���");
				             }				
			            }
			        NoNotice(Notices, cnt);
			           }
			    else {
				    System.out.println("���� ��ϵ� ������ ��: "+ Notices.size());
				    for(int i=0; i<Notices.size();i++) {
				        NoticeInput = Notices.get(i);
					    NoticeInput.printNotice();
			           }
				    MenuManager.logger.log("�� ���� ���");
				    }		
	             }
			     break;
			}catch(InputMismatchException e ) {
				System.out.println("���ڸ� �Է��ϼ���!" );
				MenuManager.logger.log("���ڸ� �Է�");
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
				MenuManager.logger.log("�ۼ��� ���� ����");
			}
    	   else if(Notice.size() - cnt == Notice.size()) {
    		   System.out.println("�ش� ���� �����ϴ�.");
    		   MenuManager.logger.log("���� ã�� ����");
    		   }
       }

	   public int size() {
		   return Notices.size();
	   }
	   
	   public NoticeInput get(int index) {
		   return (Notice) Notices.get(index);
	   }
}