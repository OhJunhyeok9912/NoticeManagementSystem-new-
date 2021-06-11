package GUI;

import java.awt.Dimension;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Manager.NoticeManager;
import Notice.NoticeInput;
import Notice.Noticekind;

public class ViewNotice extends JPanel{
	
	  /**
	 * 
	 */
	private static final long serialVersionUID = -6938862429253840110L;

	WindowFrame frame;
	NoticeManager noticemanager; 
	
	
	public NoticeManager getNoticemanager() {
		return noticemanager;
	}


	public void setNoticemanager(NoticeManager noticemanager) {
		this.noticemanager = noticemanager;
		this.removeAll();
		
	    DefaultTableModel model = new DefaultTableModel();
	    model.addColumn("����ѹ�");
	    model.addColumn("��������");
	    model.addColumn("ȸ���");
	    model.addColumn("�ٹ��� ��ġ");
	    model.addColumn("�����Ⱓ");
	    model.addColumn("���");
	    model.addColumn("����");
	    model.addColumn("����");
	    model.addColumn("�з�");
	    model.addColumn("�޿�");
	    model.addColumn("�ٹ��Ⱓ");
	    model.addColumn("�ٹ�����");
	    model.addColumn("�ٹ��ð�");
	    model.addColumn("��������");
	    model.addColumn("�����ο�");
	    model.addColumn("�������");
	    model.addColumn("�������");
	    model.addColumn("��Ÿ����");
	    model.addColumn("�������");
	    model.addColumn("���⼭��");
	    model.addColumn("�ڸ�Ʈ");
	    
	    for(int i = 0;i<noticemanager.size();i++) {
	    	Vector row = new Vector();
	    	NoticeInput si = noticemanager.get(i);
	    	if(noticemanager.get(i).getKind() == Noticekind.commercial) {
	    	row.add(si.getNoticeNumber());
	    	row.add(si.getNoticeTitle());
	    	row.add(si.getCompanyName());
	    	row.add(si.getLocation());
	    	row.add(si.getPeriod());
	    	row.add(si.getCareer());
	    	row.add(si.getGender());
	    	row.add(si.getAge());
	    	row.add(si.getAcademic());
	    	row.add(si.getSalary());
	    	row.add(si.getPeriod2());
	    	row.add(si.getDay());
	    	row.add(si.getTime());
	    	row.add(si.getType1());
	    	row.add(si.getPersonnel());
	    	row.add(si.getType2());
	    	row.add(si.getCondition1());
	    	row.add(si.getCondition2());
	    	row.add(si.getWay());
	    	row.add(si.getSubmission());
	    	row.add(si.getComment());
	    	model.addRow(row);
	    }
	    }
	    
	    JTable table = new JTable(model);
	    JScrollPane sp = new JScrollPane(table);
	    sp.setPreferredSize(new Dimension(2100,500));

	    this.add(sp);
	}


	public ViewNotice(WindowFrame frame, NoticeManager noticemanager) {
		   this.frame = frame;
		   this.noticemanager = noticemanager;
			System.out.println("***"+noticemanager.size()+"***");
		   
		    DefaultTableModel model = new DefaultTableModel();
		    model.addColumn("����ѹ�");
		    model.addColumn("��������");
		    model.addColumn("ȸ���");
		    model.addColumn("�ٹ��� ��ġ");
		    model.addColumn("�����Ⱓ");
		    model.addColumn("���");
		    model.addColumn("����");
		    model.addColumn("����");
		    model.addColumn("�з�");
		    model.addColumn("�޿�");
		    model.addColumn("�ٹ��Ⱓ");
		    model.addColumn("�ٹ�����");
		    model.addColumn("�ٹ��ð�");
		    model.addColumn("��������");
		    model.addColumn("�����ο�");
		    model.addColumn("�������");
		    model.addColumn("�������");
		    model.addColumn("��Ÿ����");
		    model.addColumn("�������");
		    model.addColumn("���⼭��");
		    model.addColumn("�ڸ�Ʈ");
		    
		    for(int i = 0;i<noticemanager.size();i++) {
		    	Vector row = new Vector();
		    	NoticeInput si = noticemanager.get(i);
		    	if(noticemanager.get(i).getKind() == Noticekind.commercial) {
		    	row.add(si.getNoticeNumber());
		    	row.add(si.getNoticeTitle());
		    	row.add(si.getCompanyName());
		    	row.add(si.getLocation());
		    	row.add(si.getPeriod());
		    	row.add(si.getCareer());
		    	row.add(si.getGender());
		    	row.add(si.getAge());
		    	row.add(si.getAcademic());
		    	row.add(si.getSalary());
		    	row.add(si.getPeriod2());
		    	row.add(si.getDay());
		    	row.add(si.getTime());
		    	row.add(si.getType1());
		    	row.add(si.getPersonnel());
		    	row.add(si.getType2());
		    	row.add(si.getCondition1());
		    	row.add(si.getCondition2());
		    	row.add(si.getWay());
		    	row.add(si.getSubmission());
		    	row.add(si.getComment());
		    	model.addRow(row);
		    }
		    }
		    
		    JTable table = new JTable(model);
		    JScrollPane sp = new JScrollPane(table);
		    sp.setPreferredSize(new Dimension(2100,500));

		    this.add(sp);

		  } 
}
