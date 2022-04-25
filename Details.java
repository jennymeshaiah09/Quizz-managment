package project;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Details {
	JFrame frame;
	JPanel p1,p2,p3,p4,p5;
	JButton b1,b3;
	JTextField t1,t2,tf1;
	JLabel l1,l2,l3,l4;
	Details(){
		{
			
			frame  = new JFrame("Login");
			frame.setBackground(Color.black);
			
			p1 = new JPanel();
			p2 = new JPanel( new GridLayout(1,2));
			p3 = new JPanel(new GridLayout(1,2));
			p4 = new JPanel(new GridLayout(1,2));
			p5 = new JPanel();
			
			p1.setBackground(Color.WHITE);
			
			p2.setBackground(Color.BLACK);
			
			p3.setBackground(Color.BLACK);
			
			p4.setBackground(Color.BLACK);
			
			l1 = new JLabel("Quiz Results");
			l1.setForeground(Color.RED);
			l1.setFont(new Font("Courier", Font.BOLD, 32));
			
			l2 = new JLabel("Student Id:");
			l2.setForeground(Color.white);
			
			l3 = new JLabel("Student Name:");
			l3.setForeground(Color.white);
			
			l4 = new JLabel("Points");
			l4.setForeground(Color.white);
			
			
			t1 = new JTextField();
			t1.setText(Working.name);
			t2 = new JTextField();
			t2.setText(Working.id);
			
			b1 = new JButton("Continue");
			b3 = new JButton("Back");
			
			tf1 = new JTextField();
			tf1.setText(Integer.toString(Working.points));
			
			p1.add(l1);
			
			p2.add(l2);
			p2.add(t1);
			
			
			p3.add(l3);
			p3.add(t2);
			
			p4.add(l4);
			p4.add(tf1);
			
			frame.add(p1);
			frame.add(p2);
			frame.add(p3);
			frame.add(p4);
			
			
			frame.setSize(500,500);
			frame.setLayout(new GridLayout(4,1));
			frame.setVisible(true);
			
			
		}
	}
	public static void main(String args[]) {
		new Details();
	}

}
