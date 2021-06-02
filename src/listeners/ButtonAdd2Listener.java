package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import GUI.NoticeAdder;
import GUI.NoticeAdder2;
import GUI.ViewNotice;
import GUI.WindowFrame;

public class ButtonAdd2Listener implements ActionListener {
	WindowFrame frame;
	public ButtonAdd2Listener(WindowFrame frame) {
		this.frame = frame; //
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		NoticeAdder2 adder2 = frame.getAdd2();
        frame.setupPanel(adder2);//
	}

}
