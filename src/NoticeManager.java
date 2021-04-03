import java.util.ArrayList;
import java.util.Scanner;

public class NoticeManager {
	Scanner input;
	
	NoticeManager(Scanner input){
		this.input = input;
	}
	
	Notice notice;
	public ArrayList<Notice> AddNotice() {
		 notice = new Notice();
		 ArrayList<Notice> addNotice = new ArrayList<>(); // Notice타입의 arrayList에 새로 추가한 공고를 넣는다. 
	     System.out.println("공고 넘버: (순서대로 입력하세요.)"); notice.NoticeNumber = input.nextLine(); 
	     System.out.println("공고제목: "); notice.NoticeTitle = input.nextLine();
	   	 System.out.println("근무지 정보");   
	   	 System.out.println("회사명: "); notice.CompanyName = input.nextLine(); 
	   	 System.out.println("근무지 위치: "); notice.location = input.nextLine(); 
	   	 System.out.println("모집조건");
	   	 System.out.println("모집기간: "); notice.period = input.nextLine(); 
	   	 System.out.println("경력: ");  notice.career = input.nextLine();
	   	 System.out.println("성별: "); notice.gender = input.nextLine(); 
	   	 System.out.println("나이: "); notice.age = input.nextLine(); 
	   	 System.out.println("학력: "); notice.academic = input.nextLine(); 
	   	 System.out.println("근무조건");
	   	 System.out.println("급여: ");  notice.salary = input.nextLine();  
	   	 System.out.println("근무기간: "); notice.period2= input.nextLine(); 
	   	 System.out.println("근무요일: "); notice.day= input.nextLine();
	   	 System.out.println("근무시간: "); notice.time= input.nextLine(); 
	   	 System.out.println("모집내용");
	   	 System.out.println("모집직종: "); notice.type1= input.nextLine();
	   	 System.out.println("모집인원: "); notice.personnel= input.nextLine();
	   	 System.out.println("고용형태: "); notice.type2= input.nextLine(); 
	   	 System.out.println("우대조건: "); notice.condition1= input.nextLine(); 
	   	 System.out.println("기타조건: "); notice.condition2= input.nextLine(); 
	   	 System.out.println("기타사항");
	   	 System.out.println("지원방법: "); notice.way= input.nextLine();
	   	 System.out.println("제출서류: "); notice.submission= input.nextLine(); 
	   	 System.out.println("코멘트: ");  notice.comment= input.nextLine();   	
	   	 notice.setnotice(notice.NoticeNumber,notice.NoticeTitle ,notice.CompanyName, notice.location, notice.period , notice.career,notice.gender,
	   	                   notice.age,notice.academic,notice.salary,notice.period2,notice.day,notice.time,notice.type1,notice.personnel,notice.type2,
	   	                notice.condition1,notice.condition2,notice.way,notice.submission,notice.comment);
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
				if(Num.equals(deleteNotice.NoticeNumber)) {
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
				if(Num.equals(editNotice.NoticeNumber)) {
						System.out.println("편집할 항목의 번호를 입력하세요. 번호를 잘 확인하세요"); 
						System.out.println("1: 공고제목 2: 회사명, 3: 근무지 위치, 4: 모집기간, 5: 경력, 6: 성별, 7: 나이 , 8: 학력, 9: 급여, 10: 근무기간" );
						System.out.println("11: 근무요일, 12: 근무시간 13: 모집직종, 14: 모집인원, 15: 고용형태, 16: 우대조건, 17: 기타조건, 18: 지원방법 , 19: 제출서류, 20: 코멘트" );
						String Editnumber = input.nextLine();
						System.out.println("편집할 내용을 입력하세요."); 
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
						System.out.println("편집 되었습니다.");
					}

				}
			} 
		 }
		 public void ViewNotice(ArrayList<Notice> Notice){
			Notice viewNotice;
			System.out.println("보길 원하는 공고 넘버를 입력하세요: ");
			String Num = input.nextLine();
			if(Notice.size() == 0) {
				System.out.println("공고가 없습니다.");
			}
			else if(Notice.size()>0) {
			for(int i=0; i<Notice.size();i++) {
				viewNotice = Notice.get(i);
				if(Num.equals(viewNotice.NoticeNumber)) {
					  viewNotice.printNotice();
				}
			}
			}
			
	  }	 	
}

