package Detail;

import javax.swing.*;
import java.awt.*;
import  java.awt.event.*;

public class Menu extends JPanel implements ActionListener{
	JButton start_btn = new JButton("Start");
	public JButton exit_btn = new JButton("Exit");
	Font font = new Font("SansSerif",Font.BOLD,40);
	String name = new name_input().message;
	public Menu() {
		this.add(start_btn);
		start_btn.setPreferredSize(new Dimension(150,60));
		start_btn.setFont(new Font("Arial",Font.BOLD,20));
		start_btn.setBackground(Color.green);
		this.add(exit_btn);
		exit_btn.setPreferredSize(new Dimension(150,60));
		exit_btn.setFont(new Font("Arial",Font.BOLD,20));
		exit_btn.setBackground(Color.red);
		start_btn.addActionListener(this);
		exit_btn.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == start_btn && name_input.gNext == true ) {
			game gameFrame = new game();
			gameFrame.setVisible(true);
		}else if (e.getSource() == start_btn && name == "" && name_input.gNext == false) {
			ForGetName fgn = new ForGetName();
			fgn.setVisible(true);
		}
	}
}

