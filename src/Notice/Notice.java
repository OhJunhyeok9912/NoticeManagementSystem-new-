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
		System.out.println("���� �ѹ�: "+NoticeNumber); System.out.println("��������: "+NoticeTitle); 
	   	 System.out.println("�ٹ��� ����");System.out.println("ȸ���: "+CompanyName);System.out.println("�ٹ��� ��ġ:" +location); 
	   	 System.out.println("��������");
	   	 System.out.println("�����Ⱓ: "+period); System.out.println("���: "+career);System.out.println("����: "+gender);  
	   	 System.out.println("����: "+age); System.out.println("�з�: "+academic); 
	   	 System.out.println("�ٹ�����");
	   	 System.out.println("�޿�: "+salary);  System.out.println("�ٹ��Ⱓ: "+period2); System.out.println("�ٹ�����: "+day); 
	   	 System.out.println("�ٹ��ð�: "+time);
	   	 System.out.println("��������");
	   	 System.out.println("��������: "+type1);  System.out.println("�����ο�: "+personnel); System.out.println("�������: "+type2); 
	   	 System.out.println("�������: "+condition1); System.out.println("��Ÿ����: "+condition2); 
	   	 System.out.println("��Ÿ����");
	   	 System.out.println("�������: "+way); System.out.println("���⼭��: "+submission); System.out.println("�ڸ�Ʈ: "+comment);  
	}
     
	
	public void getUserInput(Scanner input) {
		System.out.println("���� �ѹ�: (������� �Է��ϼ���.)"); String NoticeNumber = input.nextLine(); this.setNoticeNumber(NoticeNumber);
	     System.out.println("��������: "); String NoticeTitle = input.nextLine(); this.setNoticeTitle(NoticeTitle);
	   	 System.out.println("�ٹ��� ����");   
	   	 System.out.println("ȸ���: "); String CompanyName = input.nextLine(); this.setCompanyName(CompanyName);
	   	 System.out.println("�ٹ��� ��ġ: "); String location = input.nextLine(); this.setLocation(location);
	   	 System.out.println("��������");
	   	 System.out.println("�����Ⱓ: "); String period = input.nextLine(); this.setPeriod(period);
	   	 System.out.println("���: ");  String career = input.nextLine(); this.setCareer(career);
	   	 System.out.println("����: "); String gender = input.nextLine(); this.setGender(gender);
	   	 System.out.println("����: "); String age = input.nextLine(); this.setAge(age);
	   	 System.out.println("�з�: "); String academic = input.nextLine(); this.setAcademic(academic);
	   	 System.out.println("�ٹ�����");
	   	 System.out.println("�޿�: ");  String salary = input.nextLine();  this.setSalary(salary);
	   	 System.out.println("�ٹ��Ⱓ: "); String period2= input.nextLine(); this.setPeriod2(period2);
	   	 System.out.println("�ٹ�����: "); String day= input.nextLine(); this.setDay(day);
	   	 System.out.println("�ٹ��ð�: "); String time= input.nextLine(); this.setTime(time);
	   	 System.out.println("��������");
	   	 System.out.println("��������: "); String type1= input.nextLine(); this.setType1(type1);
	   	 System.out.println("�����ο�: "); String personnel= input.nextLine(); this.setPersonnel (personnel);
	   	 System.out.println("�������: "); String type2= input.nextLine();  this.setType2(type2);
	   	 System.out.println("�������: "); String condition1= input.nextLine(); this.setCondition1 (condition1);
	   	 System.out.println("��Ÿ����: "); String condition2= input.nextLine(); this.setCondition2 (condition2);
	   	 System.out.println("��Ÿ����");
	   	 System.out.println("�������: "); String way= input.nextLine(); this.setWay(way);
	   	 System.out.println("���⼭��: "); String submission= input.nextLine();  this.setSubmission(submission);
	   	 System.out.println("�ڸ�Ʈ: ");  String comment= input.nextLine(); this.setComment(comment);
	}
}

