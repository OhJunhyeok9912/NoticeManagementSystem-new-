package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class ButtonExit implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
       System.exit(0); // 시스템 종료
	}

}
