package GUI;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import listeners.ButtonAdd2Listener;
import listeners.ButtonAddListener;
import listeners.ButtonSelectNoticeListener;
import listeners.ButtonView2Listener;
import listeners.ButtonViewListener;

public class SelectViewNotice extends JPanel{

	WindowFrame frame;
	public SelectViewNotice(WindowFrame frame) {
		this.frame = frame;
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		JButton button1 = new JButton("봉사활동공고");
    	JButton button2 = new JButton("일반구인공고");
    	
    	button1.addActionListener(new ButtonView2Listener(frame));
        button2.addActionListener(new ButtonViewListener(frame));
    	
    	panel.add(button1);
    	panel.add(button2);
    	this.add(panel);
        this.setVisible(true);
	}

}
