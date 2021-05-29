import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import Log.EventLogger;

public class MenuManager {
     static EventLogger logger = new EventLogger("Log.txt");   
	 public static void main(String[] args) {	 
		 Scanner input = new Scanner(System.in);
		 NoticeManager noticemanager = getObject("noticemanager.ser");
		 if(noticemanager == null) {
			 noticemanager = new NoticeManager();
		 }
		 selectMenu(input, noticemanager);
		 putObject(noticemanager, "noticemanager.ser");
	 }	 
	 public static void selectMenu(Scanner input, NoticeManager noticemanager) {
		 int num = 0;
		 while(num!=5) {
			 try {
			 showMenu();
		     num = input.nextInt();  
		     switch(num) {
		         case 1:
		        	    noticemanager.AddNotice();
		        	    break;
		         case 2:
		        	    noticemanager.DeleteNotice();
	        	        break;
		         case 3:
		        	    noticemanager.EditNotice();
	        	        break;
		         case 4:
		        	    noticemanager.ViewNotice();
	        	        break;
		         case 5:
		        	    logger.log("시스템 종료");
	        	        break;
	        	 default:
	        		    System.out.println("Warning!: Select one number between 1 - 5\n");
	        		    logger.log("잘못된 숫자 입력");
	        		    continue;
		     }
			}
			catch(InputMismatchException e) { 
				System.out.println("Warning!: Select one number between 1 - 5\n");
				logger.log("문자를 입력");
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
	 public static NoticeManager getObject(String Filename) {
			NoticeManager noticemanager = null;	
			try {
				FileInputStream file = new FileInputStream(Filename);
				ObjectInputStream in = new ObjectInputStream(file);				
				noticemanager = (NoticeManager) in.readObject();				
				in.close();
				file.close();				
			    }catch (FileNotFoundException e) {
					return noticemanager;
				}  catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  catch (IOException e) {
				    e.printStackTrace();
			}
	        return noticemanager;			 
		 }
		 
		 public static void putObject(NoticeManager noticemanager, String Filename) {

				try {
					FileOutputStream file = new FileOutputStream(Filename);
					ObjectOutputStream out = new ObjectOutputStream(file);				
					out.writeObject(noticemanager);					
					out.close();
					file.close();				
				    } catch (FileNotFoundException e) {
						e.printStackTrace();
					} catch (IOException e) {
					    e.printStackTrace();
				}				 
			 }

}