import java.util.ArrayList;
import java.util.Scanner;

public class MenuManager {
    
	public static ArrayList<String> AddNotice() {
	 ArrayList<String> addNotice = new ArrayList<String>(); // �� 26���� ���ڿ��� �����. 
     Scanner input = new Scanner(System.in);
     Scanner input1 = new Scanner(System.in);
     System.out.println("���� �ѹ�: (������� �Է��ϼ���.)"); 
   	 String NoticeNumber = input.next();  
   	 addNotice.add("���� �ѹ�: "+NoticeNumber); // 1��
     System.out.println("��������: ");
   	 String NoticeTitle = input1.nextLine();  
   	 addNotice.add("��������: "+NoticeTitle); //2��
   	 System.out.println("�ٹ��� ����");   
   	 System.out.println("ȸ���: ");
   	 String CompanyName = input1.nextLine();
   	 addNotice.add("�ٹ��� ����"); // 3��
   	 addNotice.add("ȸ���: "+CompanyName); // 4��
   	 System.out.println("�ٹ��� ��ġ: ");
   	 String location = input1.nextLine();
   	 addNotice.add("�ٹ��� ��ġ: "+location); // 5��
   	 System.out.println("��������");
   	 System.out.println("�����Ⱓ: ");
   	 String period = input1.nextLine();  
   	addNotice.add("��������");  // 6��
   	addNotice.add("�����Ⱓ: "+period); // 7��
   	 System.out.println("���: ");
   	 String career = input1.nextLine();
   	 addNotice.add("���: "+career);  // 8��
   	 System.out.println("����: ");
   	 String gender = input1.nextLine();
   	 addNotice.add("����: "+gender);  // 9��
   	 System.out.println("����: ");
   	 String age = input1.nextLine();
   	 addNotice.add("����: "+age);  // 10��
   	 System.out.println("�з�: ");
   	 String academic = input1.nextLine();
   	 addNotice.add("�з�: "+academic); // 11��
   	 System.out.println("�ٹ�����");
   	 System.out.println("�޿�: ");
   	 String salary = input1.nextLine(); 
   	addNotice.add("�ٹ�����"); // 12��
   	 addNotice.add("�޿�: "+salary);  //13��
   	 System.out.println("�ٹ��Ⱓ: ");
   	 String period2= input1.nextLine();
   	  addNotice.add("�ٹ��Ⱓ: "+period2); // 14��
   	 System.out.println("�ٹ�����: ");
   	 String day= input1.nextLine(); 
   	addNotice.add("�ٹ�����: "+day); // 15��
   	 System.out.println("�ٹ��ð�: ");
   	 String time= input1.nextLine();
   	addNotice.add("�ٹ��ð�: "+time);  // 16��
   	 System.out.println("��������");
   	 System.out.println("��������: ");
   	 String type1= input1.nextLine();  
   	addNotice.add("��������");  // 17��
   	addNotice.add("��������: "+type1); // 18��
   	 System.out.println("�����ο�: ");
   	 String personnel= input1.nextLine();
   	addNotice.add("�����ο�: "+personnel);  // 19��
   	 System.out.println("�������: ");
   	 String type2= input1.nextLine();
   	addNotice.add("�������: "+type2); // 20��
   	 System.out.println("�������: ");
   	 String condition1= input1.nextLine(); 
   	addNotice.add("�������: "+condition1);// 21��
   	 System.out.println("��Ÿ����: ");
   	 String condition2= input1.nextLine();;
   	addNotice.add("��Ÿ����: "+condition2); // 22��
   	 System.out.println("��Ÿ����");
   	 System.out.println("�������: ");
   	 String way= input1.nextLine();
   	addNotice.add("��Ÿ����");  //23��
   	addNotice.add("�������: "+way); // 24��
   	 System.out.println("���⼭��: ");
   	 String submission= input1.nextLine();
   	addNotice.add("���⼭��: "+submission); // 25��
   	 System.out.println("�ڸ�Ʈ: ");
   	 String comment= input1.nextLine();
   	 addNotice.add("�ڸ�Ʈ: "+comment); // 26��   	
	 return addNotice; // ���� �ۼ��� ������ ���� ��ȯ�Ѵ�. 
	 }	 
	 public static void DeleteNotice(ArrayList<String> Notice) { // 
		Scanner input = new Scanner(System.in);
		System.out.println("�����ϱ� ���� ���� �ѹ��� �Է��ϼ���: "); 
		String Num = input.nextLine();
		int i=0;
		int k=0;
		NOnotice(Notice, Num);
		if(Notice.size()>0 && (Notice.contains("���� �ѹ�: "+Num))) {
			while(i<=Notice.size()) {
				if((Notice.get(i)).equals("���� �ѹ�: "+Num)) {
					for(int j = i;k<26;k++) { // j�� �ε������� remove�� �ϸ� �ε����� ������ ������� �� ���� ������ ������ ������Ƿ� �ε��� j���� 26�� ������ ���γ����� �����ؾ� �Ѵ�.  
						Notice.remove(j);
					}
					break;	
				}
				else i++;
			}	 
		    System.out.println("���� �Ǿ����ϴ�."); 	
		}
	 } 	 
	 public static void EditNotice(ArrayList<String> Notice) {
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		System.out.println("�����ϱ� ���� ���� �ѹ��� �Է��ϼ���: "); 
		String Num = input.nextLine();
		int i = 0;
		NOnotice(Notice, Num);
		if(Notice.size()>0 && (Notice.contains("���� �ѹ�: "+Num))) {
			while(i<=Notice.size()) {
				if((Notice.get(i)).equals("���� �ѹ�: "+Num)) {
					System.out.println("������ �׸��� ��ȣ�� �Է��ϼ���. ��ȣ�� �� Ȯ���ϼ���"); 
					System.out.println("2: �������� 4: ȸ���, 5: �ٹ��� ��ġ, 7: �����Ⱓ, 8: ���, 9: ����, 10: ���� , 11: �з�, 13: �޿�, 14: �ٹ��Ⱓ" );
					System.out.println("15: �ٹ�����, 16: �ٹ��ð� 18: ��������, 19: �����ο�, 20: �������, 21: �������, 22: ��Ÿ����, 24: ������� , 25: ���⼭��, 26: �ڸ�Ʈ" );
					int Editnumber = input.nextInt();
					System.out.println("������ ������ �Է��ϼ���."); 
					String Edit = input1.nextLine();
					Notice.remove(i+(Editnumber-1));
					switch(Editnumber){
						case 2: Notice.add(i+(Editnumber-1), "��������: "+Edit); break;   case 4: Notice.add(i+(Editnumber-1), "ȸ���: "+Edit); break;
						case 5: Notice.add(i+(Editnumber-1), "�ٹ��� ��ġ: "+Edit); break; case 7: Notice.add(i+(Editnumber-1), "�����Ⱓ: "+Edit); break;
						case 8: Notice.add(i+(Editnumber-1), "���: "+Edit); break;      case 9: Notice.add(i+(Editnumber-1), "����: "+Edit); break;
						case 10: Notice.add(i+(Editnumber-1), "����: "+Edit); break;     case 11: Notice.add(i+(Editnumber-1), "�з�: "+Edit); break;
						case 13: Notice.add(i+(Editnumber-1), "�޿�: "+Edit); break;     case 14: Notice.add(i+(Editnumber-1), "�ٹ��Ⱓ: "+Edit); break;
						case 15: Notice.add(i+(Editnumber-1), "�ٹ�����: "+Edit); break;  case 16: Notice.add(i+(Editnumber-1), "�ٹ��ð�: "+Edit); break;
						case 18: Notice.add(i+(Editnumber-1), "��������: "+Edit); break;  case 19: Notice.add(i+(Editnumber-1), "�����ο�: "+Edit); break;
						case 20: Notice.add(i+(Editnumber-1), "�������: "+Edit); break;  case 21: Notice.add(i+(Editnumber-1), "�������: "+Edit); break;
						case 22: Notice.add(i+(Editnumber-1), "��Ÿ����: "+Edit); break;  case 24: Notice.add(i+(Editnumber-1), "�������: "+Edit); break;
						case 25: Notice.add(i+(Editnumber-1), "���⼭��: "+Edit); break;  case 26: Notice.add(i+(Editnumber-1), "�ڸ�Ʈ: "+Edit); break;
					}
					break;	
				}
				else i++;
			}
			System.out.println("���� �Ǿ����ϴ�.");
		}
	 }	 
	 public static void ViewNotice(ArrayList<String> Notice){
		Scanner input = new Scanner(System.in);
		ArrayList<String> viewNotice = new ArrayList<String>();
		System.out.println("���� ���ϴ� ���� �ѹ��� �Է��ϼ���: ");
		String Num = input.nextLine();
		int i = 0;
		NOnotice(Notice, Num);
		if(Notice.size()>0 && (Notice.contains("���� �ѹ�: "+Num))) {
			while(i<=Notice.size()) {
				if((Notice.get(i)).equals("���� �ѹ�: "+Num)) {
					for(int j = i;j<(26+i);j++) {  // ã�� ������ ���� ��ŭ(1���� ���� => 26�� ���ڿ��� ����) ���
						System.out.println(Notice.get(j));
					}
					break;	
				}
				else i++;
			}
		}
  }	 
	 public static void NOnotice(ArrayList<String> Notice, String Num) { // ã�� ���� �ѹ��� ���� �� �Ǵ� �ۼ��� ���� �ƹ� �͵� ���� �� ���
		if(Notice.size()==0) { // �ۼ��� ���� �ƹ��͵� ���� �� ���
				System.out.println("���� �����ϴ�!");
		}
		else if(Notice.size()>0 && !(Notice.contains("���� �ѹ�: "+Num))){ // �ۼ��� ���� ������ �ش� �ѹ��� ���� ���� �� ���
				System.out.println("���� �����ϴ�!");
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