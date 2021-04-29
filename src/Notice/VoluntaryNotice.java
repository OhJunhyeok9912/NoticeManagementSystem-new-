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
	
	public VoluntaryNotice(Noticekind kind, String NoticeNumber, String NoticeTitle, String place, String location, String period,
			String career, String gender, String age, String academic, String period2, String day,
			String time, String personnel, String condition1, String condition2, String way,
			String submission, String comment) {
		this.kind = kind; this.NoticeNumber = NoticeNumber; this.NoticeTitle = NoticeTitle; this.place = place;this.location = location; this.period = period;
		this.career = career;this.gender = gender;this.age = age;this.academic = academic;this.period2 = period2;this.day = day;
		this.time = time;this.personnel = personnel;this.condition1 = condition1;this.condition2 = condition2;
		this.way = way;this.submission = submission;this.comment = comment;
	}
	
	public VoluntaryNotice() {
		
	}
	
	public void getUserInput(Scanner input) {
		System.out.println("공고 넘버: (순서대로 입력하세요.)"); String NoticeNumber = input.nextLine(); this.setNoticeNumber(NoticeNumber); 
	     System.out.println("공고제목: "); String NoticeTitle = input.nextLine(); this.setNoticeTitle(NoticeTitle);
	   	 System.out.println("활동지 정보");  
	   	 System.out.println("봉사활동처: "); String place = input.nextLine(); this.setPlace(place);
	   	 System.out.println("활동처 위치: "); String location = input.nextLine(); this.setLocation(location);
	   	 System.out.println("모집조건");
	   	 System.out.println("모집기간: "); String period = input.nextLine(); this.setPeriod(period);
	   	 System.out.println("경력: ");  String career = input.nextLine(); this.setCareer(career);
	   	 System.out.println("성별: "); String gender = input.nextLine();  this.setGender(gender);
	   	 System.out.println("나이: "); String age = input.nextLine(); this.setAge(age);
	   	 System.out.println("학력: "); String academic = input.nextLine(); this.setAcademic(academic);
	   	 System.out.println("활동정보");
	   	 System.out.println("활동기간: "); String period2= input.nextLine();  this.setPeriod2(period2);
	   	 System.out.println("활동요일: "); String day= input.nextLine(); this.setDay(day);
	   	 System.out.println("활동시간: "); String time= input.nextLine(); this.setTime(time);
	   	 System.out.println("모집내용");
	   	 System.out.println("모집인원: "); String personnel= input.nextLine(); this.setPersonnel (personnel);
	   	 System.out.println("우대조건: "); String condition1= input.nextLine(); this.setCondition1 (condition1);
	   	 System.out.println("기타조건: "); String condition2= input.nextLine(); this.setCondition2 (condition2);
	   	 System.out.println("기타사항");
	   	 System.out.println("지원방법: "); String way= input.nextLine(); this.setWay(way);
	   	 System.out.println("제출서류: "); String submission= input.nextLine();  this.setSubmission(submission);
	   	 System.out.println("코멘트: ");  String comment= input.nextLine(); this.setComment(comment);
	   	 String salary = "봉사활동"; this.setSalary(salary);
	}
	public void printNotice(){
		String nkind = null;
		switch(this.kind) {
		case commercial:
			nkind = "구인 공고";
			break;
		case voluntary:
			nkind = "봉사 활동";
			break;	
		default : break;	
		}
		System.out.println("목적: "+ nkind);
		System.out.println("공고 넘버: "+NoticeNumber); System.out.println("공고제목: "+NoticeTitle); 
	   	 System.out.println("활동지 정보");System.out.println("봉사활동처: "+place);System.out.println("활동처 위치:" +location); 
	   	 System.out.println("모집조건");
	   	 System.out.println("모집기간: "+period); System.out.println("경력: "+career);System.out.println("성별: "+gender);  
	   	 System.out.println("나이: "+age); System.out.println("학력: "+academic); 
	   	 System.out.println("활동정보");
	   	 System.out.println("활동기간: "+period2); System.out.println("활동요일: "+day);  System.out.println("근무시간: "+time);
	   	 System.out.println("모집내용");
	   	  System.out.println("모집인원: "+personnel);  System.out.println("우대조건: "+condition1); System.out.println("기타조건: "+condition2); 
	   	 System.out.println("기타사항");
	   	 System.out.println("지원방법: "+way); System.out.println("제출서류: "+submission); System.out.println("코멘트: "+comment);  
	}
}
