package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import GUI.MenuSelection;
import GUI.NoticeAdder;
import GUI.ViewNotice;
import GUI.WindowFrame;

public class NoticeAdderCancelListener implements ActionListener {
	WindowFrame frame;
	public NoticeAdderCancelListener(WindowFrame frame) {
		this.frame = frame;
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		MenuSelection menu = frame.getMenu();
        frame.setupPanel(menu);
	}

}
