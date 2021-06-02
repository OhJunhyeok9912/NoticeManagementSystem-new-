package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import GUI.SelectAddNotice;
import GUI.SelectViewNotice;
import GUI.ViewNotice;
import GUI.WindowFrame;

public class ButtonSelectViewListener implements ActionListener{
	WindowFrame frame;
	public ButtonSelectViewListener(WindowFrame frame) {
		this.frame = frame;
	}
    
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		SelectViewNotice selectview = frame.getSelectview();
        frame.setupPanel(selectview);
	}
}
