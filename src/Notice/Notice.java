package Notice;

import java.util.InputMismatchException;
import java.util.Scanner;

import Ex.NullException;
import Notice.Noticekind;
public abstract class Notice implements NoticeInput {
	
    /*getter setter*/
	public Noticekind getKind() {
		return kind;
	}

	public void setKind(Noticekind kind) {
		this.kind = kind;
	}

	public int getNoticeNumber() {
		return NoticeNumber;
	}

	public void setNoticeNumber(int noticeNumber) {
		NoticeNumber = noticeNumber;
	}

	public String getNoticeTitle() {
		return NoticeTitle;
	}

	public void setNoticeTitle(String noticeTitle) throws NullException{
		if(noticeTitle.equals("")) {
			throw new NullException();
		}
		
		NoticeTitle = noticeTitle;
	}

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName)throws NullException {
		if(companyName.equals("")) {
			throw new NullException();
		}
		CompanyName = companyName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) throws NullException{
		if(location.equals("")) {
			throw new NullException();
		}
		this.location = location;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) throws NullException{
		if(period.equals("")) {
			throw new NullException();
		}
		this.period = period;
	}

	public String getCareer() {
		return career;
	}

	public void setCareer(String career)throws NullException {
		if(career.equals("")) {
			throw new NullException();
		}
		this.career = career;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender)throws NullException {
		if(gender.equals("")) {
			throw new NullException();
		}
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) throws NullException{
		if(age.equals("")) {
			throw new NullException();
		}
		this.age = age;
	}

	public String getAcademic() {
		return academic;
	}

	public void setAcademic(String academic)throws NullException {
		if(academic.equals("")) {
			throw new NullException();
		}
		this.academic = academic;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary)throws NullException {
		if(salary.equals("")) {
			throw new NullException();
		}
		this.salary = salary;
	}

	public String getPeriod2() {
		return period2;
	}

	public void setPeriod2(String period2) throws NullException{
		if(period2.equals("")) {
			throw new NullException();
		}
		this.period2 = period2;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day)throws NullException {
		if(day.equals("")) {
			throw new NullException();
		}
		this.day = day;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) throws NullException{
		if(time.equals("")) {
			throw new NullException();
		}
		this.time = time;
	}

	public String getType1() {
		return type1;
	}

	public void setType1(String type1)throws NullException {
		if(type1.equals("")) {
			throw new NullException();
		}
		this.type1 = type1;
	}

	public String getPersonnel() {
		return personnel;
	}

	public void setPersonnel(String personnel) throws NullException{
		if(personnel.equals("")) {
			throw new NullException();
		}
		this.personnel = personnel;
	}

	public String getType2() {
		return type2;
	}

	public void setType2(String type2) throws NullException{
		if(type2.equals("")) {
			throw new NullException();
		}
		this.type2 = type2;
	}

	public String getCondition1() {
		return condition1;
	}

	public void setCondition1(String condition1)throws NullException {
		if(condition1.equals("")) {
			throw new NullException();
		}
		this.condition1 = condition1;
	}

	public String getCondition2() {
		return condition2;
	}

	public void setCondition2(String condition2) throws NullException{
		if(condition2.equals("")) {
			throw new NullException();
		}
		this.condition2 = condition2;
	}

	public String getWay() {
		return way;
	}

	public void setWay(String way) throws NullException{
		if(way.equals("")) {
			throw new NullException();
		}
		this.way = way;
	}

	public String getSubmission() {
		return submission;
	}

	public void setSubmission(String submission)throws NullException {
		if(submission.equals("")) {
			throw new NullException();
		}
		this.submission = submission;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment){
		this.comment = comment;
	}
	/*����, ������*/	
	protected Noticekind kind;
	protected int NoticeNumber; protected String NoticeTitle; protected String CompanyName;
	protected String location;protected String period;protected String career;
	protected String gender;protected String age;protected String academic;
	protected String salary;protected String period2;protected String day;
	protected String time;protected String type1;protected String personnel;
	protected String type2;protected String condition1;protected String condition2;
	protected String way;protected String submission;protected String comment;
		
	public Notice() {
		
	}
	
	public Notice(Noticekind kind){
		this.kind = kind;
	}
	/* �޼ҵ�� ����ó�� */
	public abstract void printNotice();
	public String getKindString() {
		String nkind = null;
		switch(this.kind) {
		case commercial:
			nkind = "���� ����";
			break;
		case voluntary:
			nkind = "���� Ȱ��";
			break;	
		default : break;	
		}
		return nkind;
	}
	
	public void setNoticeNumber(NoticeInput NoticeInput, Scanner input) {
		System.out.println("*���� �ѹ�: (������� �Է��ϼ���.)"); 
		while(true) {
			try {
			NoticeNumber = input.nextInt(); 
			this.setNoticeNumber(NoticeNumber);
			break;
			}catch(InputMismatchException e) {
				System.out.println("���ڸ� �Է��ϼ���!" );
				if(input.hasNext()) {
					input.next();
				}
			}		
		}
		
	}
	
	public void setNoticeTitle(NoticeInput NoticeInput, Scanner input) {
		while(true) {
		System.out.println("*��������: "); 
		NoticeTitle = input.nextLine(); 
		try {
			this.setNoticeTitle(NoticeTitle);
			break;
		} catch (NullException e) {
			System.out.println("�ݵ�� �Է��ؾ� �մϴ�!");
		}
	   }
	}
	
	public void setCompanyName(NoticeInput NoticeInput, Scanner input) {
		while(true) {
		if(NoticeInput.getKind() == Noticekind.commercial) {
		System.out.println("*ȸ���: "); 
		CompanyName = input.nextLine();
        try {
			this.setCompanyName(CompanyName);
			break;
		} catch (NullException e) {
			System.out.println("�ݵ�� �Է��ؾ� �մϴ�!");
		}
		}
		else if(NoticeInput.getKind() == Noticekind.voluntary) {
			System.out.println("*������� : "); 
			CompanyName = input.nextLine(); 
			try {
				this.setCompanyName(CompanyName);
				break;
			} catch (NullException e) {
				System.out.println("�ݵ�� �Է��ؾ� �մϴ�!");
			}
		}
	  }
	}
	
	public void setLocation(NoticeInput NoticeInput, Scanner input) {
		while(true) {
		if(NoticeInput.getKind() == Noticekind.commercial) {
		System.out.println("*�ٹ��� ��ġ: "); 
		location = input.nextLine(); 
		try {
			this.setLocation(location);
			break;
		} catch (NullException e) {
			System.out.println("�ݵ�� �Է��ؾ� �մϴ�!");
		}
		}
		else if (NoticeInput.getKind() == Noticekind.voluntary) {
			 System.out.println("*Ȱ��ó ��ġ: "); 
			 location = input.nextLine(); 
			 try {
				this.setLocation(location);
				break;
			} catch (NullException e) {
				System.out.println("�ݵ�� �Է��ؾ� �մϴ�!");
			}
		}
		}
	}
	
	public void setPeriod(NoticeInput NoticeInput, Scanner input) {
		while(true) {
		System.out.println("*�����Ⱓ: ");
		period = input.nextLine(); 
		try {
			this.setPeriod(period);
			break;
		} catch (NullException e) {
			System.out.println("�ݵ�� �Է��ؾ� �մϴ�!");
		}
	  }
	}

	public void setCareer(NoticeInput NoticeInput, Scanner input) {
		while(true) {
		System.out.println("*���: ");  
		career = input.nextLine(); 
		try {
			this.setCareer(career);
			break;
		} catch (NullException e) {
			System.out.println("�ݵ�� �Է��ؾ� �մϴ�!");
		}
		}
	}
	public void setGender(NoticeInput NoticeInput, Scanner input) {
		while(true) {
		System.out.println("*����: "); 
		gender = input.nextLine(); 
		try {
			this.setGender(gender);
			break;
		} catch (NullException e) {
			System.out.println("�ݵ�� �Է��ؾ� �մϴ�!");
		}
	   }
	}
	public void setAge(NoticeInput NoticeInput, Scanner input) {
		while(true) {
		System.out.println("*����: "); 
		age = input.nextLine(); 
		try {
			this.setAge(age);
			break;
		} catch (NullException e) {
			System.out.println("�ݵ�� �Է��ؾ� �մϴ�!");
		}
	  }
	}
	public void setAcademic(NoticeInput NoticeInput, Scanner input) {
		while(true) {
		System.out.println("*�з�: "); 
		academic = input.nextLine(); 
		try {
			this.setAcademic(academic);
			break;
		} catch (NullException e) {
			System.out.println("�ݵ�� �Է��ؾ� �մϴ�!");
		}
		}
	}
	public void setPeriod2(NoticeInput NoticeInput, Scanner input) {
		while(true) {
		if(NoticeInput.getKind() == Noticekind.commercial) {
		System.out.println("*�ٹ��Ⱓ: "); 
		period2= input.nextLine(); 
		try {
			this.setPeriod2(period2);
			break;
		} catch (NullException e) {
			System.out.println("�ݵ�� �Է��ؾ� �մϴ�!");
		}
		}
		else if (NoticeInput.getKind() == Noticekind.voluntary) {
			System.out.println("*Ȱ���Ⱓ: "); 
			period2= input.nextLine();  
			try {
				setPeriod2(period2);
				break;
			} catch (NullException e) {
				System.out.println("�ݵ�� �Է��ؾ� �մϴ�!");
			}
		}
		}
	}
	public void setDay(NoticeInput NoticeInput, Scanner input) {
		while(true) {
		if(NoticeInput.getKind() == Noticekind.commercial) {
		System.out.println("*�ٹ�����: ");
		day= input.nextLine();
		try {
			this.setDay(day);
			break;
		} catch (NullException e) {
			System.out.println("�ݵ�� �Է��ؾ� �մϴ�!");
		}
		}
		else if (NoticeInput.getKind() == Noticekind.voluntary) {
			System.out.println("*Ȱ������: "); 
		    day= input.nextLine(); 
		    try {
				this.setDay(day);
				break;
			} catch (NullException e) {
				System.out.println("�ݵ�� �Է��ؾ� �մϴ�!");
			}
	     }
		}
	}
	public void setType1(NoticeInput NoticeInput, Scanner input) {
		while(true) { 
		System.out.println("*��������: ");
		 type1= input.nextLine(); 
		 try {
			this.setType1(type1);
			break;
		} catch (NullException e) {
			System.out.println("�ݵ�� �Է��ؾ� �մϴ�!");
		}
		}
	}
	public void setPersonnel(NoticeInput NoticeInput, Scanner input) {
		while(true) {
		System.out.println("*�����ο�: "); 
		personnel= input.nextLine(); 
		try {
			this.setPersonnel (personnel);
			break;
		} catch (NullException e) {
			System.out.println("�ݵ�� �Է��ؾ� �մϴ�!");
		}
		}
	}
	public void setType2(NoticeInput NoticeInput, Scanner input) {
		while(true) {
		System.out.println("*�������: "); 
		type2= input.nextLine();  
		try {
			this.setType2(type2);
			break;
		} catch (NullException e) {
			System.out.println("�ݵ�� �Է��ؾ� �մϴ�!");
		}
		}
	}
	public void setTime(NoticeInput NoticeInput, Scanner input) {
		while(true) {
		if(NoticeInput.getKind() == Noticekind.commercial) {
		System.out.println("*�ٹ��ð�: "); 
		time= input.nextLine(); 
		try {
			this.setTime(time);
			break;
		} catch (NullException e) {
			System.out.println("�ݵ�� �Է��ؾ� �մϴ�!");
		}
		}
		else if (NoticeInput.getKind() == Noticekind.voluntary) {
			System.out.println("*Ȱ���ð�: "); 
			time= input.nextLine(); 
			try {
				this.setTime(time);
				break;
			} catch (NullException e) {
				System.out.println("�ݵ�� �Է��ؾ� �մϴ�!");
			}
		}
		}
	}
	public void setCondition1(NoticeInput NoticeInput, Scanner input) {
		while(true) {
		System.out.println("*�������: "); 
		condition1= input.nextLine(); 
		try {
			this.setCondition1 (condition1);
			break;
		} catch (NullException e) {
			System.out.println("�ݵ�� �Է��ؾ� �մϴ�!");
		}
		}
	}
	public void setCondition2(NoticeInput NoticeInput, Scanner input) {
		while(true) {
		System.out.println("*��Ÿ����: "); 
		condition2= input.nextLine(); 
		try {
			this.setCondition2(condition2);
			break;
		} catch (NullException e) {
			System.out.println("�ݵ�� �Է��ؾ� �մϴ�!");
		}
		}
	}
	public void setSubmission(NoticeInput NoticeInput, Scanner input) {
		 while(true) {
			 System.out.println("*���⼭��: "); 
			 submission= input.nextLine();  
			 try {
				this.setSubmission(submission);
				break;
			} catch (NullException e) {
				System.out.println("�ݵ�� �Է��ؾ� �մϴ�!");
			}
			 }
	}
	public void setSalary(NoticeInput NoticeInput, Scanner input) {
		while(true) {
		System.out.println("*�޿�: ");  
		salary = input.nextLine();  
		try {
			this.setSalary(salary);
			break;
		} catch (NullException e) {
			System.out.println("�ݵ�� �Է��ؾ� �մϴ�!");
		}
		}
	}
	public void setWay(NoticeInput NoticeInput, Scanner input) {
		while(true) {
		System.out.println("*�������: "); 
		way= input.nextLine(); 
		try {
			this.setWay(way);
			break;
		} catch (NullException e) {
			System.out.println("�ݵ�� �Է��ؾ� �մϴ�!");
		}
		}
	}
	public void setComment(NoticeInput NoticeInput, Scanner input) {
		System.out.println("�ڸ�Ʈ: ");  
		comment= input.nextLine(); 
		this.setComment(comment);		
	}
}

