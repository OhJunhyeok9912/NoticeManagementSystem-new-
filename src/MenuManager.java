import java.util.ArrayList;
import java.util.Scanner;

public class MenuManager {
    
	public static ArrayList<String> AddNotice() {
	 ArrayList<String> addNotice = new ArrayList<String>(); // 총 26개의 문자열이 저장됨. 
     Scanner input = new Scanner(System.in);
     Scanner input1 = new Scanner(System.in);
     System.out.println("공고 넘버: (순서대로 입력하세요.)"); 
   	 String NoticeNumber = input.next();  
   	 addNotice.add("공고 넘버: "+NoticeNumber); // 1번
     System.out.println("공고제목: ");
   	 String NoticeTitle = input1.nextLine();  
   	 addNotice.add("공고제목: "+NoticeTitle); //2번
   	 System.out.println("근무지 정보");   
   	 System.out.println("회사명: ");
   	 String CompanyName = input1.nextLine();
   	 addNotice.add("근무지 정보"); // 3번
   	 addNotice.add("회사명: "+CompanyName); // 4번
   	 System.out.println("근무지 위치: ");
   	 String location = input1.nextLine();
   	 addNotice.add("근무지 위치: "+location); // 5번
   	 System.out.println("모집조건");
   	 System.out.println("모집기간: ");
   	 String period = input1.nextLine();  
   	addNotice.add("모집조건");  // 6번
   	addNotice.add("모집기간: "+period); // 7번
   	 System.out.println("경력: ");
   	 String career = input1.nextLine();
   	 addNotice.add("경력: "+career);  // 8번
   	 System.out.println("성별: ");
   	 String gender = input1.nextLine();
   	 addNotice.add("성별: "+gender);  // 9번
   	 System.out.println("나이: ");
   	 String age = input1.nextLine();
   	 addNotice.add("나이: "+age);  // 10번
   	 System.out.println("학력: ");
   	 String academic = input1.nextLine();
   	 addNotice.add("학력: "+academic); // 11번
   	 System.out.println("근무조건");
   	 System.out.println("급여: ");
   	 String salary = input1.nextLine(); 
   	addNotice.add("근무조건"); // 12번
   	 addNotice.add("급여: "+salary);  //13번
   	 System.out.println("근무기간: ");
   	 String period2= input1.nextLine();
   	  addNotice.add("근무기간: "+period2); // 14번
   	 System.out.println("근무요일: ");
   	 String day= input1.nextLine(); 
   	addNotice.add("근무요일: "+day); // 15번
   	 System.out.println("근무시간: ");
   	 String time= input1.nextLine();
   	addNotice.add("근무시간: "+time);  // 16번
   	 System.out.println("모집내용");
   	 System.out.println("모집직종: ");
   	 String type1= input1.nextLine();  
   	addNotice.add("모집내용");  // 17번
   	addNotice.add("모집직종: "+type1); // 18번
   	 System.out.println("모집인원: ");
   	 String personnel= input1.nextLine();
   	addNotice.add("모집인원: "+personnel);  // 19번
   	 System.out.println("고용형태: ");
   	 String type2= input1.nextLine();
   	addNotice.add("고용형태: "+type2); // 20번
   	 System.out.println("우대조건: ");
   	 String condition1= input1.nextLine(); 
   	addNotice.add("우대조건: "+condition1);// 21번
   	 System.out.println("기타조건: ");
   	 String condition2= input1.nextLine();;
   	addNotice.add("기타조건: "+condition2); // 22번
   	 System.out.println("기타사항");
   	 System.out.println("지원방법: ");
   	 String way= input1.nextLine();
   	addNotice.add("기타사항");  //23번
   	addNotice.add("지원방법: "+way); // 24번
   	 System.out.println("제출서류: ");
   	 String submission= input1.nextLine();
   	addNotice.add("제출서류: "+submission); // 25번
   	 System.out.println("코멘트: ");
   	 String comment= input1.nextLine();
   	 addNotice.add("코멘트: "+comment); // 26번   	
	 return addNotice; // 공고 작성이 끝나면 공고를 반환한다. 
	 }	 
	 public static void DeleteNotice(ArrayList<String> Notice) { // 
		Scanner input = new Scanner(System.in);
		System.out.println("삭제하기 위한 공고 넘버를 입력하세요: "); 
		String Num = input.nextLine();
		int i=0;
		int k=0;
		NOnotice(Notice, Num);
		if(Notice.size()>0 && (Notice.contains("공고 넘버: "+Num))) {
			while(i<=Notice.size()) {
				if((Notice.get(i)).equals("공고 넘버: "+Num)) {
					for(int j = i;k<26;k++) { // j번 인덱스에서 remove를 하면 인덱스의 정보는 사라지고 그 뒤의 정보가 앞으로 당겨지므로 인덱스 j에서 26번 공고의 세부내용을 삭제해야 한다.  
						Notice.remove(j);
					}
					break;	
				}
				else i++;
			}	 
		    System.out.println("삭제 되었습니다."); 	
		}
	 } 	 
	 public static void EditNotice(ArrayList<String> Notice) {
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		System.out.println("편집하기 위한 공고 넘버를 입력하세요: "); 
		String Num = input.nextLine();
		int i = 0;
		NOnotice(Notice, Num);
		if(Notice.size()>0 && (Notice.contains("공고 넘버: "+Num))) {
			while(i<=Notice.size()) {
				if((Notice.get(i)).equals("공고 넘버: "+Num)) {
					System.out.println("편집할 항목의 번호를 입력하세요. 번호를 잘 확인하세요"); 
					System.out.println("2: 공고제목 4: 회사명, 5: 근무지 위치, 7: 모집기간, 8: 경력, 9: 성별, 10: 나이 , 11: 학력, 13: 급여, 14: 근무기간" );
					System.out.println("15: 근무요일, 16: 근무시간 18: 모집직종, 19: 모집인원, 20: 고용형태, 21: 우대조건, 22: 기타조건, 24: 지원방법 , 25: 제출서류, 26: 코멘트" );
					int Editnumber = input.nextInt();
					System.out.println("편집할 내용을 입력하세요."); 
					String Edit = input1.nextLine();
					Notice.remove(i+(Editnumber-1));
					switch(Editnumber){
						case 2: Notice.add(i+(Editnumber-1), "공고제목: "+Edit); break;   case 4: Notice.add(i+(Editnumber-1), "회사명: "+Edit); break;
						case 5: Notice.add(i+(Editnumber-1), "근무지 위치: "+Edit); break; case 7: Notice.add(i+(Editnumber-1), "모집기간: "+Edit); break;
						case 8: Notice.add(i+(Editnumber-1), "경력: "+Edit); break;      case 9: Notice.add(i+(Editnumber-1), "성별: "+Edit); break;
						case 10: Notice.add(i+(Editnumber-1), "나이: "+Edit); break;     case 11: Notice.add(i+(Editnumber-1), "학력: "+Edit); break;
						case 13: Notice.add(i+(Editnumber-1), "급여: "+Edit); break;     case 14: Notice.add(i+(Editnumber-1), "근무기간: "+Edit); break;
						case 15: Notice.add(i+(Editnumber-1), "근무요일: "+Edit); break;  case 16: Notice.add(i+(Editnumber-1), "근무시간: "+Edit); break;
						case 18: Notice.add(i+(Editnumber-1), "모집직종: "+Edit); break;  case 19: Notice.add(i+(Editnumber-1), "모집인원: "+Edit); break;
						case 20: Notice.add(i+(Editnumber-1), "고용형태: "+Edit); break;  case 21: Notice.add(i+(Editnumber-1), "우대조건: "+Edit); break;
						case 22: Notice.add(i+(Editnumber-1), "기타조건: "+Edit); break;  case 24: Notice.add(i+(Editnumber-1), "지원방법: "+Edit); break;
						case 25: Notice.add(i+(Editnumber-1), "제출서류: "+Edit); break;  case 26: Notice.add(i+(Editnumber-1), "코멘트: "+Edit); break;
					}
					break;	
				}
				else i++;
			}
			System.out.println("편집 되었습니다.");
		}
	 }	 
	 public static void ViewNotice(ArrayList<String> Notice){
		Scanner input = new Scanner(System.in);
		ArrayList<String> viewNotice = new ArrayList<String>();
		System.out.println("보길 원하는 공고 넘버를 입력하세요: ");
		String Num = input.nextLine();
		int i = 0;
		NOnotice(Notice, Num);
		if(Notice.size()>0 && (Notice.contains("공고 넘버: "+Num))) {
			while(i<=Notice.size()) {
				if((Notice.get(i)).equals("공고 넘버: "+Num)) {
					for(int j = i;j<(26+i);j++) {  // 찾는 공고의 범위 만큼(1개의 공고 => 26개 문자열이 저장) 출력
						System.out.println(Notice.get(j));
					}
					break;	
				}
				else i++;
			}
		}
  }	 
	 public static void NOnotice(ArrayList<String> Notice, String Num) { // 찾는 공고 넘버가 없을 때 또는 작성한 공고가 아무 것도 없을 때 사용
		if(Notice.size()==0) { // 작성한 공고가 아무것도 없을 때 출력
				System.out.println("공고가 없습니다!");
		}
		else if(Notice.size()>0 && !(Notice.contains("공고 넘버: "+Num))){ // 작성한 공고가 있으나 해당 넘버의 공고가 없을 때 출력
				System.out.println("공고가 없습니다!");
		}
	 }
	 
	 public static void main(String[] args) {
		 int num = 0;
		 Scanner input = new Scanner(System.in);
		 ArrayList<String> Notice = new ArrayList<String>();
		 int i = 0;
		 while(num != 6 ) {
			 System.out.println("*** Notice Management System Menu ***");
		     System.out.println("1. Add Notice");
		     System.out.println("2. Delete Notice");
		     System.out.println("3. Edit Notice");
		     System.out.println("4. View Notice");
		     System.out.println("5. Show a Menu");
		     System.out.println("6. Exit");
		     System.out.println("Select one number between 1 - 6"); 
		     num = input.nextInt();  
		     switch(num) {
		         case 1:
		        	    Notice.addAll(AddNotice());
		        	    break;
		         case 2:
		        	    DeleteNotice(Notice);
	        	        break;
		         case 3:
		        	    EditNotice(Notice);
	        	        break;
		         case 4:
		        	    ViewNotice(Notice);
	        	        break;
		         case 5:
	        	        break;
		         case 6:
	        	        break;
	        	 default:
	        		    System.out.println("Warning!: Select one number between 1 - 6\n");
	        		    break;
		     }
		 } 
	 }
}
