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
		 ArrayList<Notice> addNotice = new ArrayList<Notice>(); // Notice타입의 arrayList에 새로 추가한 공고를 넣는다. 
	     System.out.println("공고 넘버: (순서대로 입력하세요.)"); String NoticeNumber = input.nextLine(); 
	     System.out.println("공고제목: "); String NoticeTitle = input.nextLine();
	   	 System.out.println("근무지 정보");   
	   	 System.out.println("회사명: "); String CompanyName = input.nextLine(); 
	   	 System.out.println("근무지 위치: "); String location = input.nextLine(); 
	   	 System.out.println("모집조건");
	   	 System.out.println("모집기간: "); String period = input.nextLine(); 
	   	 System.out.println("경력: ");  String career = input.nextLine();
	   	 System.out.println("성별: "); String gender = input.nextLine(); 
	   	 System.out.println("나이: "); String age = input.nextLine(); 
	   	 System.out.println("학력: "); String academic = input.nextLine(); 
	   	 System.out.println("근무조건");
	   	 System.out.println("급여: ");  String salary = input.nextLine();  
	   	 System.out.println("근무기간: "); String period2= input.nextLine(); 
	   	 System.out.println("근무요일: "); String day= input.nextLine();
	   	 System.out.println("근무시간: "); String time= input.nextLine(); 
	   	 System.out.println("모집내용");
	   	 System.out.println("모집직종: "); String type1= input.nextLine();
	   	 System.out.println("모집인원: "); String personnel= input.nextLine();
	   	 System.out.println("고용형태: "); String type2= input.nextLine(); 
	   	 System.out.println("우대조건: "); String condition1= input.nextLine(); 
	   	 System.out.println("기타조건: "); String condition2= input.nextLine(); 
	   	 System.out.println("기타사항");
	   	 System.out.println("지원방법: "); String way= input.nextLine();
	   	 System.out.println("제출서류: "); String submission= input.nextLine(); 
	   	 System.out.println("코멘트: ");  String comment= input.nextLine();   
	   	 notice = new Notice(NoticeNumber, NoticeTitle, CompanyName, location, period, career, gender, age, academic, salary, 
	   			             period2, day, time, type1, personnel, type2, condition1, condition2, way, submission, comment);
	   	
	   	 addNotice.add(notice);	
		 return addNotice; // 공고 작성이 끝나면 공고를 반환한다. 
		 }	 
	
		 public void DeleteNotice(ArrayList<Notice> Notice) { // 
			Notice deleteNotice;
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
				}
			}
			}
		 } 	 
		 
		 public void EditNotice(ArrayList<Notice> Notice) {
			Notice editNotice;
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
					     case "15": editNotice.setType2(Edit); break; case "16": editNotice.setCondition1(Edit); break;
					     case "17": editNotice.setCondition2(Edit); break; case "18": editNotice.setWay(Edit); break;
					     case "19": editNotice.setSubmission(Edit); break; case "20": editNotice.setComment(Edit); break;	
					     }
					     System.out.println("편집을 계속하시겠습니까?(y/n)"); 
					     YesorNo = input.nextLine();
					    }  while (!(YesorNo.equals("n")));
						System.out.println("편집 되었습니다.");
					}

				}
			} 
		 }
		 public void ViewNotice(ArrayList<Notice> Notice){
			Notice viewNotice;
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
