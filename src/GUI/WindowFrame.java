package GUI;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Manager.NoticeManager;

public class WindowFrame extends JFrame {

	NoticeManager noticemanager; 
	MenuSelection menu;
	SelectAddNotice selectadd;
	NoticeAdder add;
	NoticeAdder2 add2;
	SelectViewNotice selectview;
	ViewNotice view;
	ViewNotice2 view2;
    
	
	
	
	public WindowFrame(NoticeManager noticemanager) {
    	this.noticemanager = noticemanager;
    	this.menu = new MenuSelection(this);
    	this.selectadd = new SelectAddNotice(this);
   	    this.add =  new NoticeAdder(this);
   	    this.add2 =  new NoticeAdder2(this);
   	    this.selectview = new SelectViewNotice(this);
   	    this.view = new ViewNotice(this, this.noticemanager);
   	    this.view2 = new ViewNotice2(this, this.noticemanager);

    	
    	this.setSize(2300,800);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    	this.setupPanel(menu);
    	this.setVisible(true);
	}
	
	public MenuSelection getMenu() {
		return menu;
	}

	public void setMenu(MenuSelection menu) {
		this.menu = menu;
	}

	public SelectAddNotice getSelectadd() {
		return selectadd;
	}

	public void setSelectadd(SelectAddNotice selectadd) {
		this.selectadd = selectadd;
	}
 
	public NoticeAdder getAdd() {
		return add;
	}

	public void setAdd(NoticeAdder add) {
		this.add = add;
	}

	public NoticeAdder2 getAdd2() {
		return add2;
	}

	public void setAdd2(NoticeAdder2 add2) {
		this.add2 = add2;
	}
     	
	public SelectViewNotice getSelectview() {
		return selectview;
	}

	public void setSelectview(SelectViewNotice selectview) {
		this.selectview = selectview;
	}
	
	public ViewNotice getView() {
		return view;
	}

	public void setView(ViewNotice view) {
		this.view = view;
	}

	public ViewNotice2 getView2() {
		return view2;
	}

	public void setView2(ViewNotice2 view2) {
		this.view2 = view2;
	}

	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}

}
