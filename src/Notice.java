
public class Notice {
	String NoticeNumber; String NoticeTitle; String CompanyName;
	String location;String period;String career;
	String gender;String age;String academic;
	String salary;String period2;String day;
	String time;String type1;String personnel;
	String type2;String condition1;String condition2;
	String way;String submission;String comment;
	
	public Notice(String noticeNumber, String noticeTitle, String companyName, String location, String period,
			String career, String gender, String age, String academic, String salary, String period2, String day,
			String time, String type1, String personnel, String type2, String condition1, String condition2, String way,
			String submission, String comment) {
		this.NoticeNumber = noticeNumber;
		this.NoticeTitle = noticeTitle;
		this.CompanyName = companyName;
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
     
	
	public void setnotice(String noticeNumber, String noticeTitle, String companyName, String location, String period,
			String career, String gender, String age, String academic, String salary, String period2, String day,
			String time, String type1, String personnel, String type2, String condition1, String condition2, String way,
			String submission, String comment) {
		this.NoticeNumber = noticeNumber;
		this.NoticeTitle = noticeTitle;
		this.CompanyName = companyName;
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
