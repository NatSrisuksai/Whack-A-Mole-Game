package GUI;
import Detail.Menu;
import Detail.name_input;
import Detail.game;
import Detail.exitOrNot;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class WhackAMole extends JFrame implements ActionListener{
	JFrame f1 = new JFrame();
	Menu menuPanel = new Menu();
	name_input name = new name_input();
	game gamePanel = new game();
	exitOrNot AreUSure = new exitOrNot();
	WhackAMole(){
		f1.setTitle("Main menu");
		f1.setLayout(new BorderLayout());
		f1.add(menuPanel,BorderLayout.NORTH);
		f1.add(name,BorderLayout.CENTER); 
		menuPanel.exit_btn.addActionListener(this);
		AreUSure.yes.addActionListener(this);
		AreUSure.no.addActionListener(this);
		f1.setVisible(true);
		f1.setSize(800,400);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == menuPanel.exit_btn) {
			AreUSure.setVisible(true);
		}else  if (e.getSource() == AreUSure.no) {
			AreUSure.setVisible(false);
		}else if (e.getSource() == AreUSure.yes) {
			AreUSure.setVisible(false);
			f1.dispose();
		}
	}
	public static void main(String[] args) {
		new WhackAMole();
	}
}