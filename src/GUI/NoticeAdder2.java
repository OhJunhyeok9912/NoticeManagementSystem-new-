package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import Manager.NoticeManager;
import listeners.NoticeAdder2Listener;
import listeners.NoticeAdderCancelListener;
import listeners.NoticeAdderListener;

public class NoticeAdder2 extends JPanel{


	/**
	 * 
	 */
	private static final long serialVersionUID = 5812343919129157749L;

	WindowFrame frame;
	NoticeManager noticemanager;
	public NoticeAdder2(WindowFrame frame, NoticeManager noticemanager) {
		this.frame = frame;
		this.noticemanager = noticemanager;
		
		JPanel panel = new JPanel();
    	panel.setLayout(new SpringLayout());
    	
    	
    	JLabel labelNumber = new JLabel("����ѹ�: ", JLabel.TRAILING);
    	JTextField fieldNumber = new JTextField(10);
    	labelNumber.setLabelFor(fieldNumber);
    	panel.add(labelNumber);
    	panel.add(fieldNumber);
    	
    	JLabel labelTitle= new JLabel("��������: ", JLabel.TRAILING);
    	JTextField fieldTitle = new JTextField(10);
    	labelTitle.setLabelFor(fieldTitle);
    	panel.add(labelTitle);
    	panel.add(fieldTitle);
    	
    	JLabel labelCompanyName = new JLabel("�������: ", JLabel.TRAILING);
    	JTextField fieldCompanyName = new JTextField(10);
    	labelCompanyName.setLabelFor(fieldCompanyName);
    	panel.add(labelCompanyName);
    	panel.add(fieldCompanyName);
    	
    	JLabel labellocation = new JLabel("Ȱ��ó ��ġ: ", JLabel.TRAILING);
    	JTextField fieldlocation = new JTextField(10);
    	labellocation.setLabelFor(fieldlocation);
    	panel.add(labellocation);
    	panel.add(fieldlocation);
    	
    	JLabel labelperiod = new JLabel("�����Ⱓ: ", JLabel.TRAILING);
    	JTextField fieldperiod = new JTextField(10);
    	labelperiod.setLabelFor(fieldperiod);
    	panel.add(labelperiod);
    	panel.add(fieldperiod);
    	
    	JLabel labelcareer = new JLabel("���: ", JLabel.TRAILING);
    	JTextField fieldcareer = new JTextField(10);
    	labelcareer.setLabelFor(fieldcareer);
    	panel.add(labelcareer);
    	panel.add(fieldcareer);
    	
    	JLabel labelgender = new JLabel("����: ", JLabel.TRAILING);
    	JTextField fieldgender = new JTextField(10);
    	labelgender.setLabelFor(fieldgender);
    	panel.add(labelgender);
    	panel.add(fieldgender);
    	
    	JLabel labelage = new JLabel("����: ", JLabel.TRAILING);
    	JTextField fieldage = new JTextField(10);
    	labelage.setLabelFor(fieldage);
    	panel.add(labelage);
    	panel.add(fieldage);
    	
    	JLabel labelacademic = new JLabel("�з�: ", JLabel.TRAILING);
    	JTextField fieldacademic = new JTextField(10);
    	labelacademic.setLabelFor(fieldacademic);
    	panel.add(labelacademic);
    	panel.add(fieldacademic);
    	
    	
    	JLabel labelperiod2 = new JLabel("Ȱ���Ⱓ: ", JLabel.TRAILING);
    	JTextField fieldperiod2 = new JTextField(10);
    	labelperiod2.setLabelFor(fieldperiod2);
    	panel.add(labelperiod2);
    	panel.add(fieldperiod2);
    	
    	JLabel labelday = new JLabel("Ȱ������: ", JLabel.TRAILING);
    	JTextField fieldday = new JTextField(10);
    	labelday.setLabelFor(fieldday);
    	panel.add(labelday);
    	panel.add(fieldday);
    	
    	JLabel labeltime = new JLabel("Ȱ���ð�: ", JLabel.TRAILING);
    	JTextField fieldtime = new JTextField(10);
    	labeltime.setLabelFor(fieldtime);
    	panel.add(labeltime);
    	panel.add(fieldtime);
    	
   
    	JLabel labelpersonnel = new JLabel("�����ο�: ", JLabel.TRAILING);
    	JTextField fieldpersonnel= new JTextField(10);
    	labelpersonnel.setLabelFor(fieldpersonnel);
    	panel.add(labelpersonnel);
    	panel.add(fieldpersonnel);
    	
    	JLabel labelcondition1 = new JLabel("�������: ", JLabel.TRAILING);
    	JTextField fieldcondition1= new JTextField(10);
    	labelcondition1.setLabelFor(fieldcondition1);
    	panel.add(labelcondition1);
    	panel.add(fieldcondition1);
    	
    	JLabel labelcondition2 = new JLabel("��Ÿ����: ", JLabel.TRAILING);
    	JTextField fieldcondition2= new JTextField(10);
    	labelcondition2.setLabelFor(fieldcondition2);
    	panel.add(labelcondition2);
    	panel.add(fieldcondition2);
    	
    	JLabel labelway = new JLabel("�������: ", JLabel.TRAILING);
    	JTextField fieldway= new JTextField(10);
    	labelway.setLabelFor(fieldway);
    	panel.add(labelway);
    	panel.add(fieldway);
    	
    	JLabel labelsubmission = new JLabel("���⼭��: ", JLabel.TRAILING);
    	JTextField fieldsubmission= new JTextField(10);
    	labelsubmission.setLabelFor(fieldsubmission);
    	panel.add(labelsubmission);
    	panel.add(fieldsubmission);
    	
    	JLabel labelcomment = new JLabel("�ڸ�Ʈ: ", JLabel.TRAILING);
    	JTextField fieldcomment= new JTextField(10);
    	labelcomment.setLabelFor(fieldcomment);
    	panel.add(labelcomment);
    	panel.add(fieldcomment);
    	
    	JButton button1 = new JButton("Save");
    	JButton button2 = new JButton("Exit");
    	
    	
    	button1.addActionListener(new NoticeAdder2Listener(fieldNumber, fieldTitle, fieldCompanyName,fieldlocation,
    	        fieldperiod, fieldcareer ,fieldgender, fieldage, fieldacademic, fieldperiod2, fieldday,fieldtime,
    	    	fieldpersonnel,fieldcondition1,fieldcondition2,fieldway,fieldsubmission,fieldcomment, noticemanager));
    	
    	button2.addActionListener(new NoticeAdderCancelListener(frame));
    	
    	panel.add(button1);
    	panel.add(button2);
    	
    	SpringUtilities.makeCompactGrid(panel, 19,2,6,6,6,6);
    	this.add(panel);
        this.setVisible(true);

    }
}
