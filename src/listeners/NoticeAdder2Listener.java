package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import Ex.NullException;
import Manager.NoticeManager;
import Notice.CommercialNotice;
import Notice.NoticeInput;
import Notice.Noticekind;
import Notice.VoluntaryNotice;

public class NoticeAdder2Listener implements ActionListener {
	JTextField fieldNumber;
	JTextField fieldTitle;
	JTextField fieldCompanyName;
	JTextField fieldlocation;
	JTextField fieldperiod;
	JTextField fieldcareer;
	JTextField fieldgender;
	JTextField fieldage;
	JTextField fieldacademic;
	JTextField fieldperiod2;
	JTextField fieldday;
	JTextField fieldtime;
	JTextField fieldpersonnel;
	JTextField fieldcondition1;
	JTextField fieldcondition2;
	JTextField fieldway;
	JTextField fieldsubmission;
	JTextField fieldcomment;
	NoticeManager noticemanager;
	
	
	
	public NoticeAdder2Listener(JTextField fieldNumber, JTextField fieldTitle, JTextField fieldCompanyName,
			JTextField fieldlocation, JTextField fieldperiod, JTextField fieldcareer, JTextField fieldgender,
			JTextField fieldage, JTextField fieldacademic, JTextField fieldperiod2,
			JTextField fieldday, JTextField fieldtime,  JTextField fieldpersonnel,
			JTextField fieldcondition1, JTextField fieldcondition2, JTextField fieldway,
			JTextField fieldsubmission, JTextField fieldcomment, NoticeManager noticemanager) {
		this.fieldNumber = fieldNumber;
		this.fieldTitle = fieldTitle;
		this.fieldCompanyName = fieldCompanyName;
		this.fieldlocation = fieldlocation;
		this.fieldperiod = fieldperiod;
		this.fieldcareer = fieldcareer;
		this.fieldgender = fieldgender;
		this.fieldage = fieldage;
		this.fieldacademic = fieldacademic;
		this.fieldperiod2 = fieldperiod2;
		this.fieldday = fieldday;
		this.fieldtime = fieldtime;
		this.fieldpersonnel = fieldpersonnel;
		this.fieldcondition1 = fieldcondition1;
		this.fieldcondition2 = fieldcondition2;
		this.fieldway = fieldway;
		this.fieldsubmission = fieldsubmission;
		this.fieldcomment = fieldcomment;
		this.noticemanager = noticemanager;
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
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		NoticeInput noticeinput = new VoluntaryNotice(Noticekind.voluntary);
		try {
			noticeinput.setNoticeNumber(Integer.parseInt(fieldNumber.getText()));
			noticeinput.setNoticeTitle(fieldTitle.getText());
			noticeinput.setCompanyName(fieldCompanyName.getText());
			noticeinput.setLocation(fieldlocation.getText());
			noticeinput.setPeriod(fieldperiod.getText());
			noticeinput.setCareer(fieldcareer.getText());
			noticeinput.setGender(fieldgender.getText());
			noticeinput.setAge(fieldage.getText());
			noticeinput.setAcademic(fieldacademic.getText());
			noticeinput.setPeriod2(fieldperiod2.getText());
			noticeinput.setDay(fieldday.getText());
			noticeinput.setTime(fieldtime.getText());
			noticeinput.setPersonnel(fieldpersonnel.getText());
			noticeinput.setCondition1(fieldcondition1.getText());
			noticeinput.setCondition2(fieldcondition2.getText());
			noticeinput.setWay(fieldway.getText());
			noticeinput.setSubmission(fieldsubmission.getText());
			noticeinput.setComment(fieldcomment.getText());
			noticemanager.AddNotice(noticeinput);
			putObject(noticemanager, "noticemanager.ser");
			noticeinput.printNotice();
		} catch (NullException e1) {
			e1.printStackTrace();
		}


}
}
