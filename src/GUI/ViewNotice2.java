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
	    model.addColumn("����ѹ�");
	    model.addColumn("��������");
	    model.addColumn("�������");
	    model.addColumn("Ȱ��ó ��ġ");
	    model.addColumn("�����Ⱓ");
	    model.addColumn("���");
	    model.addColumn("����");
	    model.addColumn("����");
	    model.addColumn("�з�");
	    model.addColumn("Ȱ���Ⱓ");
	    model.addColumn("Ȱ������");
	    model.addColumn("Ȱ���ð�");
	    model.addColumn("�����ο�");;
	    model.addColumn("�������");
	    model.addColumn("��Ÿ����");
	    model.addColumn("�������");
	    model.addColumn("���⼭��");
	    model.addColumn("�ڸ�Ʈ");
	    
	    JTable table = new JTable(model);
	    JScrollPane sp = new JScrollPane(table);
	    
	    this.add(sp);
	    this.setSize(1000,500);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setVisible(true);
	  } 
}
