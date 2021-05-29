package GUI;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ViewNotice2 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6582962922193477753L;

	public ViewNotice2() {
	    
	    DefaultTableModel model = new DefaultTableModel();
	    model.addColumn("공고넘버");
	    model.addColumn("공고제목");
	    model.addColumn("모집기관");
	    model.addColumn("활동처 위치");
	    model.addColumn("모집기간");
	    model.addColumn("경력");
	    model.addColumn("성별");
	    model.addColumn("나이");
	    model.addColumn("학력");
	    model.addColumn("활동기간");
	    model.addColumn("활동요일");
	    model.addColumn("활동시간");
	    model.addColumn("모집인원");;
	    model.addColumn("우대조건");
	    model.addColumn("기타조건");
	    model.addColumn("지원방법");
	    model.addColumn("제출서류");
	    model.addColumn("코멘트");
	    
	    JTable table = new JTable(model);
	    JScrollPane sp = new JScrollPane(table);
	    
	    this.add(sp);
	    this.setSize(1000,500);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setVisible(true);
	  } 
}
