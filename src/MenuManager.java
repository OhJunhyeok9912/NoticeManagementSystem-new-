import java.util.Scanner;

public class MenuManager {
    
	 public static void main(String[] args) {
		 int num = 0;
		 Scanner input = new Scanner(System.in);
		 Scanner input1 = new Scanner(System.in); // input만으로 모든 변수의 입력값을 받도록 설정하니까 공고제목 입력하는 것만 건너뛰고 바로 모집기간 입력칸으로 가서 input1을 추가했습니다. 
		 while(num != 6 ) {
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
		        	 System.out.println("Notice number: ");
		        	 int Num = input.nextInt();
		        	 System.out.println("Title: ");
		        	 String title = input1.nextLine();
		        	 System.out.println("Recruitment conditions");
		        	 System.out.println("Recruitment period: ");
		        	 String period = input1.nextLine();
		        	 System.out.println("Career: ");
		        	 String career = input1.nextLine();
		        	 System.out.println("Gender: ");
		        	 String gender = input1.nextLine();
		        	 System.out.println("Age: ");
		        	 String age = input1.nextLine();
		        	 System.out.println("Academic background: ");
		        	 String academic = input1.nextLine();
		        	 System.out.println("Working conditions");
		        	 System.out.println("Salary: ");
		        	 String salary = input1.nextLine();
		        	 System.out.println("Working period: ");
		        	 String period2= input1.nextLine();
		        	 System.out.println("Working day: ");
		        	 String day= input1.nextLine(); 
		        	 System.out.println("Duty hours: ");
		        	 String time= input1.nextLine();
		        	 System.out.println("Recruitment details");
		        	 System.out.println("Recruitment occupation: ");
		        	 String type1= input1.nextLine();
		        	 System.out.println("Recruitment personnel: ");
		        	 String personnel= input1.nextLine();
		        	 System.out.println("Employment type: ");
		        	 String type2= input1.nextLine();
		        	 System.out.println("Preferential conditions: ");
		        	 String condition1= input1.nextLine();
		        	 System.out.println("Other conditions: ");
		        	 String condition2= input1.nextLine();
		        	 System.out.println("Besides that");
		        	 System.out.println("How to apply: ");
		        	 String way= input1.nextLine();
		        	 System.out.println("Submission document: ");
		        	 String submission= input1.nextLine();
		        	 System.out.println("Comment: ");
		        	 String comment= input1.nextLine();
		        	 break;
		         case 2:
		        	    System.out.println("Enter the Notice number you want to delete': "); 
		        	    String Num3 = input1.nextLine();
	        	        break;
		         case 3:
		        	    System.out.println("Enter the Notice number you want to edit': "); 
		        	    String Num4 = input1.nextLine();
		        	    System.out.println("Title: ");
			        	 String Title = input1.nextLine();
			        	 System.out.println("Recruitment conditions");
			        	 System.out.println("Recruitment period: ");
			        	 String Period = input1.nextLine();
			        	 System.out.println("Career: ");
			        	 String Career = input1.nextLine();
			        	 System.out.println("Gender: ");
			        	 String Gender = input1.nextLine();
			        	 System.out.println("Age: ");
			        	 String Age = input1.nextLine();
			        	 System.out.println("Academic background: ");
			        	 String Academic = input1.nextLine();
			        	 System.out.println("Working conditions");
			        	 System.out.println("Salary: ");
			        	 String Salary = input1.nextLine();
			        	 System.out.println("Working period: ");
			        	 String Period2= input1.nextLine();
			        	 System.out.println("Working day: ");
			        	 String Day= input1.nextLine(); 
			        	 System.out.println("Duty hours: ");
			        	 String Time= input1.nextLine();
			        	 System.out.println("Recruitment details");
			        	 System.out.println("Recruitment occupation: ");
			        	 String Type1= input1.nextLine();
			        	 System.out.println("Recruitment personnel: ");
			        	 String Personnel= input1.nextLine();
			        	 System.out.println("Employment type: ");
			        	 String Type2= input1.nextLine();
			        	 System.out.println("Preferential conditions: ");
			        	 String Condition1= input1.nextLine();
			        	 System.out.println("Other conditions: ");
			        	 String Condition2= input1.nextLine();
			        	 System.out.println("Besides that");
			        	 System.out.println("How to apply: ");
			        	 String Way= input1.nextLine();
			        	 System.out.println("Submission document: ");
			        	 String Submission= input1.nextLine();
			        	 System.out.println("Comment: ");
			        	 String Comment= input1.nextLine();
	        	        break;
		         case 4:
		        	    System.out.println("Enter the Notice number you want to view': ");
		        	    String Num5 = input1.nextLine();
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
