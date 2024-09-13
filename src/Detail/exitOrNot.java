package Detail;
import javax.swing.*;
import java.awt.*;
import  java.awt.event.*;
public class exitOrNot extends JFrame{
	public JButton yes = new JButton("Yes");
	public JButton no = new JButton("No");
	JLabel text = new JLabel("Do you want to exit ?");
	JPanel top = new JPanel();
	JPanel bottom = new JPanel();
	public exitOrNot(){
		super.setTitle("Exit");
		this.setLayout(new BorderLayout());
		
		
		text.setFont(new Font("Arial",Font.BOLD,30));
		top.add(text);
		
		yes.setFont(new Font("Arial",Font.BOLD,20));
		yes.setBackground(Color.green);
		no.setFont(new Font("Arial",Font.BOLD,20));
		no.setBackground(Color.red);
		bottom.add(yes);
		bottom.add(no);
		this.add(top,BorderLayout.NORTH);
		this.add(bottom,BorderLayout.SOUTH);
		
		this.setSize(350,150);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
