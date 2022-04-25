package project;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login  implements ActionListener {

	static Working working = new Working();	
	
	JFrame frame;
	JPanel p1,p2,p3,p4,p5;//p6;
	JButton b1,b3;
	JTextField t1,t2;
	JLabel l1,l2,l3;

	
	Login(){
		
		frame  = new JFrame("Register");
		frame.setBackground(Color.black);
		
		p1 = new JPanel();
		p2 = new JPanel( new GridLayout(1,2));
		p3 = new JPanel(new GridLayout(1,2));
		p4 = new JPanel();
		p5 = new JPanel();
		//p6 = new JPanel();
		p1.setBackground(Color.WHITE);
		
		p2.setBackground(Color.BLACK);
		
		p3.setBackground(Color.BLACK);
		
		p4.setBackground(Color.BLUE);
		
		l1 = new JLabel("Student Details");
		l1.setForeground(Color.RED);
		l1.setFont(new Font("Courier", Font.BOLD, 32));
		
		l2 = new JLabel("Enter Student Id:");
		l2.setForeground(Color.white);
		
		l3 = new JLabel("Enter Student Name:");
		l3.setForeground(Color.white);
		
		
		t1 = new JTextField();
		t2 = new JTextField();
		
		b1 = new JButton("Continue");
		b3 = new JButton("Back");
		//b4 = new JButton("Reset");
		
		p1.add(l1);
		
		p2.add(l2);
		p2.add(t1);
		
		p3.add(l3);
		p3.add(t2);
		
		
		p4.add(b3);
		p4.add(b1);
		//p6.add(b4);
		b1.addActionListener(this);
		b3.addActionListener(this);
		
		
		frame.add(p1);
		frame.add(p2);
		frame.add(p3);
		frame.add(p4);
		
		
		
		
		
		
		//frame.add(p6);
		
		frame.setSize(500,500);
		frame.setLayout(new GridLayout(4,1));
		frame.setVisible(true);
		
		
	}
	public void actionPerformed(ActionEvent e) {
		
		Working.name=t1.getText();
		Working.id=t2.getText();
		if(e.getSource()==b1) {
			new Frame1();
		}
		else if(e.getSource()==b3) {
			new guru_register();
		}
		
		}
	
	public static void main(String args[]) {
		new Login();
	}

}
