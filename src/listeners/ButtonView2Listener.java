package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import GUI.ViewNotice;
import GUI.ViewNotice2;
import GUI.WindowFrame;

public class ButtonView2Listener implements ActionListener {
	WindowFrame frame;
	public ButtonView2Listener(WindowFrame frame) {
		this.frame = frame;
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		ViewNotice2 view2 = frame.getView2();
        frame.setupPanel(view2);
	}

}
