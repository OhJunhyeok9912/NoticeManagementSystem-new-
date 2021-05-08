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
		 ArrayList<NoticeInput> addNotice = new ArrayList<NoticeInput>(); // Notice타입의 arrayList에 새로 추가한 공고를 넣는다. 
		 String Kind = "0";
		 NoticeInput NoticeInput;
		 while (!Kind.equals("1") && !Kind.equals("2")) {
		 System.out.println("구인 공고의 목적을 선택하세요  1: 봉사자 모집, 2: 기업, 가게의 구인 ");
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
			 System.out.println("1, 2중에서 하나를 선택해 주세요.");
		 }  
		 }
		 return addNotice; // 공고 작성이 끝나면 공고를 반환한다. 
		 }	 
	
		 public void DeleteNotice(ArrayList<NoticeInput> Notice) { // 
			NoticeInput deleteNotice;
			int s =0;
			System.out.println("삭제하기 위한 공고 넘버를 입력하세요: "); 
			String Num = input.nextLine();
			if(Notice.size() == 0) {
				System.out.println("공고가 없습니다.");
			}

			else if(Notice.size()>0) {
			for(int i=0; i<Notice.size();i++) {
				deleteNotice = Notice.get(i);
				if(Num.equals(deleteNotice.getNoticeNumber())) {
					  Notice.remove(i);
					  System.out.println("공고가 삭제되었습니다!");
					  s++;
				}
			}
			if(Notice.size() - s == Notice.size()) {System.out.println("공고가 없습니다.");}
			}
		 } 	 
		 
		 public void EditNotice(ArrayList<NoticeInput> Notice) {
			NoticeInput editNotice;
			int s =0;
			System.out.println("편집하기 위한 공고 넘버를 입력하세요: "); 
			String Num = input.nextLine();
			if(Notice.size() == 0) {
				System.out.println("공고가 없습니다.");
			}
			else if(Notice.size()>0) {
			for(int i=0; i<Notice.size();i++) {
				editNotice = Notice.get(i);
				if(Num.equals(editNotice.getNoticeNumber())) {
					   System.out.println("편집을 위해 y를 눌러주세요."); 
					    String YesorNo = input.nextLine();
						System.out.println("편집할 항목의 번호를 입력하세요. 번호를 잘 확인하세요"); 
						if(editNotice.getKind() == Noticekind.voluntary) {	
							 do {
							    	System.out.println("1: 공고제목 2: 봉사활동처, 3: 활동처 위치, 4: 모집기간, 5: 경력, 6: 성별, 7: 나이 , 8: 학력, 9: 활동기간, 10: 활동요일" );
								    System.out.println("11: 활동시간, 12: 모집인원 13: 우대조건, 14: 기타조건, 15: 지원방법, 16: 제출서류, 17: 코멘트" );
								    String Editnumber = input.nextLine();
								    System.out.println("편집할 내용을 입력하세요."); 
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
								     System.out.println("편집을 계속하시겠습니까?(y/n)"); 
								     YesorNo = input.nextLine();
								    }  while (!(YesorNo.equals("n")));
									System.out.println("편집 되었습니다.");
									s++;
						}
						else if(editNotice.getKind() == Noticekind.commercial)  {
				    do {
				    	System.out.println("1: 공고제목 2: 회사명, 3: 근무지 위치, 4: 모집기간, 5: 경력, 6: 성별, 7: 나이 , 8: 학력, 9: 급여, 10: 근무기간" );
					    System.out.println("11: 근무요일, 12: 근무시간 13: 모집직종, 14: 모집인원, 15: 고용형태, 16: 우대조건, 17: 기타조건, 18: 지원방법 , 19: 제출서류, 20: 코멘트" );
					    String Editnumber = input.nextLine();
					    System.out.println("편집할 내용을 입력하세요."); 
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
					     System.out.println("편집을 계속하시겠습니까?(y/n)"); 
					     YesorNo = input.nextLine();
					    }  while (!(YesorNo.equals("n")));
						System.out.println("편집 되었습니다.");
						s++;
					}
				}
				}
			if(Notice.size() - s == Notice.size()) {System.out.println("공고가 없습니다.");}
			} 
		 }
		 public void ViewNotice(ArrayList<NoticeInput> Notice){
			NoticeInput viewNotice;
			int s = 0;
			System.out.println("보길 원하는 공고 넘버를 입력하세요: ");
			String Num = input.nextLine();
			if(Notice.size() == 0) {
				System.out.println("공고가 없습니다.");
			}

			else if(Notice.size()>0) {
			for(int i=0; i<Notice.size();i++) {
				viewNotice = Notice.get(i);
				if(Num.equals(viewNotice.getNoticeNumber())) {
					  viewNotice.printNotice();
					  s++;
				}
				
			}
			if(Notice.size() - s == Notice.size()) {System.out.println("공고가 없습니다.");}

			}
			
	  }	 	
}
