package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import GUI.NoticeAdder;
import GUI.ViewNotice;
import GUI.WindowFrame;

public class ButtonAddListener implements ActionListener {
	WindowFrame frame;
	public ButtonAddListener(WindowFrame frame) {
		this.frame = frame;
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		NoticeAdder adder1 = frame.getAdd();
        frame.setupPanel(adder1);
	}

}
