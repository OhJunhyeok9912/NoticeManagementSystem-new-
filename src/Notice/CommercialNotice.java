package Notice;

import java.util.Scanner;

public class CommercialNotice extends Notice {
	protected Noticekind kind = Noticekind.commercial;
	
	public CommercialNotice(Noticekind kind) {
		super(kind);
	}
    
	public void getUserInput(Scanner input) {
		System.out.println("*는 반드시 입력해야 합니다. ");
		 setNoticeNumber(this, input);
		 String x = input.nextLine(); 
		 setNoticeTitle(this, input);
	   	 System.out.println("근무지 정보");   
	   	 setCompanyName(this, input);
	   	 setLocation(this, input);
	   	 System.out.println("모집조건");
	   	 setPeriod(this, input);
	   	 setCareer(this, input);
	   	 setGender(this, input);
	   	 setAge(this, input);
	   	 setAcademic(this, input);
	   	 System.out.println("근무조건");
	   	 setSalary(this, input);
	   	 setPeriod2(this, input);
	   	 setDay(this, input);
	   	 setTime(this, input);
	   	 System.out.println("모집내용");
	     setType1(this, input);
	     setPersonnel(this, input);
	     setType2(this, input);
	     setCondition1(this, input);
	     setCondition2(this, input);
	   	 System.out.println("기타사항");
	   	 setWay(this, input);
	   	 setSubmission(this, input);
	   	 setComment(this, input);
	}
	
	public void printNotice(){
		String nkind = getKindString();
		 System.out.println("목적: "+ nkind);
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
	
	
}