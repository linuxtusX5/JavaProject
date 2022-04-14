package apps;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Project_v1 extends JFrame {
	private JTextField t1;
	private JPasswordField p1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Project_v1 frame = new Project_v1();
					frame.setVisible(true);
					frame.setLocation(350, 200);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private int tries = 3; 

	/**
	 * Create the frame.
	 */
	public Project_v1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 709, 395);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		
		JPanel panel =  new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBounds(201, 11, 287, 52);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 11, 267, 30);
		panel.add(panel_2);
		panel_2.setBackground(Color.WHITE);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("pizzeria express");
		lblNewLabel_3.setBounds(22, 0, 246, 26);
		panel_2.add(lblNewLabel_3);
		lblNewLabel_3.setBackground(Color.ORANGE);
		lblNewLabel_3.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_3.setForeground(Color.ORANGE);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.ORANGE);
		panel_1.setBounds(174, 64, 335, 270);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(10, 11, 311, 248);
		panel_1.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel l3 = new JLabel("");
		l3.setFont(new Font("Tahoma", Font.BOLD, 11));
		l3.setForeground(Color.RED);
		l3.setBounds(28, 205, 255, 14);
		panel_1_1.add(l3);
		
		p1 = new JPasswordField();
		p1.setBounds(100, 100, 183, 23);
		panel_1_1.add(p1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password  :");
		lblNewLabel_1_1.setBounds(28, 101, 78, 17);
		lblNewLabel_1_1.setForeground(Color.ORANGE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1.setBackground(Color.BLACK);
		panel_1_1.add(lblNewLabel_1_1);
		
		JButton b1 = new JButton("Login");
		b1.setBounds(124, 170, 78, 23);
		b1.setFont(new Font("Tahoma", Font.BOLD, 13));
		b1.setForeground(Color.ORANGE);
		panel_1_1.add(b1);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent iu) {
				String name = t1.getText();
				@SuppressWarnings("deprecation")
				String pass = p1.getText();
				
				if(iu.getSource().equals(b1)) {
					
					if(name.equals("DICT-2") && pass.equals("12345")) {
						dispose();
						new Project_v3().setVisible(true);
					}else if(!name.equals(null) && !pass.equals(null)) {
						tries--;
						l3.setText("Invalid username or password "+ tries +" more tries.");
						if(tries==0) {
							l3.setText("Invalid username or password "+ tries +" more tries.");
							t1.setText(null);
							t1.setEnabled(false);
							p1.setText(null);
							p1.setEnabled(false);
							JOptionPane.showMessageDialog(null, "account locked", "Alert!", JOptionPane.ERROR_MESSAGE);
							b1.setEnabled(false);
							l3.setText("contact to administrator.");
						}
					}
				}
			}
		});
		b1.setBackground(Color.WHITE);
		b1.setFocusable(false);
		
		JLabel lblNewLabel_1 = new JLabel("Username :");
		lblNewLabel_1.setBounds(28, 72, 78, 17);
		panel_1_1.add(lblNewLabel_1);
		lblNewLabel_1.setBackground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setForeground(Color.ORANGE);
		
		t1 = new JTextField();
		t1.setBounds(100, 69, 183, 23);
		panel_1_1.add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(10, 11, 289, 226);
		lblNewLabel_2.setIcon(new ImageIcon(Project_v1.class.getResource("/apps/img2/Annotation 2021-07-18 140758.jpg")));
		panel_1_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Project_v1.class.getResource("/apps/img2/Annotation 2021-07-18 141012.jpg")));
		lblNewLabel.setBounds(10, 0, 673, 345);
		getContentPane().add(lblNewLabel);
	}
}
