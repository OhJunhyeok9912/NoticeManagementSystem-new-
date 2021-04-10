package Notice;

import java.util.Scanner;

public class Notice {
	protected Noticekind kind2 = Noticekind.commercial;
	public Noticekind getKind2() {
		return kind2;
	}

	public void setKind2(Noticekind kind) {
		this.kind2 = kind;
	}
	
	protected Noticekind kind1 = Noticekind.voluntary;
	public Noticekind getKind() {
		return kind1;
	}

	public void setKind(Noticekind kind) {
		this.kind1 = kind;
	}

	public String getNoticeNumber() {
		return NoticeNumber;
	}

	public void setNoticeNumber(String noticeNumber) {
		NoticeNumber = noticeNumber;
	}

	public String getNoticeTitle() {
		return NoticeTitle;
	}

	public void setNoticeTitle(String noticeTitle) {
		NoticeTitle = noticeTitle;
	}

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getCareer() {
		return career;
	}

	public void setCareer(String career) {
		this.career = career;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAcademic() {
		return academic;
	}

	public void setAcademic(String academic) {
		this.academic = academic;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getPeriod2() {
		return period2;
	}

	public void setPeriod2(String period2) {
		this.period2 = period2;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getType1() {
		return type1;
	}

	public void setType1(String type1) {
		this.type1 = type1;
	}

	public String getPersonnel() {
		return personnel;
	}

	public void setPersonnel(String personnel) {
		this.personnel = personnel;
	}

	public String getType2() {
		return type2;
	}

	public void setType2(String type2) {
		this.type2 = type2;
	}

	public String getCondition1() {
		return condition1;
	}

	public void setCondition1(String condition1) {
		this.condition1 = condition1;
	}

	public String getCondition2() {
		return condition2;
	}

	public void setCondition2(String condition2) {
		this.condition2 = condition2;
	}

	public String getWay() {
		return way;
	}

	public void setWay(String way) {
		this.way = way;
	}

	public String getSubmission() {
		return submission;
	}

	public void setSubmission(String submission) {
		this.submission = submission;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}


	protected String NoticeNumber; protected String NoticeTitle; protected String CompanyName;
	protected String location;protected String period;protected String career;
	protected String gender;protected String age;protected String academic;
	protected String salary;protected String period2;protected String day;
	protected String time;protected String type1;protected String personnel;
	protected String type2;protected String condition1;protected String condition2;
	protected String way;protected String submission;protected String comment;
	
	public Notice(String NoticeNumber, String NoticeTitle, String CompanyName, String location, String period,
			String career, String gender, String age, String academic, String salary, String period2, String day,
			String time, String type1, String personnel, String type2, String condition1, String condition2, String way,
			String submission, String comment) {
		this.NoticeNumber = NoticeNumber; this.NoticeTitle = NoticeTitle; this.CompanyName = CompanyName;this.location = location; this.period = period;
		this.career = career;this.gender = gender;this.age = age;this.academic = academic;this.salary = salary;this.period2 = period2;this.day = day;
		this.time = time;this.type1 = type1;this.personnel = personnel;this.type2 = type2;this.condition1 = condition1;this.condition2 = condition2;
		this.way = way;this.submission = submission;this.comment = comment;
	}
	
	public Notice() {
		
	}
	
	public void printNotice(){
		System.out.println("공고 넘버: "+NoticeNumber); System.out.println("공고제목: "+NoticeTitle); 
	   	 System.out.println("근무지 정보");System.out.println("회사명: "+CompanyName);System.out.println("근무지 위치:" +location); 
	   	 System.out.println("모집조건");
	   	 System.out.println("모집기간: "+period); System.out.println("경력: "+career);System.out.println("성별: "+gender);  
	   	 System.out.println("나이: "+age); System.out.println("학력: "+academic); 
	   	 System.out.println("근무조건");
	   	 System.out.println("급여: "+salary);  System.out.println("근무기간: "+period2); System.out.println("근무요일: "+day); 
	   	 System.out.println("근무시간: "+time);
	   	 System.out.println("모집내용");
	   	 System.out.println("모집직종: "+type1);  System.out.println("모집인원: "+personnel); System.out.println("고용형태: "+type2); 
	   	 System.out.println("우대조건: "+condition1); System.out.println("기타조건: "+condition2); 
	   	 System.out.println("기타사항");
	   	 System.out.println("지원방법: "+way); System.out.println("제출서류: "+submission); System.out.println("코멘트: "+comment);  
	}
     
	
	public void getUserInput(Scanner input) {
		System.out.println("공고 넘버: (순서대로 입력하세요.)"); String NoticeNumber = input.nextLine(); this.setNoticeNumber(NoticeNumber);
	     System.out.println("공고제목: "); String NoticeTitle = input.nextLine(); this.setNoticeTitle(NoticeTitle);
	   	 System.out.println("근무지 정보");   
	   	 System.out.println("회사명: "); String CompanyName = input.nextLine(); this.setCompanyName(CompanyName);
	   	 System.out.println("근무지 위치: "); String location = input.nextLine(); this.setLocation(location);
	   	 System.out.println("모집조건");
	   	 System.out.println("모집기간: "); String period = input.nextLine(); this.setPeriod(period);
	   	 System.out.println("경력: ");  String career = input.nextLine(); this.setCareer(career);
	   	 System.out.println("성별: "); String gender = input.nextLine(); this.setGender(gender);
	   	 System.out.println("나이: "); String age = input.nextLine(); this.setAge(age);
	   	 System.out.println("학력: "); String academic = input.nextLine(); this.setAcademic(academic);
	   	 System.out.println("근무조건");
	   	 System.out.println("급여: ");  String salary = input.nextLine();  this.setSalary(salary);
	   	 System.out.println("근무기간: "); String period2= input.nextLine(); this.setPeriod2(period2);
	   	 System.out.println("근무요일: "); String day= input.nextLine(); this.setDay(day);
	   	 System.out.println("근무시간: "); String time= input.nextLine(); this.setTime(time);
	   	 System.out.println("모집내용");
	   	 System.out.println("모집직종: "); String type1= input.nextLine(); this.setType1(type1);
	   	 System.out.println("모집인원: "); String personnel= input.nextLine(); this.setPersonnel (personnel);
	   	 System.out.println("고용형태: "); String type2= input.nextLine();  this.setType2(type2);
	   	 System.out.println("우대조건: "); String condition1= input.nextLine(); this.setCondition1 (condition1);
	   	 System.out.println("기타조건: "); String condition2= input.nextLine(); this.setCondition2 (condition2);
	   	 System.out.println("기타사항");
	   	 System.out.println("지원방법: "); String way= input.nextLine(); this.setWay(way);
	   	 System.out.println("제출서류: "); String submission= input.nextLine();  this.setSubmission(submission);
	   	 System.out.println("코멘트: ");  String comment= input.nextLine(); this.setComment(comment);
	}
}

