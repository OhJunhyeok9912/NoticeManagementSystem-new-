import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Notice.Notice; //
import Notice.NoticeInput;

public class MenuManager {
 
	 public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 ArrayList<NoticeInput> Notices = new ArrayList<NoticeInput>();
		 NoticeManager noticemanager = new NoticeManager(input);
		 selectMenu(input, noticemanager, Notices);
	 }
	 
	 public static void selectMenu(Scanner input, NoticeManager noticemanager, ArrayList<NoticeInput> Notices) {
		 int num = 0;
		 while(num!=5) {
			 try {
			 showMenu();
		     num = input.nextInt();  
		     switch(num) {
		         case 1:
		        	    Notices.addAll(noticemanager.AddNotice());
		        	    break;
		         case 2:
		        	    noticemanager.DeleteNotice(Notices);
	        	        break;
		         case 3:
		        	    noticemanager.EditNotice(Notices);
	        	        break;
		         case 4:
		        	    noticemanager.ViewNotice(Notices);
	        	        break;
		         case 5:
	        	        break;
	        	 default:
	        		 System.out.println("Warning!: Select one number between 1 - 5\n");
	        		    continue;
		     }
			}
			catch(InputMismatchException e) { 
				System.out.println("Warning!: Select one number between 1 - 5\n");
				if(input.hasNext()) {
					input.next();
				}
				num = 0;
			}
		 } 
	 }
	 
	 public static void showMenu() {
		 System.out.println("*** Notice Management System Menu ***");
	     System.out.println("1. Add Notice");
	     System.out.println("2. Delete Notice");
	     System.out.println("3. Edit Notice");
	     System.out.println("4. View Notice");
	     System.out.println("5. Exit");
	     System.out.println("Select one number between 1 - 5"); 
	 }
}