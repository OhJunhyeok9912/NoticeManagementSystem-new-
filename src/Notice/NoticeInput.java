package Notice;

import java.util.Scanner;

import Ex.NullException;

public interface NoticeInput {
	public void printNotice();
	public int getNoticeNumber();
	public void getUserInput(Scanner input);
	public Noticekind getKind();
	public void setWay(String way)throws NullException;
	public void setComment(String comment);
	public void setNoticeTitle(String noticeTitle)throws NullException;
	public void setLocation(String location)throws NullException;
	public void setPeriod(String period)throws NullException;
	public void setCompanyName(String companyName)throws NullException;
	public void setCareer(String career)throws NullException;
	public void setGender(String gender)throws NullException;
	public void setAge(String age)throws NullException;
	public void setAcademic(String academic)throws NullException;
	public void setPeriod2(String period2)throws NullException;
	public void setDay(String day)throws NullException;
	public void setType1(String type1)throws NullException;
	public void setPersonnel(String personnel)throws NullException;
	public void setType2(String type2)throws NullException;
	public void setTime(String time)throws NullException;
	public void setCondition1(String condition1)throws NullException;
	public void setCondition2(String condition2)throws NullException;
	public void setSubmission(String submission)throws NullException;
	public void setSalary(String salary)throws NullException;
	public void setNoticeNumber(NoticeInput NoticeInput, Scanner input);
	public void setNoticeTitle(NoticeInput NoticeInput, Scanner input);	
	public void setCompanyName(NoticeInput NoticeInput, Scanner input);	
	public void setLocation(NoticeInput NoticeInput, Scanner input);
	public void setPeriod(NoticeInput NoticeInput, Scanner input);
	public void setCareer(NoticeInput NoticeInput, Scanner input);
	public void setGender(NoticeInput NoticeInput, Scanner input);
	public void setAge(NoticeInput NoticeInput, Scanner input);
	public void setAcademic(NoticeInput NoticeInput, Scanner input);
	public void setPeriod2(NoticeInput NoticeInput, Scanner input);
	public void setDay(NoticeInput NoticeInput, Scanner input);
	public void setType1(NoticeInput NoticeInput, Scanner input);
	public void setPersonnel(NoticeInput NoticeInput, Scanner input);
	public void setType2(NoticeInput NoticeInput, Scanner input);
	public void setTime(NoticeInput NoticeInput, Scanner input);
	public void setCondition1(NoticeInput NoticeInput, Scanner input);
	public void setCondition2(NoticeInput NoticeInput, Scanner input);
	public void setSubmission(NoticeInput NoticeInput, Scanner input);
	public void setSalary(NoticeInput NoticeInput, Scanner input);
	public void setWay(NoticeInput NoticeInput, Scanner input);
	public void setComment(NoticeInput NoticeInput, Scanner input);
}