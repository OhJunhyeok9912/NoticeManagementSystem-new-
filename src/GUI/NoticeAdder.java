package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField; 
import javax.swing.SpringLayout;

import Manager.NoticeManager;
import listeners.NoticeAdderCancelListener;
import listeners.NoticeAdderListener;

public class NoticeAdder extends JPanel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 5880751196834516087L;

	WindowFrame frame;
	NoticeManager noticemanager;
	public NoticeAdder(WindowFrame frame, NoticeManager noticemanager) {
		this.frame = frame;
		this.noticemanager = noticemanager;
		
		JPanel panel = new JPanel();
    	panel.setLayout(new SpringLayout());
    	
    	JLabel labelNumber = new JLabel("공고넘버: ", JLabel.TRAILING);
    	JTextField fieldNumber = new JTextField(10);
    	labelNumber.setLabelFor(fieldNumber);
    	panel.add(labelNumber);
    	panel.add(fieldNumber);
    	
    	JLabel labelTitle= new JLabel("공고제목: ", JLabel.TRAILING);
    	JTextField fieldTitle = new JTextField(10);
    	labelTitle.setLabelFor(fieldTitle);
    	panel.add(labelTitle);
    	panel.add(fieldTitle);
    	
    	JLabel labelCompanyName = new JLabel("회사명: ", JLabel.TRAILING);
    	JTextField fieldCompanyName = new JTextField(10);
    	labelCompanyName.setLabelFor(fieldCompanyName);
    	panel.add(labelCompanyName);
    	panel.add(fieldCompanyName);
    	
    	JLabel labellocation = new JLabel("근무지 위치: ", JLabel.TRAILING);
    	JTextField fieldlocation = new JTextField(10);
    	labellocation.setLabelFor(fieldlocation);
    	panel.add(labellocation);
    	panel.add(fieldlocation);
    	
    	JLabel labelperiod = new JLabel("모집기간: ", JLabel.TRAILING);
    	JTextField fieldperiod = new JTextField(10);
    	labelperiod.setLabelFor(fieldperiod);
    	panel.add(labelperiod);
    	panel.add(fieldperiod);
    	
    	JLabel labelcareer = new JLabel("경력: ", JLabel.TRAILING);
    	JTextField fieldcareer = new JTextField(10);
    	labelcareer.setLabelFor(fieldcareer);
    	panel.add(labelcareer);
    	panel.add(fieldcareer);
    	
    	JLabel labelgender = new JLabel("성별: ", JLabel.TRAILING);
    	JTextField fieldgender = new JTextField(10);
    	labelgender.setLabelFor(fieldgender);
    	panel.add(labelgender);
    	panel.add(fieldgender);
    	
    	JLabel labelage = new JLabel("나이: ", JLabel.TRAILING);
    	JTextField fieldage = new JTextField(10);
    	labelage.setLabelFor(fieldage);
    	panel.add(labelage);
    	panel.add(fieldage);
    	
    	JLabel labelacademic = new JLabel("학력: ", JLabel.TRAILING);
    	JTextField fieldacademic = new JTextField(10);
    	labelacademic.setLabelFor(fieldacademic);
    	panel.add(labelacademic);
    	panel.add(fieldacademic);
    	
    	JLabel labelsalary = new JLabel("급여: ", JLabel.TRAILING);
    	JTextField fieldsalary = new JTextField(10);
    	labelsalary.setLabelFor(fieldsalary);
    	panel.add(labelsalary);
    	panel.add(fieldsalary);
    	
    	JLabel labelperiod2 = new JLabel("근무기간: ", JLabel.TRAILING);
    	JTextField fieldperiod2 = new JTextField(10);
    	labelperiod2.setLabelFor(fieldperiod2);
    	panel.add(labelperiod2);
    	panel.add(fieldperiod2);
    	
    	JLabel labelday = new JLabel("근무요일: ", JLabel.TRAILING);
    	JTextField fieldday = new JTextField(10);
    	labelday.setLabelFor(fieldday);
    	panel.add(labelday);
    	panel.add(fieldday);
    	
    	JLabel labeltime = new JLabel("근무시간: ", JLabel.TRAILING);
    	JTextField fieldtime = new JTextField(10);
    	labeltime.setLabelFor(fieldtime);
    	panel.add(labeltime);
    	panel.add(fieldtime);
    	
    	JLabel labeltype1 = new JLabel("모집직종: ", JLabel.TRAILING);
    	JTextField fieldtype1 = new JTextField(10);
    	labeltype1.setLabelFor(fieldtype1);
    	panel.add(labeltype1);
    	panel.add(fieldtype1);
   
    	JLabel labelpersonnel = new JLabel("모집인원: ", JLabel.TRAILING);
    	JTextField fieldpersonnel= new JTextField(10);
    	labelpersonnel.setLabelFor(fieldpersonnel);
    	panel.add(labelpersonnel);
    	panel.add(fieldpersonnel);
    	
    	JLabel labeltype2 = new JLabel("고용형태: ", JLabel.TRAILING);
    	JTextField fieldtype2= new JTextField(10);
    	labeltype2.setLabelFor(fieldtype2);
    	panel.add(labeltype2);
    	panel.add(fieldtype2);
    	
    	JLabel labelcondition1 = new JLabel("우대조건: ", JLabel.TRAILING);
    	JTextField fieldcondition1= new JTextField(10);
    	labelcondition1.setLabelFor(fieldcondition1);
    	panel.add(labelcondition1);
    	panel.add(fieldcondition1);
    	
    	JLabel labelcondition2 = new JLabel("기타조건: ", JLabel.TRAILING);
    	JTextField fieldcondition2= new JTextField(10);
    	labelcondition2.setLabelFor(fieldcondition2);
    	panel.add(labelcondition2);
    	panel.add(fieldcondition2);
    	
    	JLabel labelway = new JLabel("지원방법: ", JLabel.TRAILING);
    	JTextField fieldway= new JTextField(10);
    	labelway.setLabelFor(fieldway);
    	panel.add(labelway);
    	panel.add(fieldway);
    	
    	JLabel labelsubmission = new JLabel("제출서류: ", JLabel.TRAILING);
    	JTextField fieldsubmission= new JTextField(10);
    	labelsubmission.setLabelFor(fieldsubmission);
    	panel.add(labelsubmission);
    	panel.add(fieldsubmission);
    	
    	JLabel labelcomment = new JLabel("코멘트: ", JLabel.TRAILING);
    	JTextField fieldcomment= new JTextField(10);
    	labelcomment.setLabelFor(fieldcomment);
    	panel.add(labelcomment);
    	panel.add(fieldcomment);
    	JButton button1 = new JButton("Save");
    	JButton button2 = new JButton("Cancel");
    	
    	button1.addActionListener(new NoticeAdderListener(fieldNumber, fieldTitle, fieldCompanyName,fieldlocation,
        fieldperiod, fieldcareer ,fieldgender, fieldage, fieldacademic, fieldsalary ,fieldperiod2, fieldday,fieldtime,
    	fieldtype1,fieldpersonnel,fieldtype2,fieldcondition1,fieldcondition2,fieldway,fieldsubmission,fieldcomment, noticemanager));
    	
    	button2.addActionListener(new NoticeAdderCancelListener(frame));
    	 	
    	
    	panel.add(button1);
    	panel.add(button2);
    	
    	SpringUtilities.makeCompactGrid(panel, 22,2,6,6,6,6);
    	this.add(panel);
        this.setVisible(true);
    }


}
