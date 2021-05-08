package Notice;

import java.util.Scanner;

public interface NoticeInput {
	public void printNotice();
	public String getNoticeNumber();
	public void getUserInput(Scanner input);
	public Noticekind getKind();
	public void setWay(String way);
	public void setComment(String comment);
}
