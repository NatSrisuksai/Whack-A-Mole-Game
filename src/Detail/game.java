package Detail;


import javax.swing.*;
import java.awt.*;
import  java.awt.event.*;

public class game extends JFrame implements ActionListener,ItemListener,WindowListener {
	public static int time = 0;
	private String message = "Time  :"+time+"   ";
	private Color colorForBT;
	private boolean boo = true;
	record_score  about_score = new record_score();
	private boolean checkScore_a1 =  false;
	private boolean checkScore_a2 =  false;
	private boolean checkScore_a3 =  false;
	private boolean checkScore_b1 =  false;
	private boolean checkScore_b2 =  false;
	private boolean checkScore_b3 =  false;
	private boolean checkScore_c1 =  false;
	private boolean checkScore_c2 =  false;
	private boolean checkScore_c3 =  false;
	protected static int score_for_sum =  1;
	String mode[] = {"Easy","Normal","Hard"};
	JComboBox<String> cb = new JComboBox<String>(mode);
	JButton a1 = new JButton();
	JButton a2 = new JButton();
	JButton a3 = new JButton();
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	JButton c1 = new JButton();
	JButton c2 = new JButton();
	JButton c3 = new JButton();
	JPanel main_panel = new JPanel();
	JPanel topPanel = new JPanel();
	JLabel text = new JLabel(message);
	JLabel score_txt = new JLabel("Score : 0");
	JButton start = new JButton("Start");
	Timer timer1 = new Timer(1000,this);
	Timer timer2 = new Timer(1000,this);
	ImageIcon icon = new ImageIcon(this.getClass().getResource("mole.png"));
	Image img = icon.getImage();
	Image newImg = img.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
	ImageIcon image = new ImageIcon(newImg);
	public game() {
		this.setTitle("Wahck a mole !");
		topPanel.setBackground(Color.YELLOW);
		this.setLayout(new BorderLayout());
		this.add(topPanel,BorderLayout.NORTH);
		topPanel.setLayout(new FlowLayout());
		topPanel.add(text);
		topPanel.add(score_txt);
		score_txt.setFont(new Font("Arial",Font.BOLD,20));
		text.setFont(new Font("Arial",Font.BOLD,20));
		topPanel.add(cb);
		cb.setFont(new Font("Arial",Font.BOLD,20));
		topPanel.add(start);
		start.setPreferredSize(new Dimension(100,50));
		start.setFont(new Font("Arial",Font.BOLD,20));
		start.setBackground(Color.RED);
		this.add(main_panel,BorderLayout.CENTER);
		main_panel.setLayout(new GridLayout(3,3));
		main_panel.add(a1);
		main_panel.add(a2);
		main_panel.add(a3);
		main_panel.add(b1);
		main_panel.add(b2);
		main_panel.add(b3);
		main_panel.add(c1);
		main_panel.add(c2);
		main_panel.add(c3);
		a1.addActionListener(this);
		a2.addActionListener(this);
		a3.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		c1.addActionListener(this);
		c2.addActionListener(this);
		c3.addActionListener(this);
		addWindowListener(this); 
		this.setSize(600,600);
		this.setLocationRelativeTo(null);
		start.addActionListener(this);
		cb.addItemListener(this);
		
	}
	
	public void windowClosed(WindowEvent e) {
		time = 0;
		about_score.score = 0;
		score_for_sum = 0;
		timer1.stop();
		timer2.stop();
	}
	public void windowActivated(WindowEvent e) {}
	public void windowClosing(WindowEvent e) {
		time = 0;
		about_score.score = 0;
		score_for_sum = 0;
		timer1.stop();
		timer2.stop();
	}
	public void windowDeactivated(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowOpened(WindowEvent e) {}
	
	
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource() == cb && cb.getSelectedItem() == "Easy") {
			timer2.setDelay(1000);
		}else if (e.getSource() == cb && cb.getSelectedItem() == "Normal") {
			timer2.setDelay(800);
		}else if (e.getSource() == cb && cb.getSelectedItem() == "Hard") {
			timer2.setDelay(600);
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == a1 && checkScore_a1 == true) {
			about_score.update_score();
			score_txt.setText("Score : "+about_score.score+" ");
			checkScore_a1 = false;
		}else if(e.getSource() == a2 && checkScore_a2 == true) {
			about_score.update_score();
			score_txt.setText("Score : "+about_score.score+" ");
			checkScore_a2 = false;
		}else if (e.getSource() == a3 && checkScore_a3 == true) {
			about_score.update_score();
			score_txt.setText("Score : "+about_score.score+" ");
			checkScore_a3= false;
		}else if (e.getSource() == b1 && checkScore_b1 == true) {
			about_score.update_score();
			score_txt.setText("Score : "+about_score.score+" ");
			checkScore_b1= false;
		}else if (e.getSource() == b2 && checkScore_b2 == true) {
			about_score.update_score();
			score_txt.setText("Score : "+about_score.score+" ");
			checkScore_b2= false;
		}else if (e.getSource() == b3 && checkScore_b3 == true) {
			about_score.update_score();
			score_txt.setText("Score : "+about_score.score+" ");
			checkScore_b3= false;
		}else if (e.getSource() == c1 && checkScore_c1 == true) {
			about_score.update_score();
			score_txt.setText("Score : "+about_score.score+" ");
			checkScore_c1= false;
		}else if (e.getSource() == c2 && checkScore_c2 == true) {
			about_score.update_score();
			score_txt.setText("Score : "+about_score.score+" ");
			checkScore_c1= false;
		}else if (e.getSource() == c3 && checkScore_c3 == true) {
			about_score.update_score();
			score_txt.setText("Score : "+about_score.score+" ");
			checkScore_c3= false;
		}else if (e.getSource() == a1 && checkScore_a1 == false && about_score.score > 0){
			about_score.decrease_score();
			score_txt.setText("Score : "+about_score.score+" ");
		}else if (e.getSource() == a2 && checkScore_a2 == false && about_score.score > 0){
			about_score.decrease_score();
			score_txt.setText("Score : "+about_score.score+" ");
		}else if (e.getSource() == a3 && checkScore_a3 == false && about_score.score > 0){
			about_score.decrease_score();
			score_txt.setText("Score : "+about_score.score+" ");
		}else if (e.getSource() == b1 && checkScore_b1 == false && about_score.score > 0){
			about_score.decrease_score();
			score_txt.setText("Score : "+about_score.score+" ");
		}else if (e.getSource() == b2 && checkScore_b2 == false && about_score.score > 0){
			about_score.decrease_score();
			score_txt.setText("Score : "+about_score.score+" ");
		}else if (e.getSource() == b3 && checkScore_b3 == false && about_score.score > 0){
			about_score.decrease_score();
			score_txt.setText("Score : "+about_score.score+" ");
		}else if (e.getSource() == c1 && checkScore_c1 == false && about_score.score > 0){
			about_score.decrease_score();
			score_txt.setText("Score : "+about_score.score+" ");
		}else if (e.getSource() == c2 && checkScore_c2 == false && about_score.score > 0){
			about_score.decrease_score();
			score_txt.setText("Score : "+about_score.score+" ");
		}else if (e.getSource() == c3 && checkScore_c3 == false && about_score.score > 0){
			about_score.decrease_score();
			score_txt.setText("Score : "+about_score.score+" ");
		}
		if(e.getSource() == start) {
			time =  0;
			about_score.score = 0;
			text.setText("Time  :"+0+"   ");
			score_txt.setText("Score : "+about_score.score+" ");
			timer1.start();
		}
		if (e.getSource() == timer1) {
			if (time <= 20) {
				timer2.start();
				time++;
//				timer2.start();
				text.setFont(new Font("Arial",Font.BOLD,20));
				text.setText("Time  :"+(time-1)+"   ");
			}else {
				score_for_sum = about_score.score;
				time = 0;
				timer1.stop();
				timer2.stop();
				a1.setBackground(null);
				a2.setBackground(null);
				a3.setBackground(null);
				b1.setBackground(null);
				b2.setBackground(null);
				b3.setBackground(null);
				c1.setBackground(null);
				c2.setBackground(null);
				c3.setBackground(null);
				a1.setIcon(null);
				a2.setIcon(null);
				a3.setIcon(null);
				b1.setIcon(null);
				b2.setIcon(null);
				b3.setIcon(null);
				c1.setIcon(null);
				c2.setIcon(null);
				c3.setIcon(null);
				checkScore_a1 = false;
				checkScore_a2 = false;
				checkScore_a3 = false;
				checkScore_b1 = false;
				checkScore_b2 = false;
				checkScore_b3 = false;
				checkScore_c1 = false;
				checkScore_c2 = false;
				checkScore_c3 = false;
				about_score.score = 0;
				Summary summary = new Summary();
				summary.setVisible(true);
			}
			}
		if (e.getSource() == timer2) {
			game_random pos = new game_random();
			int val =  pos.int_random;
			TrueToFalse booColor = (TrueToFalse) new record_score();
			if (booColor.tof(boo) == true) {
				boo = booColor.tof(boo);
				colorForBT = Color.RED;
			}else if(booColor.tof(boo) == false){
				boo = booColor.tof(boo);
				colorForBT = Color.CYAN;
			}
			if (true) {
				if (val == 0) {
					a1.setBackground(colorForBT);
					checkScore_a1 = true;
					checkScore_a2 = false;
					checkScore_a3 = false;
					checkScore_b1 = false;
					checkScore_b2 = false;
					checkScore_b3 = false;
					checkScore_c1 = false;
					checkScore_c2 = false;
					checkScore_c3 = false;
					a1.setIcon(image);
					a2.setIcon(null);
					a3.setIcon(null);
					b1.setIcon(null);
					b2.setIcon(null);
					b3.setIcon(null);
					c1.setIcon(null);
					c2.setIcon(null);
					c3.setIcon(null);
					a2.setBackground(null);
					a3.setBackground(null);
					b1.setBackground(null);
					b2.setBackground(null);
					b3.setBackground(null);
					c1.setBackground(null);
					c2.setBackground(null);
					c3.setBackground(null);
				}else if (val == 1) {
					a1.setBackground(null);
					a2.setBackground(colorForBT);
					checkScore_a1 = false;
					checkScore_a2 = true;
					checkScore_a3 = false;
					checkScore_b1 = false;
					checkScore_b2 = false;
					checkScore_b3 = false;
					checkScore_c1 = false;
					checkScore_c2 = false;
					checkScore_c3 = false;
					a1.setIcon(null);
					a2.setIcon(image);
					a3.setIcon(null);
					b1.setIcon(null);
					b2.setIcon(null);
					b3.setIcon(null);
					c1.setIcon(null);
					c2.setIcon(null);
					c3.setIcon(null);
					a3.setBackground(null);
					b1.setBackground(null);
					b2.setBackground(null);
					b3.setBackground(null);
					c1.setBackground(null);
					c2.setBackground(null);
					c3.setBackground(null);
				}else if (val == 2) {
					a1.setBackground(null);
					a2.setBackground(null);
					a3.setBackground(colorForBT);
					checkScore_a1 = false;
					checkScore_a2 = false;
					checkScore_a3 = true;
					checkScore_b1 = false;
					checkScore_b2 = false;
					checkScore_b3 = false;
					checkScore_c1 = false;
					checkScore_c2 = false;
					checkScore_c3 = false;
					a1.setIcon(null);
					a2.setIcon(null);
					a3.setIcon(image);
					b1.setIcon(null);
					b2.setIcon(null);
					b3.setIcon(null);
					c1.setIcon(null);
					c2.setIcon(null);
					c3.setIcon(null);
					b1.setBackground(null);
					b2.setBackground(null);
					b3.setBackground(null);
					c1.setBackground(null);
					c2.setBackground(null);
					c3.setBackground(null);
				}else if (val == 3) {
					a1.setBackground(null);
					a2.setBackground(null);
					a3.setBackground(null);
					b1.setBackground(colorForBT);
					checkScore_a1 = false;
					checkScore_a2 = false;
					checkScore_a3 = false;
					checkScore_b1 = true;
					checkScore_b2 = false;
					checkScore_b3 = false;
					checkScore_c1 = false;
					checkScore_c2 = false;
					checkScore_c3 = false;
					a1.setIcon(null);
					a2.setIcon(null);
					a3.setIcon(null);
					b1.setIcon(image);
					b2.setIcon(null);
					b3.setIcon(null);
					c1.setIcon(null);
					c2.setIcon(null);
					c3.setIcon(null);
					b2.setBackground(null);
					b3.setBackground(null);
					c1.setBackground(null);
					c2.setBackground(null);
					c3.setBackground(null);
				}else if (val == 4) {
					a1.setBackground(null);
					a2.setBackground(null);
					a3.setBackground(null);
					b1.setBackground(null);
					b2.setBackground(colorForBT);
					checkScore_a1 = false;
					checkScore_a2 = false;
					checkScore_a3 = false;
					checkScore_b1 = false;
					checkScore_b2 = true;
					checkScore_b3 = false;
					checkScore_c1 = false;
					checkScore_c2 = false;
					checkScore_c3 = false;
					a1.setIcon(null);
					a2.setIcon(null);
					a3.setIcon(null);
					b1.setIcon(null);
					b2.setIcon(image);
					b3.setIcon(null);
					c1.setIcon(null);
					c2.setIcon(null);
					c3.setIcon(null);
					b3.setBackground(null);
					c1.setBackground(null);
					c2.setBackground(null);
					c3.setBackground(null);
				}else if (val == 5) {
					a1.setBackground(null);
					a2.setBackground(null);
					a3.setBackground(null);
					b1.setBackground(null);
					b2.setBackground(null);
					b3.setBackground(colorForBT);
					checkScore_a1 = false;
					checkScore_a2 = false;
					checkScore_a3 = false;
					checkScore_b1 = false;
					checkScore_b2 = false;
					checkScore_b3 = true;
					checkScore_c1 = false;
					checkScore_c2 = false;
					checkScore_c3 = false;
					a1.setIcon(null);
					a2.setIcon(null);
					a3.setIcon(null);
					b1.setIcon(null);
					b2.setIcon(null);
					b3.setIcon(image);
					c1.setIcon(null);
					c2.setIcon(null);
					c3.setIcon(null);
					c1.setBackground(null);
					c2.setBackground(null);
					c3.setBackground(null);
				}else if (val == 6) {
					a1.setBackground(null);
					a2.setBackground(null);
					a3.setBackground(null);
					b1.setBackground(null);
					b2.setBackground(null);
					b3.setBackground(null);
					c1.setBackground(colorForBT);
					checkScore_a1 = false;
					checkScore_a2 = false;
					checkScore_a3 = false;
					checkScore_b1 = false;
					checkScore_b2 = false;
					checkScore_b3 = false;
					checkScore_c1 = true;
					checkScore_c2 = false;
					checkScore_c3 = false;
					a1.setIcon(null);
					a2.setIcon(null);
					a3.setIcon(null);
					b1.setIcon(null);
					b2.setIcon(null);
					b3.setIcon(null);
					c1.setIcon(image);
					c2.setIcon(null);
					c3.setIcon(null);
					c2.setBackground(null);
					c3.setBackground(null);
				}else if (val == 7) {
					a1.setBackground(null);
					a2.setBackground(null);
					a3.setBackground(null);
					b1.setBackground(null);
					b2.setBackground(null);
					b3.setBackground(null);
					c1.setBackground(null);
					c2.setBackground(colorForBT);
					checkScore_a1 = false;
					checkScore_a2 = false;
					checkScore_a3 = false;
					checkScore_b1 = false;
					checkScore_b2 = false;
					checkScore_b3 = false;
					checkScore_c1 = false;
					checkScore_c2 = true;
					checkScore_c3 = false;
					a1.setIcon(null);
					a2.setIcon(null);
					a3.setIcon(null);
					b1.setIcon(null);
					b2.setIcon(null);
					b3.setIcon(null);
					c1.setIcon(null);
					c2.setIcon(image);
					c3.setIcon(null);
					c3.setBackground(null);
				}else if (val == 8) {
					a1.setBackground(null);
					a2.setBackground(null);
					a3.setBackground(null);
					b1.setBackground(null);
					b2.setBackground(null);
					b3.setBackground(null);
					c1.setBackground(null);
					c2.setBackground(null);
					c3.setBackground(colorForBT);
					checkScore_a1 = false;
					checkScore_a2 = false;
					checkScore_a3 = false;
					checkScore_b1 = false;
					checkScore_b2 = false;
					checkScore_b3 = false;
					checkScore_c1 = false;
					checkScore_c2 = false;
					checkScore_c3 = true;
					a1.setIcon(null);
					a2.setIcon(null);
					a3.setIcon(null);
					b1.setIcon(null);
					b2.setIcon(null);
					b3.setIcon(null);
					c1.setIcon(null);
					c2.setIcon(null);
					c3.setIcon(image);
				}
				
		}
	}
}
}
