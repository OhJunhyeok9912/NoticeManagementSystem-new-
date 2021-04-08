
public class Notice {
	String NoticeNumber; String NoticeTitle; String CompanyName;
	String location;String period;String career;
	String gender;String age;String academic;
	String salary;String period2;String day;
	String time;String type1;String personnel;
	String type2;String condition1;String condition2;
	String way;String submission;String comment;
	
	public Notice(String NoticeNumber, String NoticeTitle, String CompanyName, String location, String period,
			String career, String gender, String age, String academic, String salary, String period2, String day,
			String time, String type1, String personnel, String type2, String condition1, String condition2, String way,
			String submission, String comment) {
		this.NoticeNumber = NoticeNumber;
		this.NoticeTitle = NoticeTitle;
		this.CompanyName = CompanyName;
		this.location = location;
		this.period = period;
		this.career = career;
		this.gender = gender;
		this.age = age;
		this.academic = academic;
		this.salary = salary;
		this.period2 = period2;
		this.day = day;
		this.time = time;
		this.type1 = type1;
		this.personnel = personnel;
		this.type2 = type2;
		this.condition1 = condition1;
		this.condition2 = condition2;
		this.way = way;
		this.submission = submission;
		this.comment = comment;
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
     
	
	public void setnotice(String NoticeNumber, String NoticeTitle, String CompanyName, String location, String period,
			String career, String gender, String age, String academic, String salary, String period2, String day,
			String time, String type1, String personnel, String type2, String condition1, String condition2, String way,
			String submission, String comment) {
		this.NoticeNumber = NoticeNumber;
		this.NoticeTitle = NoticeTitle;
		this.CompanyName = CompanyName;
		this.location = location;
		this.period = period;
		this.career = career;
		this.gender = gender;
		this.age = age;
		this.academic = academic;
		this.salary = salary;
		this.period2 = period2;
		this.day = day;
		this.time = time;
		this.type1 = type1;
		this.personnel = personnel;
		this.type2 = type2;
		this.condition1 = condition1;
		this.condition2 = condition2;
		this.way = way;
		this.submission = submission;
		this.comment = comment;
	}
}
