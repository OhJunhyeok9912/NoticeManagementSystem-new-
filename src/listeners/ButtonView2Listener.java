package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import GUI.ViewNotice;
import GUI.ViewNotice2;
import GUI.WindowFrame;
import Manager.NoticeManager;

public class ButtonView2Listener implements ActionListener {
	WindowFrame frame;
	public ButtonView2Listener(WindowFrame frame) {
		this.frame = frame;
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ViewNotice2 view2 = frame.getView2();
		NoticeManager noticemanager = getObject("noticemanager.ser");
		view2.setNoticemanager(noticemanager);
        frame.setupPanel(view2);
	}

	public static NoticeManager getObject(String Filename) {
		NoticeManager noticemanager = null;	
		try {
			FileInputStream file = new FileInputStream(Filename);
			ObjectInputStream in = new ObjectInputStream(file);				
			noticemanager = (NoticeManager) in.readObject();				
			in.close();
			file.close();				
		    }catch (FileNotFoundException e) {
				return noticemanager;
			}  catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  catch (IOException e) {
			    e.printStackTrace();
		}
        return noticemanager;			 
	 }
}
