package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import GUI.SelectAddNotice;
import GUI.ViewNotice;
import GUI.WindowFrame;

public class ButtonSelectNoticeListener implements ActionListener{
	WindowFrame frame;
	public ButtonSelectNoticeListener(WindowFrame frame) {
		this.frame = frame;
	}
    
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		SelectAddNotice selectadd = frame.getSelectadd();
        frame.setupPanel(selectadd);
	}
}
