package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import GUI.ViewNotice;
import GUI.WindowFrame;
import Manager.NoticeManager;

public class ButtonViewListener implements ActionListener {
	WindowFrame frame;
	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ViewNotice view1 = frame.getView();
		NoticeManager noticemanager = getObject("noticemanager.ser");
		view1.setNoticemanager(noticemanager);
        frame.setupPanel(view1);
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
