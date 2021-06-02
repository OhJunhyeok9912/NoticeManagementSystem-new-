package GUI;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import listeners.ButtonAddListener;
import listeners.ButtonSelectNoticeListener;
import listeners.ButtonSelectViewListener;
import listeners.ButtonViewListener;

public class MenuSelection extends JPanel{
    
	WindowFrame frame;
	
	public MenuSelection(WindowFrame frame) {
		
		this.frame = frame;
		
        this.setLayout(new BorderLayout());
    	JPanel panel1 = new JPanel();
    	JPanel panel2 = new JPanel();
        JLabel label = new JLabel("Menu Selection");
        JButton button1 = new JButton("Add Notice");
        JButton button2 = new JButton("Delete Notice");
        JButton button3 = new JButton("Edit Notice");
        JButton button4 = new JButton("View Notice");
        JButton button5 = new JButton("EXIT");    
        
        button1.addActionListener(new ButtonSelectNoticeListener(frame));
        button4.addActionListener(new ButtonSelectViewListener(frame));

        
        
        
        panel1.add(label, BorderLayout.NORTH);
        panel2.add(button1);
        panel2.add(button2);
        panel2.add(button3);
        panel2.add(button4); 
        panel2.add(button5);
        this.add(panel1, BorderLayout.NORTH);
    	this.add(panel2, BorderLayout.CENTER);
    	this.setVisible(true);
    	
    }
}
