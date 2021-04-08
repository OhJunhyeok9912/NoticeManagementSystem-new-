import java.util.ArrayList;
import java.util.Scanner;

import Notice.Notice; //

public class MenuManager {
 
	 public static void main(String[] args) {
		 String num = "0";
		 Scanner input = new Scanner(System.in);

		 ArrayList<Notice> Notices = new ArrayList<Notice>();

		 NoticeManager noticemanager = new NoticeManager(input);
		 while(!num.equals("5")) {
			 System.out.println("*** Notice Management System Menu ***");
		     System.out.println("1. Add Notice");
		     System.out.println("2. Delete Notice");
		     System.out.println("3. Edit Notice");
		     System.out.println("4. View Notice");
		     System.out.println("5. Exit");
		     System.out.println("Select one number between 1 - 5"); 
		     num = input.nextLine();  
		     switch(num) {
		         case "1":

		        	    Notices.addAll(noticemanager.AddNotice());
		        	    break;
		         case "2":
		        	    noticemanager.DeleteNotice(Notices);
	        	        break;
		         case "3":

		        	    noticemanager.EditNotice(Notices);

	        	        break;
		         case "4":

		        	    noticemanager.ViewNotice(Notices);
	        	        break;
		         case "5":
	        	        break;
	        	 default:
	        		    System.out.println("Warning!: Select one number between 1 - 6\n");
	        		    break;
		     }
		 } 
	 }
}