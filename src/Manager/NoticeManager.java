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

	
	NoticeManager(){ //input 매개변수를 삭제
		
	}
	
	Notice notice;
	NoticeInput NoticeInput;
	ArrayList<NoticeInput> Notices = new ArrayList<NoticeInput>();
	
	public void AddNotice(NoticeInput noticeinput) {
		Notices.add(noticeinput);
	}
	
	public void AddNotice() {
		 Scanner input = new Scanner(System.in); //전역변수였던 input을 지역변수로 바꾸어 새로 실행할 때도 종료하기전의 내용을 그대로 가져올 수 있다.  
		 int Kind = 0;
		 System.out.println("구인 공고의 목적을 선택하세요  1: 봉사자 모집, 2: 기업, 가게의 구인 ");
		 while (Kind !=1 && Kind !=2) {
		 try {
		 Kind = input.nextInt();
		 if(Kind == 1) {
			 NoticeInput = new VoluntaryNotice(Noticekind.voluntary);
			 NoticeInput.getUserInput(input);
			 Notices.add(NoticeInput);	
			 MenuManager.logger.log("voluntary 공고 추가");
		 }
		 else if(Kind == 2) {
			 NoticeInput = new CommercialNotice(Noticekind.commercial);
			 NoticeInput.getUserInput(input);
			 Notices.add(NoticeInput);	
			 MenuManager.logger.log("commercial 공고 추가");
		 }
		 else {
			 System.out.println("1, 2중에서 하나를 선택해 주세요."); 
			 MenuManager.logger.log("잘못된 숫자 입력");
		 }
		 }catch(InputMismatchException e) {
			 System.out.println("1, 2중에서 하나를 선택해 주세요." );
			 MenuManager.logger.log("문자를 입력");
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
			System.out.println("삭제하기 위한 공고 넘버를 입력하세요: "); 
			while(true) {
		    try {
			int Num = input.nextInt();
			NoNotice(Notices, 1);
			if(Notices.size()>0) {
			for(int i=0; i<Notices.size();i++) {
				NoticeInput = Notices.get(i);
				if(Num == NoticeInput.getNoticeNumber()) {
					  Notices.remove(i);
					  System.out.println(Num+"번 공고가 삭제되었습니다!");
					  MenuManager.logger.log(Num+"번 공고를 삭제");
					  cnt++;
				}
			}
			NoNotice(Notices, cnt);
			}
			break;
		    }catch(InputMismatchException e) {
		    	System.out.println("숫자를 입력하세요!" );
		    	MenuManager.logger.log("문자를 입력");
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
			System.out.println("편집하기 위한 공고 넘버를 입력하세요: "); 
			while(true) {
			try {
			int Num = input.nextInt();
			NoNotice(Notices, 1);
			if(Notices.size()>0) {
			for(int i=0; i<Notices.size();i++) {
				NoticeInput = Notices.get(i);
				if(Num == NoticeInput.getNoticeNumber()) {
						System.out.println("편집할 항목의 번호를 입력하세요. 번호를 잘 확인하세요"); 
						if(NoticeInput.getKind() == Noticekind.voluntary) {	
							 do {
								 showEditMenu(NoticeInput);   
								 while(true) {
								 try {								     
     							     Editnumber = input.nextInt();
     							     break;
								    }catch(InputMismatchException e) {
								    	System.out.println("숫자를 입력하세요!" );
								    	MenuManager.logger.log("문자를 입력");
								    	if(input.hasNext()) {
											input.next();
										}
								    }
								 }
								    System.out.println("편집할 내용을 입력하세요."); 
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
								     case 17: NoticeInput.setComment(NoticeInput, input); break; default: System.out.println("번호를 다시 입력하세요!"); continue;
								     }
								     System.out.println("편집을 계속하시겠습니까?(계속하려면 아무 문자를 입력해 주세요. 편집은 그만하려면 n을 눌러주세요.)"); 
								     YesorNo = input.next().charAt(0);
								    }  while (YesorNo != 'n' );
									System.out.println("편집 되었습니다.");
									MenuManager.logger.log(Num+"번 공고를 편집");
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
						    	System.out.println("숫자를 입력하세요!" );
						    	MenuManager.logger.log("문자를 입력");
						    	if(input.hasNext()) {
									input.next();
								}
						    }
				    	}
					    System.out.println("편집할 내용을 입력하세요."); 
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
					     default: System.out.println("번호를 다시 입력하세요!"); continue;
					     }
					     System.out.println("편집을 계속하시겠습니까?(계속하려면 아무 문자를 입력해 주세요. 편집은 그만하려면 n을 눌러주세요.)"); 
					     YesorNo = input.next().charAt(0);
					    }  while (YesorNo != 'n' );
						System.out.println("편집 되었습니다.");
						MenuManager.logger.log(Num+"번 공고를 편집");
						cnt++;
					}
				}
				}
			NoNotice(Notices, cnt);
			} 
			 break;
			}catch(InputMismatchException e) {
				System.out.println("숫자를 입력하세요!" );
				MenuManager.logger.log("문자를 입력");
				if(input.hasNext()) {
					input.next();
				}
			}
			}
		 }
		 public void ViewNotice(){
			Scanner input = new Scanner(System.in);
			int cnt = 0;
			System.out.println("보길 원하는 공고 넘버를 입력하세요: (-1을 입력하면 등록된 모든 공고를 볼 수 있습니다.)");
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
					           MenuManager.logger.log(Num+"번 공고를 출력");
				             }				
			            }
			        NoNotice(Notices, cnt);
			           }
			    else {
				    System.out.println("현재 등록된 공고의 수: "+ Notices.size());
				    for(int i=0; i<Notices.size();i++) {
				        NoticeInput = Notices.get(i);
					    NoticeInput.printNotice();
			           }
				    MenuManager.logger.log("전 공고를 출력");
				    }		
	             }
			     break;
			}catch(InputMismatchException e ) {
				System.out.println("숫자를 입력하세요!" );
				MenuManager.logger.log("문자를 입력");
				if(input.hasNext()) {
					input.next();
				}
			}
		   }
			
		 }
		 
       public void showEditMenu(NoticeInput NoticeInput) {
    	   if(NoticeInput.getKind() == Noticekind.voluntary) {
    		   System.out.println("1: 공고제목 2: 봉사활동처, 3: 활동처 위치, 4: 모집기간, 5: 경력, 6: 성별, 7: 나이 , 8: 학력, 9: 활동기간, 10: 활동요일" );
			    System.out.println("11: 활동시간, 12: 모집인원 13: 우대조건, 14: 기타조건, 15: 지원방법, 16: 제출서류, 17: 코멘트" );
    	   }
    	   else if (NoticeInput.getKind() == Noticekind.commercial) {
    		   System.out.println("1: 공고제목 2: 회사명, 3: 근무지 위치, 4: 모집기간, 5: 경력, 6: 성별, 7: 나이 , 8: 학력, 9: 급여, 10: 근무기간" );
			    System.out.println("11: 근무요일, 12: 근무시간 13: 모집직종, 14: 모집인원, 15: 고용형태, 16: 우대조건, 17: 기타조건, 18: 지원방법 , 19: 제출서류, 20: 코멘트" );   
    	   }
       }
       
       
       public void NoNotice(ArrayList<NoticeInput> Notice, int cnt) {
    	   if(Notice.size() == 0) {
				System.out.println("현재 작성되어 있는 공고가 없습니다.");
				MenuManager.logger.log("작성된 공고가 없음");
			}
    	   else if(Notice.size() - cnt == Notice.size()) {
    		   System.out.println("해당 공고가 없습니다.");
    		   MenuManager.logger.log("공고를 찾지 못함");
    		   }
       }

	   public int size() {
		   return Notices.size();
	   }
	   
	   public NoticeInput get(int index) {
		   return (Notice) Notices.get(index);
	   }
}