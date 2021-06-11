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
	    model.addColumn("공고넘버");
	    model.addColumn("공고제목");
	    model.addColumn("회사명");
	    model.addColumn("근무지 위치");
	    model.addColumn("모집기간");
	    model.addColumn("경력");
	    model.addColumn("성별");
	    model.addColumn("나이");
	    model.addColumn("학력");
	    model.addColumn("급여");
	    model.addColumn("근무기간");
	    model.addColumn("근무요일");
	    model.addColumn("근무시간");
	    model.addColumn("모집직종");
	    model.addColumn("모집인원");
	    model.addColumn("고용형태");
	    model.addColumn("우대조건");
	    model.addColumn("기타조건");
	    model.addColumn("지원방법");
	    model.addColumn("제출서류");
	    model.addColumn("코멘트");
	    
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
		    model.addColumn("공고넘버");
		    model.addColumn("공고제목");
		    model.addColumn("회사명");
		    model.addColumn("근무지 위치");
		    model.addColumn("모집기간");
		    model.addColumn("경력");
		    model.addColumn("성별");
		    model.addColumn("나이");
		    model.addColumn("학력");
		    model.addColumn("급여");
		    model.addColumn("근무기간");
		    model.addColumn("근무요일");
		    model.addColumn("근무시간");
		    model.addColumn("모집직종");
		    model.addColumn("모집인원");
		    model.addColumn("고용형태");
		    model.addColumn("우대조건");
		    model.addColumn("기타조건");
		    model.addColumn("지원방법");
		    model.addColumn("제출서류");
		    model.addColumn("코멘트");
		    
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
