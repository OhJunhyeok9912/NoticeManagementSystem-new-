package Notice;

import java.util.Scanner;

public class VoluntaryNotice extends Notice {
	public void getUserInput(Scanner input) {
		System.out.println("공고 넘버: (순서대로 입력하세요.)"); String NoticeNumber = input.nextLine(); 
	     System.out.println("공고제목: "); String NoticeTitle = input.nextLine();
	   	 System.out.println("활동지 정보");  
	   	System.out.println("활동지 정보");
	   	 System.out.println("봉사활동처: "); String CompanyName = input.nextLine(); 
	   	 System.out.println("활동처 위치: "); String location = input.nextLine(); 
	   	 System.out.println("모집조건");
	   	 System.out.println("모집기간: "); String period = input.nextLine(); 
	   	 System.out.println("경력: ");  String career = input.nextLine();
	   	 System.out.println("성별: "); String gender = input.nextLine(); 
	   	 System.out.println("나이: "); String age = input.nextLine(); 
	   	 System.out.println("학력: "); String academic = input.nextLine(); 
	   	 System.out.println("활동정보");
	   	 System.out.println("활동기간: "); String period2= input.nextLine(); 
	   	 System.out.println("활동요일: "); String day= input.nextLine();
	   	 System.out.println("활동시간: "); String time= input.nextLine(); 
	   	 System.out.println("모집내용");
	   	 System.out.println("모집인원: "); String personnel= input.nextLine();
	   	 System.out.println("우대조건: "); String condition1= input.nextLine(); 
	   	 System.out.println("기타조건: "); String condition2= input.nextLine(); 
	   	 System.out.println("기타사항");
	   	 System.out.println("지원방법: "); String way= input.nextLine();
	   	 System.out.println("제출서류: "); String submission= input.nextLine(); 
	   	 System.out.println("코멘트: ");  String comment= input.nextLine(); 
	}
}
