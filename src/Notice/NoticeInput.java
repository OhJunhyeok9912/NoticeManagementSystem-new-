package Notice;

import java.util.Scanner;

public interface NoticeInput {
	public void printNotice();
	public String getNoticeNumber();
	public void getUserInput(Scanner input);
	public Noticekind getKind();
	public void setWay(String way);
	public void setComment(String comment);
	public void setNoticeTitle(String noticeTitle);
	public void setLocation(String location);
	public void setPeriod(String period);
	public void setCompanyName(String companyName);
	public void setCareer(String career);
	public void setGender(String gender);
	public void setAge(String age);
	public void setAcademic(String academic);
	public void setPeriod2(String period2);
	public void setDay(String day);
	public void setType1(String type1);
	public void setPersonnel(String personnel);
	public void setType2(String type2);
	public void setTime(String time);
	public void setCondition1(String condition1);
	public void setCondition2(String condition2);
	public void setSubmission(String submission);
	public void setSalary(String salary);
}
