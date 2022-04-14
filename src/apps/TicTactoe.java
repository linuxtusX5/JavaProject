package apps;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TicTactue extends JFrame implements ActionListener {
	
	private int ctr, a, score1=0, score2=0;;
	
	 JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, clr, bt;
	 JLabel message, l1, l2, p1, p2, T1;
	 JTextField s1, s2;
	
	public TicTactue() {
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		panel.setLayout(new GridLayout(5, 3, 3, 3));
		panel.setBorder(BorderFactory.createEmptyBorder(50, 0, 0, 0));
		
		T1 = new JLabel("Welcome");
		T1.setBounds(185, 10, 100, 30);
		T1.setForeground(Color.white);
		T1.setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.add(T1);
		
		bt = new JButton("");
		bt.setBounds(0, 0, 500, 50);
		bt.setBackground(new Color(0, 0, 0));
		bt.setEnabled(false);
		frame.add(bt);
		
		b1 = new JButton("");
		b1.addActionListener(this);
		b1.setBackground(new Color(128, 128, 128));
		//b1.setBounds(10, 10, 75, 53);
		//frame.getContentPane().add(b1);
		panel.add(b1);
		
		b4 = new JButton("");
		b4.addActionListener(this);
		b4.setBackground(new Color(128, 128, 128));
		panel.add(b4);

		b7 = new JButton("");
		b7.addActionListener(this);
		b7.setBackground(new Color(128, 128, 128));
		panel.add(b7);

		b2 = new JButton("");
		b2.addActionListener(this);
		b2.setBackground(new Color(128, 128, 128));
		panel.add(b2);
		
		b5 = new JButton("");
		b5.addActionListener(this);
		b5.setBackground(new Color(128, 128, 128));
		panel.add(b5);
		
		b8 = new JButton("");
		b8.addActionListener(this);
		b8.setBackground(new Color(128, 128, 128));
		panel.add(b8);
		
		b3 = new JButton("");
		b3.addActionListener(this);
		b3.setBackground(new Color(128, 128, 128));
		panel.add(b3);
		
		b6 = new JButton("");
		b6.addActionListener(this);
		b6.setBackground(new Color(128, 128, 128));
		panel.add(b6);
		
		b9 = new JButton("");
		b9.addActionListener(this);
		b9.setBackground(new Color(128, 128, 128));
		panel.add(b9);
		
		l1 = new JLabel("");
		panel.add(l1);
		
		clr = new JButton("reset");
		clr.addActionListener(this);
		clr.setBounds(350, 320, 100, 30);
		clr.setFont(new Font("Tahoma", Font.BOLD, 15));
		//clr.setForeground(Color.red);
		frame.add(clr);

		l2 = new JLabel("");
		panel.add(l2);
		
		message = new JLabel("");
		message.setBounds(350, 355, 500, 30);
		frame.add(message);

		
		p1 = new JLabel("Player1_Score :");
		p1.setFont(new Font("Tahoma", Font.BOLD, 15));
		p1.setForeground(Color.BLUE);
		p1.setBounds(5, 340, 500, 30);
		frame.add(p1);
		
		s1 = new JTextField("0");
		s1.setEnabled(false);
		s1.setFont(new Font("Tahoma", Font.BOLD,15));
		s1.setBounds(170, 340, 50, 30);
		frame.add(s1);

		p2 = new JLabel("Player2_Score :");
		p2.setFont(new Font("Tahoma", Font.BOLD, 15));
		p2.setForeground(Color.RED);
		p2.setBounds(5, 375, 500, 30);
		frame.add(p2);
		
		s2 = new JTextField("0");
		s2.setEnabled(false);
		s2.setFont(new Font("Tahoma", Font.BOLD, 15));
		s2.setBounds(170, 375, 50, 30);
		frame.add(s2);
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.pack();
		frame.setSize(500, 500);
		frame.setTitle("TicTacToe");
	}
	public void actionPerformed(ActionEvent iu) {
		ctr++;
		
		if(iu.getSource().equals(b1)) {
			b1.setBackground(Color.LIGHT_GRAY);
				a = ctr%2;
				if( a == 0)
				{
					b1.setText("X");
					b1.setEnabled(false);
					message.setText("Player1 your turn...");
					message.setFont(new Font("Tahoma", Font.BOLD, 11));
					b1.setFont(new Font("Tahoma", Font.BOLD, 20));
					message.setForeground(Color.BLUE);
				}
				else
				{
					b1.setText("O");
					b1.setEnabled(false);
					message.setText("Player2 your turn...");
					message.setFont(new Font("Tahoma", Font.BOLD, 11));
					b1.setFont(new Font("Tahoma", Font.BOLD, 20));
					message.setForeground(Color.RED);
				}
				Winning();		
		}if(iu.getSource().equals(b4)) {	
			b4.setBackground(Color.LIGHT_GRAY);
			a = ctr%2;
			if( a == 0)
			{
				b4.setText("X");
				b4.setEnabled(false);
				message.setText("Player1 your turn...");
				message.setFont(new Font("Tahoma", Font.BOLD, 11));
				b4.setFont(new Font("Tahoma", Font.BOLD, 20));
				message.setForeground(Color.BLUE);
			}
			else
			{
				b4.setText("O");
				b4.setEnabled(false);
				message.setText("Player2 your turn...");
				message.setFont(new Font("Tahoma", Font.BOLD, 11));
				b4.setFont(new Font("Tahoma", Font.BOLD, 20));
				message.setForeground(Color.RED);
			}
			Winning();		
		}if(iu.getSource().equals(b7)) {
			b7.setBackground(Color.LIGHT_GRAY);
			a = ctr%2;
			if( a == 0)
			{
				b7.setText("X");
				b7.setEnabled(false);
				message.setText("Player1 your turn...");
				message.setFont(new Font("Tahoma", Font.BOLD, 11));
				b7.setFont(new Font("Tahoma", Font.BOLD, 20));
				message.setForeground(Color.BLUE);
			}
			else
			{
				b7.setText("O");
				b7.setEnabled(false);
				message.setText("Player2 your turn...");
				message.setFont(new Font("Tahoma", Font.BOLD, 11));
				b7.setFont(new Font("Tahoma", Font.BOLD, 20));
				message.setForeground(Color.RED);
			}
			Winning();		
		}if(iu.getSource().equals(b2)) {	
			b2.setBackground(Color.LIGHT_GRAY);
			a = ctr%2;
			if( a == 0)
			{
				b2.setText("X");
				b2.setEnabled(false);
				message.setText("Player1 your turn...");
				message.setFont(new Font("Tahoma", Font.BOLD, 11));
				b2.setFont(new Font("Tahoma", Font.BOLD, 20));
				message.setForeground(Color.BLUE);
			}
			else
			{
				b2.setText("O");
				b2.setEnabled(false);
				message.setText("Player2 your turn...");
				message.setFont(new Font("Tahoma", Font.BOLD, 11));
				b2.setFont(new Font("Tahoma", Font.BOLD, 20));
				message.setForeground(Color.RED);
			}		
			Winning();
		}if(iu.getSource().equals(b5)) {
			b5.setBackground(Color.LIGHT_GRAY);
			a = ctr%2;
			if( a == 0)
			{
				b5.setText("X");
				b5.setEnabled(false);
				message.setText("Player1 your turn...");
				message.setFont(new Font("Tahoma", Font.BOLD, 11));
				b5.setFont(new Font("Tahoma", Font.BOLD, 20));
				message.setForeground(Color.BLUE);
			}
			else
			{
				b5.setText("O");
				b5.setEnabled(false);
				message.setText("Player2 your turn...");
				message.setFont(new Font("Tahoma", Font.BOLD, 11));
				b5.setFont(new Font("Tahoma", Font.BOLD, 20));
				message.setForeground(Color.RED);
			}	
			Winning();	
		}if(iu.getSource().equals(b8)) {
			b8.setBackground(Color.LIGHT_GRAY);
			a = ctr%2;
			if( a == 0)
			{
				b8.setText("X");
				b8.setEnabled(false);
				message.setText("Player1 your turn...");
				message.setFont(new Font("Tahoma", Font.BOLD, 11));
				b8.setFont(new Font("Tahoma", Font.BOLD, 20));
				message.setForeground(Color.BLUE);
			}
			else
			{
				b8.setText("O");
				b8.setEnabled(false);
				message.setText("Player2 your turn...");
				message.setFont(new Font("Tahoma", Font.BOLD, 11));
				b8.setFont(new Font("Tahoma", Font.BOLD, 20));
				message.setForeground(Color.RED);
			}	
			Winning();	
		}if(iu.getSource().equals(b3)) {	
			b3.setBackground(Color.LIGHT_GRAY);
			a = ctr%2;
			if( a == 0)
			{
				b3.setText("X");
				b3.setEnabled(false);
				message.setText("Player1 your turn...");
				message.setFont(new Font("Tahoma", Font.BOLD, 11));
				b3.setFont(new Font("Tahoma", Font.BOLD, 20));
				message.setForeground(Color.BLUE);
			}
			else
			{
				b3.setText("O");
				b3.setEnabled(false);
				message.setText("Player2 your turn...");
				message.setFont(new Font("Tahoma", Font.BOLD, 11));
				b3.setFont(new Font("Tahoma", Font.BOLD, 20));
				message.setForeground(Color.RED);
			}		
			Winning();
		}if(iu.getSource().equals(b6)) {
			b6.setBackground(Color.LIGHT_GRAY);
			a = ctr%2;
			if( a == 0)
			{
				b6.setText("X");
				b6.setEnabled(false);
				message.setText("Player1 your turn...");
				message.setFont(new Font("Tahoma", Font.BOLD, 11));
				b6.setFont(new Font("Tahoma", Font.BOLD, 20));
				message.setForeground(Color.BLUE);
			}
			else
			{
				b6.setText("O");
				b6.setEnabled(false);
				message.setText("Player2 your turn...");
				message.setFont(new Font("Tahoma", Font.BOLD, 11));
				b6.setFont(new Font("Tahoma", Font.BOLD, 20));
				message.setForeground(Color.RED);
			}	
			Winning();	
		}if(iu.getSource().equals(b9)) {	
			b9.setBackground(Color.LIGHT_GRAY);
			a = ctr%2;
			if( a == 0)
			{
				b9.setText("X");
				b9.setEnabled(false);
				message.setText("Player1 your turn...");
				message.setFont(new Font("Tahoma", Font.BOLD, 11));
				b9.setFont(new Font("Tahoma", Font.BOLD, 20));
				message.setForeground(Color.BLUE);
			}
			else
			{
				b9.setText("O");
				b9.setEnabled(false);
				message.setText("Player2 your turn...");
				message.setFont(new Font("Tahoma", Font.BOLD, 11));
				b9.setFont(new Font("Tahoma", Font.BOLD, 20));
				message.setForeground(Color.RED);
			}
			Winning();
		}if(iu.getSource().equals(clr)) {
				b1.setText("");
				b1.setEnabled(true);
				b1.setBackground(new Color(128, 128, 128));
				
				b4.setText("");
				b4.setEnabled(true);
				b4.setBackground(new Color(128, 128, 128));
				
				b7.setText("");
				b7.setEnabled(true);
				b7.setBackground(new Color(128, 128, 128));
				
				b2.setText("");
				b2.setEnabled(true);
				b2.setBackground(new Color(128, 128, 128));
				
				b5.setText("");
				b5.setEnabled(true);
				b5.setBackground(new Color(128, 128, 128));
				
				b8.setText("");
				b8.setEnabled(true);
				b8.setBackground(new Color(128, 128, 128));
				
				b3.setText("");
				b3.setEnabled(true);
				b3.setBackground(new Color(128, 128, 128));
				
				b6.setText("");
				b6.setEnabled(true);
				b6.setBackground(new Color(128, 128, 128));
				
				b9.setText("");
				b9.setEnabled(true);
				b9.setBackground(new Color(128, 128, 128));
				
				message.setText("");
		}
	}
	private void Winning() {
		
		//for player 1
		if(b1.getText().equals("O") && b4.getText().equals("O") && b7.getText().equals("O")) {
			score1++;
			s1.setText(String.valueOf(score1));
			player1(b1, b4, b7);
			System.out.println("Success");
		}
		else if(b2.getText().equals("O") && b5.getText().equals("O") && b8.getText().equals("O")) {
			score1++;
			s1.setText(String.valueOf(score1));
			player1(b2, b5, b8);
			System.out.println("Success");
		}
		else if(b3.getText().equals("O") && b6.getText().equals("O") && b9.getText().equals("O")) {
			score1++;
			s1.setText(String.valueOf(score1));
			player1(b3, b6, b9);
			System.out.println("Success");
		}
		else if(b1.getText().equals("O") && b5.getText().equals("O") && b9.getText().equals("O")) {
			score1++;
			s1.setText(String.valueOf(score1));
			player1(b1, b5, b9);
			System.out.println("Success");
		}
		else if(b3.getText().equals("O") && b5.getText().equals("O") && b7.getText().equals("O")) {
			score1++;
			s1.setText(String.valueOf(score1));
			player1(b3, b5, b7);
			System.out.println("Success");
		}
		else if(b1.getText().equals("O") && b2.getText().equals("O") && b3.getText().equals("O")) {
			score1++;
			s1.setText(String.valueOf(score1));
			player1(b1, b2, b3);
			System.out.println("Success");
		}
		else if(b4.getText().equals("O") && b5.getText().equals("O") && b6.getText().equals("O")) {
			score1++;
			s1.setText(String.valueOf(score1));
			player1(b4, b5, b6);
			System.out.println("Success");
		}
		else if(b7.getText().equals("O") && b8.getText().equals("O") && b9.getText().equals("O")) {
			score1++;
			s1.setText(String.valueOf(score1));
			player1(b7, b8, b9);
			System.out.println("Success");
		}
		
		//for player 2
				if(b1.getText().equals("X") && b4.getText().equals("X") && b7.getText().equals("X")) {
					score2++;
					s2.setText(String.valueOf(score2));
					player2(b1, b4, b7);
					System.out.println("Success");
				}
				else if(b2.getText().equals("X") && b5.getText().equals("X") && b8.getText().equals("X")) {
					score2++;
					s2.setText(String.valueOf(score2));
					player2(b2, b5, b8);
					System.out.println("Success");
				}
				else if(b3.getText().equals("X") && b6.getText().equals("X") && b9.getText().equals("X")) {
					score2++;
					s2.setText(String.valueOf(score2));
					player2(b3, b6, b9);
					System.out.println("Success");
				}
				else if(b1.getText().equals("X") && b5.getText().equals("X") && b9.getText().equals("X")) {
					score2++;
					s2.setText(String.valueOf(score2));
					player2(b1, b5, b9);
					System.out.println("Success");
				}
				else if(b3.getText().equals("X") && b5.getText().equals("X") && b7.getText().equals("X")) {
					score2++;
					s2.setText(String.valueOf(score2));
					player2(b3, b5, b7);
					System.out.println("Success");
				}
				else if(b1.getText().equals("X") && b2.getText().equals("X") && b3.getText().equals("X")) {
					score2++;
					s2.setText(String.valueOf(score2));
					player2(b1, b2, b3);
					System.out.println("Success");
				}
				else if(b4.getText().equals("X") && b5.getText().equals("X") && b6.getText().equals("X")) {
					score2++;
					s2.setText(String.valueOf(score2));
					player2(b4, b5, b6);
					System.out.println("Success");
				}
				else if(b7.getText().equals("X") && b8.getText().equals("X") && b9.getText().equals("X")) {
					score2++;
					s2.setText(String.valueOf(score2));
					player2(b7, b8, b9);
					System.out.println("Success");
				}
	}
	private void player1(JButton a, JButton b, JButton c) {	
		a.setBackground(Color.BLUE);
		b.setBackground(Color.BLUE);
		c.setBackground(Color.BLUE);
		JOptionPane.showMessageDialog(null, "player1 is won!","TicTacTue", JOptionPane.INFORMATION_MESSAGE);
		System.out.println("TRUE");
	}
	private void player2(JButton a, JButton b, JButton c) {
		a.setBackground(Color.RED);
		b.setBackground(Color.RED);
		c.setBackground(Color.RED);
		JOptionPane.showMessageDialog(null, "player2 is won!","TicTacTue", JOptionPane.INFORMATION_MESSAGE);
		System.out.println("TRUE");
	}
}


public class TicTactoe {

	public static void main(String[] args) {
		 new TicTactue();
	}

}