package GUI;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ViewNotice extends JFrame{
	
	  /**
	 * 
	 */
	private static final long serialVersionUID = -6938862429253840110L;

	public ViewNotice() {
		    
		    DefaultTableModel model = new DefaultTableModel();
		    model.addColumn("����ѹ�");
		    model.addColumn("��������");
		    model.addColumn("�ٹ��� ����");
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
		    
		    JTable table = new JTable(model);
		    JScrollPane sp = new JScrollPane(table);
		    
		    this.add(sp);
		    this.setSize(1000,500);
		    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    this.setVisible(true);
		  } 
}
