package project;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Frame3 implements ActionListener {
	JFrame frame;
	JButton op1,op2,op3,op4,next,prev,reset;
	JPanel p1,p2,p3,p4;
	JLabel l1;
	Frame3(){//b
		frame = new JFrame("Quiz");
		op1 = new JButton("a) Asia");
		op2 = new JButton("b) Africa");
		op3 = new JButton("c) Europe");
		op4 = new JButton("d) Australia");
		next = new JButton("Next");
		prev = new JButton("Previous");
		l1 = new JLabel("3.Eritrea, which became the 182nd member of the UN in 1993, is in the continent of");
		reset = new JButton("Reset");
		
		op1.setBackground(Color.lightGray);
		op1.setForeground(Color.black);
		
		op2.setBackground(Color.lightGray);
		op2.setForeground(Color.black);
		
		op3.setBackground(Color.lightGray);
		op3.setForeground(Color.black);
		
		op4.setBackground(Color.LIGHT_GRAY);
		op4.setForeground(Color.black);
		
		p1 = new JPanel();
		p2 = new JPanel(new GridLayout(2,4));
		p3 = new JPanel(new GridLayout(1,2));
		p4 = new JPanel();
		
		p1.add(l1);
		p2.add(op1);
		p2.add(op2);
		p2.add(op3);
		p2.add(op4);
		p4.add(prev);
		p4.add(next);
		p4.add(reset);
		
		frame.add(p1);
		frame.add(p2);
		frame.add(p3);
		frame.add(p4);
		frame.setLayout(new GridLayout(4,1));
		frame.setVisible(true);
		frame.pack();
		
		op1.addActionListener(this);
		op2.addActionListener(this);
		op3.addActionListener(this);
		op4.addActionListener(this);
		next.addActionListener(this);
		prev.addActionListener(this);
		reset.addActionListener(this);
		
		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==op1 && Working.flag3==0) {
			Working.flag3=1;
			Working.opt3='a';
			op1.setBackground(Color.black);
			op1.setForeground(Color.white);
		}
		else if(e.getSource()==op2 && Working.flag3==0) {
			Working.flag3=1;
			Working.opt3='b';
			op2.setBackground(Color.black);
			op2.setForeground(Color.white);
		}
		else if(e.getSource()==op3 && Working.flag3==0) {
			Working.flag3=1;
			Working.opt3='c';
			op3.setBackground(Color.black);
			op3.setForeground(Color.white);
		}
		else if(e.getSource()==op4 && Working.flag3==0) {
			Working.flag3=1;
			Working.opt3='d';
			op4.setBackground(Color.black);
			op4.setForeground(Color.white);
		}
		else if(e.getSource()==next) {
			new Frame4();
		}
		else if(e.getSource()==prev) {
			new Frame2();
		}
		else if(e.getSource()==reset) {
			Working.flag3=0;
			op1.setBackground(Color.lightGray);
			op1.setForeground(Color.black);
			
			op2.setBackground(Color.lightGray);
			op2.setForeground(Color.black);
			
			op3.setBackground(Color.lightGray);
			op3.setForeground(Color.black);
			
			op4.setBackground(Color.LIGHT_GRAY);
			op4.setForeground(Color.black);
		}
		
		
	}
	public static void main(String args[]) {
		new Frame3();
		
	}

}
