package apps;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Project_v3 extends JFrame{

	// JFrame frame;
	 ButtonGroup buttonGroup = new ButtonGroup();
	 ButtonGroup buttonGroup_1 = new ButtonGroup();
	 ButtonGroup buttonGroup_2 = new ButtonGroup();
	 ButtonGroup buttonGroup_3 = new ButtonGroup();

	// ButtonGroup menu;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Project_v3 frame = new Project_v3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	private float rmeat1 = 0, rmeat2 = 0,rmeat3 = 0,
	rmeat4 = 0, cm1 = 0, cm2 = 0, cm3 = 0, 
	cm4 = 0, cm5 = 0, cm6 = 0, rr1 = 0,
	rr3 = 0, crust1 = 0, crust2 = 0, crust3 = 0,
	crust4 = 0, crust5 = 0, saucy1 = 0, saucy2 = 0,
	saucy3 = 0, cv1 = 0, cv2 = 0, cv3 = 0, cv4 = 0,
	cv5 = 0, cv6 = 0, cv7 = 0, cv8 = 0;
	
	private float total = 0;
	
	
	JRadioButton r1, r2, r3, r4,
	r1_1, r2_1, r3_1,r1_2, r2_2, r3_2,
	r4_1, r5, r1_3, r2_3, r3_3, r4_2;
	JLabel size, cheesy, crust, saucy,
	 meat11;
	JPanel panelsize, meat1, meat22, 
	meat33, meat44, meat55, meat66,
	veg11, veg22, veg33, veg44, veg55,
	veg66, veg77, veg88;
	JCheckBox m1, m2, m3, m4, m5, m6,
	v1, v2, v3, v4, v5, v6, v7, v8;
	JButton btnNewButton_2, btnNewButton_1, 
	btnNewButton;
	
	/**
	 * Initialize the contents of the frame.
	 */
	public Project_v3() {
		getContentPane().setBackground(Color.ORANGE);
		setBounds(10, 10, 1347, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JPanel panel_1_2_1 = new JPanel();
		panel_1_2_1.setBounds(708, 352, 339, 298);
		getContentPane().add(panel_1_2_1);
		panel_1_2_1.setBackground(Color.ORANGE);
		panel_1_2_1.setLayout(null);
		
		JLabel lblNewLabel_9_1 = new JLabel("Jalapeno  Php 20");
		lblNewLabel_9_1.setForeground(Color.YELLOW);
		lblNewLabel_9_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_9_1.setBounds(51, 250, 157, 14);
		panel_1_2_1.add(lblNewLabel_9_1);
		
		v8 = new JCheckBox("");
		v8.setEnabled(false);
		v8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_2.setEnabled(true);
				if(v8.isSelected()) {
					veg88.setBackground(Color.GREEN);
				}if(v8.isSelected()==false) {
					veg88.setBackground(Color.white);
				}
			}
		});
		v8.setForeground(Color.ORANGE);
		v8.setBackground(Color.LIGHT_GRAY);
		v8.setBounds(249, 247, 26, 23);
		panel_1_2_1.add(v8);
		
		JLabel lblNewLabel_8 = new JLabel("Spinach  Php 20");
		lblNewLabel_8.setForeground(Color.YELLOW);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_8.setBounds(51, 226, 157, 14);
		panel_1_2_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_2_6 = new JLabel("Tomatoes  Php 10");
		lblNewLabel_2_6.setForeground(Color.YELLOW);
		lblNewLabel_2_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_6.setBounds(51, 76, 115, 14);
		panel_1_2_1.add(lblNewLabel_2_6);
		
		JLabel lblNewLabel_4_5 = new JLabel("Olives  Php 10");
		lblNewLabel_4_5.setForeground(Color.YELLOW);
		lblNewLabel_4_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4_5.setBounds(51, 126, 115, 14);
		panel_1_2_1.add(lblNewLabel_4_5);
		
		v1 = new JCheckBox("");
		v1.setEnabled(false);
		v1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_2.setEnabled(true);
				if(v1.isSelected()) {
					veg11.setBackground(Color.GREEN);
				}if(v1.isSelected()==false) {
					veg11.setBackground(Color.white);
				}
			}
		});
		v1.setBackground(Color.LIGHT_GRAY);
		v1.setBounds(249, 72, 26, 23);
		panel_1_2_1.add(v1);
		
		v4 = new JCheckBox("");
		v4.setEnabled(false);
		v4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_2.setEnabled(true);
				if(v4.isSelected()) {
					veg44.setBackground(Color.GREEN);
				}if(v4.isSelected()==false) {
					veg44.setBackground(Color.white);
				}
			}
		});
		v4.setBackground(Color.LIGHT_GRAY);
		v4.setBounds(249, 148, 26, 23);
		panel_1_2_1.add(v4);
		
		v3 = new JCheckBox("");
		v3.setEnabled(false);
		v3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_2.setEnabled(true);
				if(v3.isSelected()) {
					veg33.setBackground(Color.GREEN);
				}if(v3.isSelected()==false) {
					veg33.setBackground(Color.white);
				}
			}
		});
		v3.setBackground(Color.LIGHT_GRAY);
		v3.setBounds(249, 123, 26, 23);
		panel_1_2_1.add(v3);
		
		JLabel lblNewLabel_5_6 = new JLabel("Green Peppers  Php 10");
		lblNewLabel_5_6.setForeground(Color.YELLOW);
		lblNewLabel_5_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5_6.setBounds(51, 151, 157, 14);
		panel_1_2_1.add(lblNewLabel_5_6);
		
		v7 = new JCheckBox("");
		v7.setEnabled(false);
		v7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_2.setEnabled(true);
				if(v7.isSelected()) {
					veg77.setBackground(Color.GREEN);
				}if(v7.isSelected()==false) {
					veg77.setBackground(Color.white);
				}
			}
		});
		v7.setBackground(Color.LIGHT_GRAY);
		v7.setBounds(249, 223, 26, 23);
		panel_1_2_1.add(v7);
		
		JLabel lblNewLabel_6_4 = new JLabel("Mushrooms  Php 20");
		lblNewLabel_6_4.setForeground(Color.YELLOW);
		lblNewLabel_6_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6_4.setBounds(51, 176, 157, 14);
		panel_1_2_1.add(lblNewLabel_6_4);
		
		JLabel lblNewLabel_7_2 = new JLabel("Pineapple  Php 20");
		lblNewLabel_7_2.setForeground(Color.YELLOW);
		lblNewLabel_7_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_7_2.setBounds(51, 201, 157, 14);
		panel_1_2_1.add(lblNewLabel_7_2);
		
		JLabel lblNewLabel_3_5 = new JLabel("Onions  Php 10");
		lblNewLabel_3_5.setForeground(Color.YELLOW);
		lblNewLabel_3_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_5.setBounds(51, 101, 115, 14);
		panel_1_2_1.add(lblNewLabel_3_5);
		
		v5 = new JCheckBox("");
		v5.setEnabled(false);
		v5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_2.setEnabled(true);
				if(v5.isSelected()) {
					veg55.setBackground(Color.GREEN);
				}if(v5.isSelected()==false) {
					veg55.setBackground(Color.white);
				}
			}
		});
		v5.setBackground(Color.LIGHT_GRAY);
		v5.setBounds(249, 173, 26, 23);
		panel_1_2_1.add(v5);
		
		v2 = new JCheckBox("");
		v2.setEnabled(false);
		v2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_2.setEnabled(true);
				if(v2.isSelected()) {
					veg22.setBackground(Color.GREEN);
				}if(v2.isSelected()==false) {
					veg22.setBackground(Color.white);
				}
			}
		});
		v2.setBackground(Color.LIGHT_GRAY);
		v2.setBounds(249, 98, 26, 23);
		panel_1_2_1.add(v2);
		
		v6 = new JCheckBox("");
		v6.setEnabled(false);
		v6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_2.setEnabled(true);
				if(v6.isSelected()) {
					veg66.setBackground(Color.GREEN);
				}if(v6.isSelected()==false) {
					veg66.setBackground(Color.white);
				}
			}
		});
		v6.setBackground(Color.LIGHT_GRAY);
		v6.setBounds(249, 198, 26, 23);
		panel_1_2_1.add(v6);
		
		JPanel panel_2_5 = new JPanel();
		panel_2_5.setLayout(null);
		panel_2_5.setBackground(Color.ORANGE);
		panel_2_5.setBounds(10, 11, 329, 52);
		panel_1_2_1.add(panel_2_5);
		
		JPanel panel_3_4 = new JPanel();
		panel_3_4.setLayout(null);
		panel_3_4.setBounds(10, 11, 309, 30);
		panel_2_5.add(panel_3_4);
		
		JLabel lblNewLabel_1_4 = new JLabel("Always eat your veggies");
		lblNewLabel_1_4.setForeground(Color.ORANGE);
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_4.setBounds(20, 0, 289, 30);
		panel_3_4.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(10, 11, 319, 276);
		panel_1_2_1.add(lblNewLabel_5);
		lblNewLabel_5.setIcon(new ImageIcon(Project_v3.class.getResource("/apps/img2/Annotation 2021-07-18 140758.jpg")));
		
		JLabel lblNewLabel_9 = new JLabel("Jalapeno  Php 20");
		lblNewLabel_9.setForeground(Color.YELLOW);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_9.setBounds(51, 251, 157, 14);
		panel_1_2_1.add(lblNewLabel_9);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBackground(Color.ORANGE);
		panel_1_1_1.setBounds(359, 352, 339, 298);
		getContentPane().add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		
		r3_3 = new JRadioButton("");
		r3_3.setEnabled(false);
		r3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				v1.setEnabled(true);
				v1.setBackground(Color.ORANGE);

				v2.setEnabled(true);
				v2.setBackground(Color.ORANGE);

				v3.setEnabled(true);
				v3.setBackground(Color.ORANGE);

				v4.setEnabled(true);
				v4.setBackground(Color.ORANGE);

				v5.setEnabled(true);
				v5.setBackground(Color.ORANGE);

				v6.setEnabled(true);
				v6.setBackground(Color.ORANGE);

				v7.setEnabled(true);
				v7.setBackground(Color.ORANGE);

				v8.setEnabled(true);
				v8.setBackground(Color.ORANGE);
				
				if(r3_3.isSelected()==true) {
					saucy.setText("Barbeque sauce Php 10");
				}
				
			}
		});
		buttonGroup_2.add(r3_3);
		r3_3.setBackground(Color.LIGHT_GRAY);
		r3_3.setBounds(281, 163, 21, 23);
		panel_1_1_1.add(r3_3);
		
		JLabel lblNewLabel_4_4 = new JLabel("Barbeque sauce  Php 10");
		lblNewLabel_4_4.setForeground(Color.YELLOW);
		lblNewLabel_4_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_4.setBackground(Color.ORANGE);
		lblNewLabel_4_4.setBounds(52, 172, 223, 14);
		panel_1_1_1.add(lblNewLabel_4_4);
		
		r4_2 = new JRadioButton("");
		r4_2.setEnabled(false);
		r4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				v1.setEnabled(true);
				v1.setBackground(Color.ORANGE);

				v2.setEnabled(true);
				v2.setBackground(Color.ORANGE);

				v3.setEnabled(true);
				v3.setBackground(Color.ORANGE);

				v4.setEnabled(true);
				v4.setBackground(Color.ORANGE);

				v5.setEnabled(true);
				v5.setBackground(Color.ORANGE);

				v6.setEnabled(true);
				v6.setBackground(Color.ORANGE);

				v7.setEnabled(true);
				v7.setBackground(Color.ORANGE);

				v8.setEnabled(true);
				v8.setBackground(Color.ORANGE);
				
				if(r4_2.isSelected()==true) {
					saucy.setText("No Sauce");
				}
				
			}
		});
		buttonGroup_2.add(r4_2);
		r4_2.setBackground(Color.LIGHT_GRAY);
		r4_2.setBounds(281, 188, 21, 23);
		panel_1_1_1.add(r4_2);
		
		JLabel lblNewLabel_5_5 = new JLabel("No Sauce");
		lblNewLabel_5_5.setForeground(Color.YELLOW);
		lblNewLabel_5_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5_5.setBackground(Color.ORANGE);
		lblNewLabel_5_5.setBounds(52, 197, 119, 14);
		panel_1_1_1.add(lblNewLabel_5_5);
		
		r2_3 = new JRadioButton("");
		r2_3.setEnabled(false);
		r2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				v1.setEnabled(true);
				v1.setBackground(Color.ORANGE);

				v2.setEnabled(true);
				v2.setBackground(Color.ORANGE);

				v3.setEnabled(true);
				v3.setBackground(Color.ORANGE);

				v4.setEnabled(true);
				v4.setBackground(Color.ORANGE);

				v5.setEnabled(true);
				v5.setBackground(Color.ORANGE);

				v6.setEnabled(true);
				v6.setBackground(Color.ORANGE);

				v7.setEnabled(true);
				v7.setBackground(Color.ORANGE);

				v8.setEnabled(true);
				v8.setBackground(Color.ORANGE);
				
				if(r2_3.isSelected()==true) {
					saucy.setText("White sauce Php 10");
				}
				
			}
		});
		buttonGroup_2.add(r2_3);
		r2_3.setBackground(Color.LIGHT_GRAY);
		r2_3.setBounds(281, 137, 21, 23);
		panel_1_1_1.add(r2_3);
		
		JLabel lblNewLabel_2_5 = new JLabel("Marinara sauce  Php 10");
		lblNewLabel_2_5.setForeground(Color.YELLOW);
		lblNewLabel_2_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_5.setBackground(Color.ORANGE);
		lblNewLabel_2_5.setBounds(52, 122, 223, 14);
		panel_1_1_1.add(lblNewLabel_2_5);
		
		JLabel White_sauce = new JLabel("White sauce  Php 10");
		White_sauce.setForeground(Color.YELLOW);
		White_sauce.setFont(new Font("Tahoma", Font.BOLD, 15));
		White_sauce.setBackground(Color.ORANGE);
		White_sauce.setBounds(52, 147, 223, 14);
		panel_1_1_1.add(White_sauce);
		
		r1_3 = new JRadioButton("");
		r1_3.setEnabled(false);
		r1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				v1.setEnabled(true);
				v1.setBackground(Color.ORANGE);

				v2.setEnabled(true);
				v2.setBackground(Color.ORANGE);

				v3.setEnabled(true);
				v3.setBackground(Color.ORANGE);

				v4.setEnabled(true);
				v4.setBackground(Color.ORANGE);

				v5.setEnabled(true);
				v5.setBackground(Color.ORANGE);

				v6.setEnabled(true);
				v6.setBackground(Color.ORANGE);

				v7.setEnabled(true);
				v7.setBackground(Color.ORANGE);

				v8.setEnabled(true);
				v8.setBackground(Color.ORANGE);
				
				if(r1_3.isSelected()==true) {
					saucy.setText("Marinara sauce Php 10");
				}
			}
		});
		buttonGroup_2.add(r1_3);
		r1_3.setBackground(Color.LIGHT_GRAY);
		r1_3.setBounds(281, 112, 21, 23);
		panel_1_1_1.add(r1_3);
		
		JPanel panel_2_4 = new JPanel();
		panel_2_4.setLayout(null);
		panel_2_4.setBackground(Color.ORANGE);
		panel_2_4.setBounds(10, 11, 319, 47);
		panel_1_1_1.add(panel_2_4);
		
		JPanel panel_3_3 = new JPanel();
		panel_3_3.setLayout(null);
		panel_3_3.setBounds(10, 11, 313, 25);
		panel_2_4.add(panel_3_3);
		
		JLabel lblNewLabel_1_3 = new JLabel("Our pizzas are saucy");
		lblNewLabel_1_3.setForeground(Color.ORANGE);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_3.setBounds(43, 0, 225, 25);
		panel_3_3.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(10, 11, 319, 276);
		panel_1_1_1.add(lblNewLabel_6);
		lblNewLabel_6.setIcon(new ImageIcon(Project_v3.class.getResource("/apps/img2/Annotation 2021-07-18 140758.jpg")));
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setBackground(Color.ORANGE);
		panel_1_3.setBounds(10, 352, 339, 298);
		getContentPane().add(panel_1_3);
		panel_1_3.setLayout(null);
		
		JLabel lblNewLabel_4_3 = new JLabel("Cheese Crust  Php 20");
		lblNewLabel_4_3.setForeground(Color.YELLOW);
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_3.setBounds(20, 157, 262, 14);
		panel_1_3.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("Garlic Butter Crust  Php 20");
		lblNewLabel_3_4.setForeground(Color.YELLOW);
		lblNewLabel_3_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_4.setBounds(20, 132, 262, 14);
		panel_1_3.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_2_4 = new JLabel("Plain Crust  Php 10");
		lblNewLabel_2_4.setForeground(Color.YELLOW);
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_4.setBounds(20, 107, 155, 14);
		panel_1_3.add(lblNewLabel_2_4);
		
		r4_1 = new JRadioButton("");
		r4_1.setEnabled(false);
		r4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				r1_3.setEnabled(true);
				r1_3.setBackground(Color.ORANGE);
				
				r2_3.setEnabled(true);
				r2_3.setBackground(Color.ORANGE);
				
				r3_3.setEnabled(true);
				r3_3.setBackground(Color.ORANGE);
				
				r4_2.setEnabled(true);
				r4_2.setBackground(Color.ORANGE);
				
				if(r4_1.isSelected()==true) {
					crust.setText("Spicy Crust Php 20");
				}
				
			}
		});
		buttonGroup_1.add(r4_1);
		r4_1.setBackground(Color.LIGHT_GRAY);
		r4_1.setBounds(288, 173, 27, 23);
		panel_1_3.add(r4_1);
		
		r3_2 = new JRadioButton("");
		r3_2.setEnabled(false);
		r3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				r1_3.setEnabled(true);
				r1_3.setBackground(Color.ORANGE);
				
				r2_3.setEnabled(true);
				r2_3.setBackground(Color.ORANGE);
				
				r3_3.setEnabled(true);
				r3_3.setBackground(Color.ORANGE);
				
				r4_2.setEnabled(true);
				r4_2.setBackground(Color.ORANGE);
				
				if(r3_2.isSelected()==true) {
					crust.setText("Cheese Crust Php 20");
				}
				
			}
		});
		buttonGroup_1.add(r3_2);
		r3_2.setBackground(Color.LIGHT_GRAY);
		r3_2.setBounds(288, 148, 27, 23);
		panel_1_3.add(r3_2);
		
		r1_2 = new JRadioButton("");
		r1_2.setEnabled(false);
		r1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				r1_3.setEnabled(true);
				r1_3.setBackground(Color.ORANGE);
				
				r2_3.setEnabled(true);
				r2_3.setBackground(Color.ORANGE);
				
				r3_3.setEnabled(true);
				r3_3.setBackground(Color.ORANGE);
				
				r4_2.setEnabled(true);
				r4_2.setBackground(Color.ORANGE);
				
				if(r1_2.isSelected()==true) {
					crust.setText("Plain Crust Php 10");
				}
			}
		});
		buttonGroup_1.add(r1_2);
		r1_2.setBackground(Color.LIGHT_GRAY);
		r1_2.setBounds(288, 97, 27, 23);
		panel_1_3.add(r1_2);
		
		r2_2 = new JRadioButton("");
		r2_2.setEnabled(false);
		r2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				r1_3.setEnabled(true);
				r1_3.setBackground(Color.ORANGE);
				
				r2_3.setEnabled(true);
				r2_3.setBackground(Color.ORANGE);
				
				r3_3.setEnabled(true);
				r3_3.setBackground(Color.ORANGE);
				
				r4_2.setEnabled(true);
				r4_2.setBackground(Color.ORANGE);
				
				if(r2_2.isSelected()==true) {
					crust.setText("Garlic Butter Crust Php 20");
				}
			}
		});
		buttonGroup_1.add(r2_2);
		r2_2.setBackground(Color.LIGHT_GRAY);
		r2_2.setBounds(288, 123, 27, 23);
		panel_1_3.add(r2_2);
		
		r5 = new JRadioButton("");
		r5.setEnabled(false);
		r5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				r1_3.setEnabled(true);
				r1_3.setBackground(Color.ORANGE);
				
				r2_3.setEnabled(true);
				r2_3.setBackground(Color.ORANGE);
				
				r3_3.setEnabled(true);
				r3_3.setBackground(Color.ORANGE);
				
				r4_2.setEnabled(true);
				r4_2.setBackground(Color.ORANGE);
				
				if(r5.isSelected()==true) {
					crust.setText("House Special Crust Php 30");
				}
				
			}
		});
		buttonGroup_1.add(r5);
		r5.setBackground(Color.LIGHT_GRAY);
		r5.setBounds(288, 198, 27, 23);
		panel_1_3.add(r5);
		
		JLabel lblNewLabel_6_3 = new JLabel("House Special Crust  Php 30");
		lblNewLabel_6_3.setForeground(Color.YELLOW);
		lblNewLabel_6_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6_3.setBounds(20, 207, 262, 14);
		panel_1_3.add(lblNewLabel_6_3);
		
		JLabel lblNewLabel_5_4 = new JLabel("Spicy Crust  Php 20");
		lblNewLabel_5_4.setForeground(Color.YELLOW);
		lblNewLabel_5_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5_4.setBounds(20, 182, 262, 14);
		panel_1_3.add(lblNewLabel_5_4);
		
		JPanel panel_2_3 = new JPanel();
		panel_2_3.setLayout(null);
		panel_2_3.setBackground(Color.ORANGE);
		panel_2_3.setBounds(10, 11, 319, 47);
		panel_1_3.add(panel_2_3);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setLayout(null);
		panel_3_2.setBounds(10, 11, 327, 25);
		panel_2_3.add(panel_3_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("Everyone bites the crust");
		lblNewLabel_1_2.setForeground(Color.ORANGE);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(39, 0, 256, 25);
		panel_3_2.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Project_v3.class.getResource("/apps/img2/Annotation 2021-07-18 140758.jpg")));
		lblNewLabel_4.setBounds(10, 11, 319, 276);
		panel_1_3.add(lblNewLabel_4);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(Color.ORANGE);
		panel_1_2.setBounds(708, 11, 339, 298);
		getContentPane().add(panel_1_2);
		panel_1_2.setLayout(null);
		
		JLabel lblNewLabel_5_3 = new JLabel("Extra Cheese  Php 30");
		lblNewLabel_5_3.setForeground(Color.YELLOW);
		lblNewLabel_5_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5_3.setBounds(58, 194, 192, 28);
		panel_1_2.add(lblNewLabel_5_3);
		
		JLabel lblNewLabel_3_3 = new JLabel("Regular  Php 20");
		lblNewLabel_3_3.setForeground(Color.YELLOW);
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_3.setBounds(58, 121, 121, 28);
		panel_1_2.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_4_2 = new JLabel("No cheese");
		lblNewLabel_4_2.setForeground(Color.YELLOW);
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_2.setBounds(58, 160, 121, 28);
		panel_1_2.add(lblNewLabel_4_2);
		
		r3_1 = new JRadioButton("");
		r3_1.setEnabled(false);
		r3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				r1_2.setEnabled(true);
				r1_2.setBackground(Color.ORANGE);

				r2_2.setEnabled(true);
				r2_2.setBackground(Color.ORANGE);

				r3_2.setEnabled(true);
				r3_2.setBackground(Color.ORANGE);

				r4_1.setEnabled(true);
				r4_1.setBackground(Color.ORANGE);

				r5.setEnabled(true);
				r5.setBackground(Color.ORANGE);
				
				if(r3_1.isSelected()==true) {
					cheesy.setText("Extra Cheese Php 30");
				}
			}
		});
		buttonGroup_3.add(r3_1);
		r3_1.setBackground(Color.LIGHT_GRAY);
		r3_1.setBounds(256, 199, 21, 23);
		panel_1_2.add(r3_1);
		
		r2_1 = new JRadioButton("");
		r2_1.setEnabled(false);
		r2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				r1_2.setEnabled(true);
				r1_2.setBackground(Color.ORANGE);

				r2_2.setEnabled(true);
				r2_2.setBackground(Color.ORANGE);

				r3_2.setEnabled(true);
				r3_2.setBackground(Color.ORANGE);

				r4_1.setEnabled(true);
				r4_1.setBackground(Color.ORANGE);

				r5.setEnabled(true);
				r5.setBackground(Color.ORANGE);
				
				if(r2_1.isSelected()==true) {
					cheesy.setText("No cheese");
				}
			}
		});
		buttonGroup_3.add(r2_1);
		r2_1.setBackground(Color.LIGHT_GRAY);
		r2_1.setBounds(256, 165, 21, 23);
		panel_1_2.add(r2_1);
		
		r1_1 = new JRadioButton("");
		r1_1.setEnabled(false);
		r1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				r1_2.setEnabled(true);
				r1_2.setBackground(Color.ORANGE);

				r2_2.setEnabled(true);
				r2_2.setBackground(Color.ORANGE);

				r3_2.setEnabled(true);
				r3_2.setBackground(Color.ORANGE);

				r4_1.setEnabled(true);
				r4_1.setBackground(Color.ORANGE);

				r5.setEnabled(true);
				r5.setBackground(Color.ORANGE);
				
				if(r1_1.isSelected()==true) {
					cheesy.setText("Regular Php 20");
				}
			}
		});
		buttonGroup_3.add(r1_1);
		r1_1.setBackground(Color.LIGHT_GRAY);
		r1_1.setBounds(256, 126, 21, 23);
		panel_1_2.add(r1_1);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setLayout(null);
		panel_2_2.setBackground(Color.ORANGE);
		panel_2_2.setBounds(10, 11, 319, 52);
		panel_1_2.add(panel_2_2);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setLayout(null);
		panel_3_1.setBounds(10, 11, 306, 30);
		panel_2_2.add(panel_3_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("How cheesy are you?");
		lblNewLabel_2_1.setForeground(Color.ORANGE);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(35, 0, 244, 25);
		panel_3_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Project_v3.class.getResource("/apps/img2/Annotation 2021-07-18 140758.jpg")));
		lblNewLabel_3.setBounds(10, 11, 319, 276);
		panel_1_2.add(lblNewLabel_3);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.ORANGE);
		panel_1_1.setBounds(359, 11, 339, 298);
		getContentPane().add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel lblNewLabel_5_2 = new JLabel("Ground Beef  Php 20");
		lblNewLabel_5_2.setForeground(Color.YELLOW);
		lblNewLabel_5_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5_2.setBounds(41, 182, 190, 29);
		panel_1_1.add(lblNewLabel_5_2);
		
		m5 = new JCheckBox("");
		m5.setEnabled(false);
		m5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				r1_1.setEnabled(true);
				r1_1.setBackground(Color.ORANGE);
				
				r2_1.setEnabled(true);
				r2_1.setBackground(Color.ORANGE);
				
				r3_1.setEnabled(true);
				r3_1.setBackground(Color.ORANGE);
				
				if(m5.isSelected()) {
					meat55.setBackground(Color.GREEN);
				}if(m5.isSelected()==false) {
					meat55.setBackground(Color.white);
				}
			}
		});
		m5.setForeground(Color.ORANGE);
		m5.setBackground(Color.LIGHT_GRAY);
		m5.setBounds(272, 222, 21, 23);
		panel_1_1.add(m5);
		
		m4 = new JCheckBox("");
		m4.setEnabled(false);
		m4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				r1_1.setEnabled(true);
				r1_1.setBackground(Color.ORANGE);
				
				r2_1.setEnabled(true);
				r2_1.setBackground(Color.ORANGE);
				
				r3_1.setEnabled(true);
				r3_1.setBackground(Color.ORANGE);
				
				if(m4.isSelected()) {
					meat44.setBackground(Color.GREEN);
				}if(m4.isSelected()==false) {
					meat44.setBackground(Color.white);
				}
			}
		});
		m4.setForeground(Color.ORANGE);
		m4.setBackground(Color.LIGHT_GRAY);
		m4.setBounds(272, 182, 21, 23);
		panel_1_1.add(m4);
		
		JLabel lblNewLabel_7_1 = new JLabel("Chicken  Php 20");
		lblNewLabel_7_1.setForeground(Color.YELLOW);
		lblNewLabel_7_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_7_1.setBounds(41, 252, 190, 23);
		panel_1_1.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_2_3 = new JLabel("Pepperoni  Php 10");
		lblNewLabel_2_3.setForeground(Color.YELLOW);
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_3.setBounds(41, 72, 190, 23);
		panel_1_1.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_3_2 = new JLabel("Sausage  Php 10");
		lblNewLabel_3_2.setForeground(Color.YELLOW);
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_2.setBounds(41, 106, 190, 27);
		panel_1_1.add(lblNewLabel_3_2);
		
		m3 = new JCheckBox("");
		m3.setEnabled(false);
		m3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				r1_1.setEnabled(true);
				r1_1.setBackground(Color.ORANGE);
				
				r2_1.setEnabled(true);
				r2_1.setBackground(Color.ORANGE);
				
				r3_1.setEnabled(true);
				r3_1.setBackground(Color.ORANGE);
				
				if(m3.isSelected()) {
					meat33.setBackground(Color.GREEN);
				}if(m3.isSelected()==false) {
					meat33.setBackground(Color.white);
				}
			}
		});
		m3.setForeground(Color.ORANGE);
		m3.setBackground(Color.LIGHT_GRAY);
		m3.setBounds(272, 144, 21, 23);
		panel_1_1.add(m3);
		
		m2 = new JCheckBox("");
		m2.setEnabled(false);
		m2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				r1_1.setEnabled(true);
				r1_1.setBackground(Color.ORANGE);
				
				r2_1.setEnabled(true);
				r2_1.setBackground(Color.ORANGE);
				
				r3_1.setEnabled(true);
				r3_1.setBackground(Color.ORANGE);
				
				if(m2.isSelected()) {
					meat22.setBackground(Color.GREEN);
				}if(m2.isSelected()==false) {
					meat22.setBackground(Color.white);
				}
			}
		});
		m2.setForeground(Color.ORANGE);
		m2.setBackground(Color.LIGHT_GRAY);
		m2.setBounds(272, 106, 21, 23);
		panel_1_1.add(m2);
		
		JLabel lblNewLabel_4_1 = new JLabel("Bacon  Php 20");
		lblNewLabel_4_1.setForeground(Color.YELLOW);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_1.setBounds(41, 144, 190, 27);
		panel_1_1.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("Anchovy  Php 20");
		lblNewLabel_6_2.setForeground(Color.YELLOW);
		lblNewLabel_6_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6_2.setBounds(41, 222, 190, 23);
		panel_1_1.add(lblNewLabel_6_2);
		
		m6 = new JCheckBox("");
		m6.setEnabled(false);
		m6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				r1_1.setEnabled(true);
				r1_1.setBackground(Color.ORANGE);
				
				r2_1.setEnabled(true);
				r2_1.setBackground(Color.ORANGE);
				
				r3_1.setEnabled(true);
				r3_1.setBackground(Color.ORANGE);
				
				if(m6.isSelected()) {
					meat66.setBackground(Color.GREEN);
				}if(m6.isSelected()==false) {
					meat66.setBackground(Color.white);
				}
			}
		});
		m6.setForeground(Color.ORANGE);
		m6.setBackground(Color.LIGHT_GRAY);
		m6.setBounds(272, 252, 21, 23);
		panel_1_1.add(m6);
		
		m1 = new JCheckBox("");
		m1.setEnabled(false);
		m1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				r1_1.setEnabled(true);
				r1_1.setBackground(Color.ORANGE);
				
				r2_1.setEnabled(true);
				r2_1.setBackground(Color.ORANGE);
				
				r3_1.setEnabled(true);
				r3_1.setBackground(Color.ORANGE);
				
				if(m1.isSelected()) {
					meat1.setBackground(Color.GREEN);
				}if(m1.isSelected()==false) {
					meat1.setBackground(Color.white);
				}
			}
		});
		m1.setForeground(Color.ORANGE);
		m1.setBackground(Color.LIGHT_GRAY);
		m1.setBounds(272, 72, 21, 23);
		panel_1_1.add(m1);
		
		JPanel panel_1_4 = new JPanel();
		panel_1_4.setLayout(null);
		panel_1_4.setBackground(Color.ORANGE);
		panel_1_4.setBounds(10, 11, 319, 50);
		panel_1_1.add(panel_1_4);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBounds(10, 11, 329, 28);
		panel_1_4.add(panel_2_1);
		
		JLabel lblNewLabel_7 = new JLabel("Nice to meat you!");
		lblNewLabel_7.setForeground(Color.ORANGE);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_7.setBounds(60, 0, 190, 25);
		panel_2_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Project_v3.class.getResource("/apps/img2/Annotation 2021-07-18 140758.jpg")));
		lblNewLabel_2.setBounds(10, 11, 319, 276);
		panel_1_1.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.ORANGE);
		panel_1.setBounds(10, 11, 339, 298);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		r2 = new JRadioButton("");
		r2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(r2.isSelected()==true) {
					size.setText("Medium Php 40");
					m1.setEnabled(true);
					m1.setBackground(Color.ORANGE);
					
					m2.setEnabled(true);
					m2.setBackground(Color.ORANGE);
					
					m3.setEnabled(true);
					m3.setBackground(Color.ORANGE);
					
					m4.setEnabled(true);
					m4.setBackground(Color.ORANGE);
					
					m5.setEnabled(true);
					m5.setBackground(Color.ORANGE);
					
					m6.setEnabled(true);
					m6.setBackground(Color.ORANGE);
					
				}
			}
		});
		buttonGroup.add(r2);
		r2.setBackground(Color.ORANGE);
		r2.setBounds(237, 132, 21, 23);
		panel_1.add(r2);
		
		JLabel lblNewLabel_2_2 = new JLabel("Personal   Php 30");
		lblNewLabel_2_2.setForeground(Color.YELLOW);
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_2.setBounds(67, 99, 164, 22);
		panel_1.add(lblNewLabel_2_2);
		
		r4 = new JRadioButton("");
		r4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(r4.isSelected()==true) {
					size.setText("Extra Large Php 60");
					m1.setEnabled(true);
					m1.setBackground(Color.ORANGE);
					
					m2.setEnabled(true);
					m2.setBackground(Color.ORANGE);
					
					m3.setEnabled(true);
					m3.setBackground(Color.ORANGE);
					
					m4.setEnabled(true);
					m4.setBackground(Color.ORANGE);
					
					m5.setEnabled(true);
					m5.setBackground(Color.ORANGE);
					
					m6.setEnabled(true);
					m6.setBackground(Color.ORANGE);
					
				}
			}
		});
		buttonGroup.add(r4);
		r4.setBackground(Color.ORANGE);
		r4.setBounds(237, 203, 21, 23);
		panel_1.add(r4);
		
		r1 = new JRadioButton("");
		r1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(r1.isSelected()==true) {
					size.setText("Personal Php 30");
					m1.setEnabled(true);
					m1.setBackground(Color.ORANGE);
					
					m2.setEnabled(true);
					m2.setBackground(Color.ORANGE);
					
					m3.setEnabled(true);
					m3.setBackground(Color.ORANGE);
					
					m4.setEnabled(true);
					m4.setBackground(Color.ORANGE);
					
					m5.setEnabled(true);
					m5.setBackground(Color.ORANGE);
					
					m6.setEnabled(true);
					m6.setBackground(Color.ORANGE);
					
				}
			}
		});
		buttonGroup.add(r1);
		r1.setForeground(Color.BLACK);
		r1.setFont(new Font("Tahoma", Font.BOLD, 15));
		r1.setBackground(Color.ORANGE);
		r1.setBounds(237, 99, 21, 23);
		panel_1.add(r1);
		
		r3 = new JRadioButton("");
		r3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(r3.isSelected()==true) {
					size.setText("Large Php 50");
					m1.setEnabled(true);
					m1.setBackground(Color.ORANGE);
					
					m2.setEnabled(true);
					m2.setBackground(Color.ORANGE);
					
					m3.setEnabled(true);
					m3.setBackground(Color.ORANGE);
					
					m4.setEnabled(true);
					m4.setBackground(Color.ORANGE);
					
					m5.setEnabled(true);
					m5.setBackground(Color.ORANGE);
					
					m6.setEnabled(true);
					m6.setBackground(Color.ORANGE);
					
				}
				
			}
		});
		buttonGroup.add(r3);
		r3.setBackground(Color.ORANGE);
		r3.setBounds(237, 166, 21, 23);
		panel_1.add(r3);
		
		JLabel lblNewLabel_6_1 = new JLabel("Extra Large  Php 60");
		lblNewLabel_6_1.setForeground(Color.YELLOW);
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6_1.setBounds(67, 203, 164, 23);
		panel_1.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Medium  Php 40");
		lblNewLabel_3_1.setForeground(Color.YELLOW);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_1.setBounds(67, 132, 137, 23);
		panel_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("Large  Php 50");
		lblNewLabel_5_1.setForeground(Color.YELLOW);
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5_1.setBounds(67, 166, 137, 23);
		panel_1.add(lblNewLabel_5_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.ORANGE);
		panel_2.setBounds(10, 11, 319, 50);
		panel_1.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBounds(10, 11, 328, 28);
		panel_2.add(panel_3);
		
		JLabel lblNewLabel_1_1 = new JLabel("Choose your size!");
		lblNewLabel_1_1.setForeground(Color.ORANGE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(69, 0, 230, 25);
		panel_3.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Project_v3.class.getResource("/apps/img2/Annotation 2021-07-18 140758.jpg")));
		lblNewLabel_1.setBounds(10, 11, 319, 276);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Project_v3.class.getResource("/apps/img2/Annotation 2021-07-20 213954.jpg")));
		lblNewLabel.setBounds(10, 11, 1037, 639);
		getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBounds(1053, 0, 278, 661);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(10, 11, 258, 639);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.LIGHT_GRAY);
		panel_5.setBounds(130, 482, 58, 28);
		panel_4.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel Ltotal = new JLabel("");
		Ltotal.setFont(new Font("Tahoma", Font.BOLD, 12));
		Ltotal.setBounds(0, 0, 58, 28);
		panel_5.add(Ltotal);
		
		veg88 = new JPanel();
		veg88.setLayout(null);
		veg88.setBackground(Color.WHITE);
		veg88.setBounds(132, 304, 15, 14);
		panel_4.add(veg88);
		
		veg77 = new JPanel();
		veg77.setLayout(null);
		veg77.setBackground(Color.WHITE);
		veg77.setBounds(132, 277, 15, 14);
		panel_4.add(veg77);
		
		veg66 = new JPanel();
		veg66.setLayout(null);
		veg66.setBackground(Color.WHITE);
		veg66.setBounds(132, 252, 15, 14);
		panel_4.add(veg66);
		
		veg55 = new JPanel();
		veg55.setLayout(null);
		veg55.setBackground(Color.WHITE);
		veg55.setBounds(132, 229, 15, 14);
		panel_4.add(veg55);
		
		veg44 = new JPanel();
		veg44.setLayout(null);
		veg44.setBackground(Color.WHITE);
		veg44.setBounds(132, 204, 15, 14);
		panel_4.add(veg44);
		
		veg33 = new JPanel();
		veg33.setLayout(null);
		veg33.setBackground(Color.WHITE);
		veg33.setBounds(132, 179, 15, 14);
		panel_4.add(veg33);
		
		veg22 = new JPanel();
		veg22.setLayout(null);
		veg22.setBackground(Color.WHITE);
		veg22.setBounds(132, 154, 15, 14);
		panel_4.add(veg22);
		
		veg11 = new JPanel();
		veg11.setLayout(null);
		veg11.setBackground(Color.WHITE);
		veg11.setBounds(132, 129, 15, 14);
		panel_4.add(veg11);
		
		meat66 = new JPanel();
		meat66.setLayout(null);
		meat66.setBackground(Color.WHITE);
		meat66.setBounds(10, 252, 15, 14);
		panel_4.add(meat66);
		
		meat55 = new JPanel();
		meat55.setLayout(null);
		meat55.setBackground(Color.WHITE);
		meat55.setBounds(10, 229, 15, 14);
		panel_4.add(meat55);
		
		meat44 = new JPanel();
		meat44.setLayout(null);
		meat44.setBackground(Color.WHITE);
		meat44.setBounds(10, 204, 15, 14);
		panel_4.add(meat44);
		
		meat33 = new JPanel();
		meat33.setLayout(null);
		meat33.setBackground(Color.WHITE);
		meat33.setBounds(10, 179, 15, 14);
		panel_4.add(meat33);
		
		meat22 = new JPanel();
		meat22.setLayout(null);
		meat22.setBackground(Color.WHITE);
		meat22.setBounds(10, 154, 15, 14);
		panel_4.add(meat22);
		
		meat11 = new JLabel("Pepperoni  Php 10");
		meat11.setForeground(Color.BLACK);
		meat11.setFont(new Font("Tahoma", Font.PLAIN, 10));
		meat11.setBounds(39, 129, 94, 14);
		panel_4.add(meat11);
		
		meat1 = new JPanel();
		meat1.setLayout(null);
		meat1.setBackground(Color.WHITE);
		meat1.setBounds(10, 129, 15, 14);
		panel_4.add(meat1);
		
		size = new JLabel("");
		size.setFont(new Font("Tahoma", Font.PLAIN, 10));
		size.setForeground(Color.BLACK);
		size.setBounds(39, 77, 94, 14);
		panel_4.add(size);
		
		JLabel veg3 = new JLabel("Olives  Php 10");
		veg3.setForeground(Color.BLACK);
		veg3.setFont(new Font("Tahoma", Font.PLAIN, 9));
		veg3.setBounds(149, 179, 69, 14);
		panel_4.add(veg3);
		
		JLabel veg1 = new JLabel("Tomatoes  Php 10");
		veg1.setForeground(Color.BLACK);
		veg1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		veg1.setBounds(149, 129, 88, 14);
		panel_4.add(veg1);
		
		JLabel veg7 = new JLabel("Spinach  Php 20");
		veg7.setForeground(Color.BLACK);
		veg7.setFont(new Font("Tahoma", Font.PLAIN, 9));
		veg7.setBounds(149, 279, 69, 14);
		panel_4.add(veg7);
		
		JLabel veg6 = new JLabel("Pineapple  Php 20");
		veg6.setForeground(Color.BLACK);
		veg6.setFont(new Font("Tahoma", Font.PLAIN, 9));
		veg6.setBounds(149, 252, 99, 14);
		panel_4.add(veg6);
		
		JLabel veg4 = new JLabel("Green Peppers  Php 10");
		veg4.setForeground(Color.BLACK);
		veg4.setFont(new Font("Tahoma", Font.PLAIN, 9));
		veg4.setBounds(149, 204, 99, 14);
		panel_4.add(veg4);
		
		JLabel veg2 = new JLabel("Onions  Php 10");
		veg2.setForeground(Color.BLACK);
		veg2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		veg2.setBounds(149, 154, 69, 14);
		panel_4.add(veg2);
		
		JLabel veg5 = new JLabel("Mushrooms  Php 20");
		veg5.setForeground(Color.BLACK);
		veg5.setFont(new Font("Tahoma", Font.PLAIN, 9));
		veg5.setBounds(149, 229, 99, 14);
		panel_4.add(veg5);
		
		JPanel panel_3_4_1 = new JPanel();
		panel_3_4_1.setLayout(null);
		panel_3_4_1.setBackground(Color.LIGHT_GRAY);
		panel_3_4_1.setBounds(149, 329, 69, 14);
		panel_4.add(panel_3_4_1);
		
		JLabel lblNewLabel_15 = new JLabel("Saucy");
		lblNewLabel_15.setForeground(Color.BLACK);
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_15.setBounds(15, 0, 46, 14);
		panel_3_4_1.add(lblNewLabel_15);
		
		JPanel panel_3_1_1 = new JPanel();
		panel_3_1_1.setLayout(null);
		panel_3_1_1.setBackground(Color.LIGHT_GRAY);
		panel_3_1_1.setBounds(39, 102, 69, 14);
		panel_4.add(panel_3_1_1);
		
		JLabel lblNewLabel_12 = new JLabel("Meat");
		lblNewLabel_12.setForeground(Color.BLACK);
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_12.setBounds(20, 0, 49, 14);
		panel_3_1_1.add(lblNewLabel_12);
		
		JPanel panel_3_2_1 = new JPanel();
		panel_3_2_1.setLayout(null);
		panel_3_2_1.setBackground(Color.LIGHT_GRAY);
		panel_3_2_1.setBounds(39, 279, 69, 14);
		panel_4.add(panel_3_2_1);
		
		JLabel lblNewLabel_13 = new JLabel("Cheesy");
		lblNewLabel_13.setForeground(Color.BLACK);
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_13.setBounds(10, 0, 46, 14);
		panel_3_2_1.add(lblNewLabel_13);
		
		JPanel panel_3_3_1 = new JPanel();
		panel_3_3_1.setLayout(null);
		panel_3_3_1.setBackground(Color.LIGHT_GRAY);
		panel_3_3_1.setBounds(39, 329, 69, 14);
		panel_4.add(panel_3_3_1);
		
		JLabel lblNewLabel_14 = new JLabel("Crust");
		lblNewLabel_14.setForeground(Color.BLACK);
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_14.setBounds(15, 0, 46, 14);
		panel_3_3_1.add(lblNewLabel_14);
		
		JPanel panel_3_5_1 = new JPanel();
		panel_3_5_1.setLayout(null);
		panel_3_5_1.setBackground(Color.LIGHT_GRAY);
		panel_3_5_1.setBounds(149, 102, 88, 14);
		panel_4.add(panel_3_5_1);
		
		JLabel lblNewLabel_16 = new JLabel("Veggies");
		lblNewLabel_16.setForeground(Color.BLACK);
		lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_16.setBounds(15, 0, 68, 14);
		panel_3_5_1.add(lblNewLabel_16);
		
		JPanel panel_3_5 = new JPanel();
		panel_3_5.setLayout(null);
		panel_3_5.setBackground(Color.LIGHT_GRAY);
		panel_3_5.setBounds(39, 52, 69, 14);
		panel_4.add(panel_3_5);
		
		JLabel lblNewLabel_11 = new JLabel("Size");
		lblNewLabel_11.setForeground(Color.BLACK);
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_11.setBounds(22, 0, 37, 14);
		panel_3_5.add(lblNewLabel_11);
		
		JPanel panel_2_6 = new JPanel();
		panel_2_6.setLayout(null);
		panel_2_6.setBackground(Color.LIGHT_GRAY);
		panel_2_6.setBounds(10, 11, 238, 30);
		panel_4.add(panel_2_6);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("pizzeria express");
		lblNewLabel_3_1_1.setForeground(Color.YELLOW);
		lblNewLabel_3_1_1.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_3_1_1.setBackground(Color.ORANGE);
		lblNewLabel_3_1_1.setBounds(0, 0, 249, 26);
		panel_2_6.add(lblNewLabel_3_1_1);
		
		JLabel meat2 = new JLabel("Sausage  Php 10");
		meat2.setForeground(Color.BLACK);
		meat2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		meat2.setBounds(39, 154, 94, 14);
		panel_4.add(meat2);
		
		JLabel meat3 = new JLabel("Bacon  Php 20");
		meat3.setForeground(Color.BLACK);
		meat3.setFont(new Font("Tahoma", Font.PLAIN, 9));
		meat3.setBounds(39, 179, 94, 14);
		panel_4.add(meat3);
		
		JLabel meat4 = new JLabel("Ground Beef  Php 20");
		meat4.setForeground(Color.BLACK);
		meat4.setFont(new Font("Tahoma", Font.PLAIN, 9));
		meat4.setBounds(39, 204, 94, 14);
		panel_4.add(meat4);
		
		JLabel meat5 = new JLabel("Anchovy  Php 20");
		meat5.setForeground(Color.BLACK);
		meat5.setFont(new Font("Tahoma", Font.PLAIN, 9));
		meat5.setBounds(39, 229, 94, 14);
		panel_4.add(meat5);
		
		JLabel meat6 = new JLabel("Chicken  Php 20");
		meat6.setForeground(Color.BLACK);
		meat6.setFont(new Font("Tahoma", Font.PLAIN, 9));
		meat6.setBounds(39, 254, 94, 14);
		panel_4.add(meat6);
		
		JPanel panel_3_5_1_1_7 = new JPanel();
		panel_3_5_1_1_7.setLayout(null);
		panel_3_5_1_1_7.setBackground(Color.WHITE);
		panel_3_5_1_1_7.setBounds(143, 354, 105, 14);
		panel_4.add(panel_3_5_1_1_7);
		
		saucy = new JLabel("");
		saucy.setFont(new Font("Tahoma", Font.PLAIN, 10));
		saucy.setForeground(Color.BLACK);
		saucy.setBounds(0, 0, 105, 14);
		panel_3_5_1_1_7.add(saucy);
		
		JPanel panel_3_5_1_1_8 = new JPanel();
		panel_3_5_1_1_8.setLayout(null);
		panel_3_5_1_1_8.setBackground(Color.WHITE);
		panel_3_5_1_1_8.setBounds(28, 304, 94, 14);
		panel_4.add(panel_3_5_1_1_8);
		
		cheesy = new JLabel("");
		cheesy.setBounds(0, 0, 94, 14);
		panel_3_5_1_1_8.add(cheesy);
		cheesy.setFont(new Font("Tahoma", Font.PLAIN, 10));
		cheesy.setForeground(Color.BLACK);
		
		panelsize = new JPanel();
		panelsize.setLayout(null);
		panelsize.setBackground(Color.WHITE);
		panelsize.setBounds(39, 77, 94, 14);
		panel_4.add(panelsize);
		
		JPanel panel_3_5_1_1_7_1 = new JPanel();
		panel_3_5_1_1_7_1.setLayout(null);
		panel_3_5_1_1_7_1.setBackground(Color.WHITE);
		panel_3_5_1_1_7_1.setBounds(10, 354, 123, 14);
		panel_4.add(panel_3_5_1_1_7_1);
		
		crust = new JLabel("");
		crust.setFont(new Font("Tahoma", Font.PLAIN, 10));
		crust.setForeground(Color.BLACK);
		crust.setBounds(0, 0, 123, 14);
		panel_3_5_1_1_7_1.add(crust);
		
		JPanel panel_1_5 = new JPanel();
		panel_1_5.setBackground(Color.BLACK);
		panel_1_5.setBounds(10, 408, 238, 4);
		panel_4.add(panel_1_5);
		
		JLabel lblNewLabel_18_2 = new JLabel("Php");
		lblNewLabel_18_2.setForeground(Color.BLACK);
		lblNewLabel_18_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_18_2.setBounds(85, 482, 35, 28);
		panel_4.add(lblNewLabel_18_2);
		
		btnNewButton = new JButton("Submit Order");
		btnNewButton.setEnabled(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setEnabled(false);
				new f1().setVisible(true);
			}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setFocusable(false);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(65, 534, 123, 23);
		panel_4.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setEnabled(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				btnNewButton.setEnabled(false);
				btnNewButton_1.setEnabled(false);
				btnNewButton_1.setBackground(Color.WHITE);
				m1.setEnabled(false);
				m1.setSelected(false);
				m1.setBackground(Color.LIGHT_GRAY);
				
				m2.setEnabled(false);
				m2.setSelected(false);
				m2.setBackground(Color.LIGHT_GRAY);
				
				m3.setEnabled(false);
				m3.setSelected(false);
				m3.setBackground(Color.LIGHT_GRAY);
				
				m4.setEnabled(false);
				m4.setSelected(false);
				m4.setBackground(Color.LIGHT_GRAY);
				
				m5.setEnabled(false);
				m5.setSelected(false);
				m5.setBackground(Color.LIGHT_GRAY);
				
				m6.setEnabled(false);
				m6.setSelected(false);
				m6.setBackground(Color.LIGHT_GRAY);
				
				r1_1.setEnabled(false);
				r1_1.setSelected(false);
				r1_1.setBackground(Color.LIGHT_GRAY);
				
				r2_1.setEnabled(false);
				r2_1.setSelected(false);
				r2_1.setBackground(Color.LIGHT_GRAY);
				
				r3_1.setEnabled(false);
				r3_1.setSelected(false);
				r3_1.setBackground(Color.LIGHT_GRAY);
				
				r1_2.setEnabled(false);
				r1_2.setSelected(false);
				r1_2.setBackground(Color.LIGHT_GRAY);
				
				r2_2.setEnabled(false);
				r2_2.setSelected(false);
				r2_2.setBackground(Color.LIGHT_GRAY);
				
				r3_2.setEnabled(false);
				r3_2.setSelected(false);
				r3_2.setBackground(Color.LIGHT_GRAY);
				
				r4_1.setEnabled(false);
				r4_1.setSelected(false);
				r4_1.setBackground(Color.LIGHT_GRAY);
				
				r5.setEnabled(false);
				r5.setSelected(false);
				r5.setBackground(Color.LIGHT_GRAY);
				
				r1_3.setEnabled(false);
				r1_3.setSelected(false);
				r1_3.setBackground(Color.LIGHT_GRAY);
				
				r2_3.setEnabled(false);
				r2_3.setSelected(false);
				r2_3.setBackground(Color.LIGHT_GRAY);
				
				r3_3.setEnabled(false);
				r3_3.setSelected(false);
				r3_3.setBackground(Color.LIGHT_GRAY);
				
				r4_2.setEnabled(false);
				r4_2.setSelected(false);
				r4_2.setBackground(Color.LIGHT_GRAY);
				
				v1.setEnabled(false);
				v1.setSelected(false);
				v1.setBackground(Color.LIGHT_GRAY);

				v2.setEnabled(false);
				v2.setSelected(false);
				v2.setBackground(Color.LIGHT_GRAY);
				
				v3.setEnabled(false);
				v3.setSelected(false);
				v3.setBackground(Color.LIGHT_GRAY);

				v4.setEnabled(false);
				v4.setSelected(false);
				v4.setBackground(Color.LIGHT_GRAY);

				v5.setEnabled(false);
				v5.setSelected(false);
				v5.setBackground(Color.LIGHT_GRAY);

				v6.setEnabled(false);
				v6.setSelected(false);
				v6.setBackground(Color.LIGHT_GRAY);

				v7.setEnabled(false);
				v7.setSelected(false);
				v7.setBackground(Color.LIGHT_GRAY);

				v8.setEnabled(false);
				v8.setSelected(false);
				v8.setBackground(Color.LIGHT_GRAY);
				
				size.setText("");
				cheesy.setText("");
				saucy.setText("");
				crust.setText("");
				
				meat1.setBackground(Color.WHITE);
				meat22.setBackground(Color.WHITE);
				meat33.setBackground(Color.WHITE);
				meat44.setBackground(Color.WHITE);
				meat55.setBackground(Color.WHITE);
				meat66.setBackground(Color.WHITE);

				veg11.setBackground(Color.WHITE);
				veg22.setBackground(Color.WHITE);
				veg33.setBackground(Color.WHITE);
				veg44.setBackground(Color.WHITE);
				veg55.setBackground(Color.WHITE);
				veg66.setBackground(Color.WHITE);
				veg77.setBackground(Color.WHITE);
				veg88.setBackground(Color.WHITE);
				
				Ltotal.setText("");
				total = 0;
				
				buttonGroup_1.clearSelection();
				buttonGroup_2.clearSelection();
				buttonGroup.clearSelection();
				buttonGroup_3.clearSelection();
			}
		});
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(65, 572, 123, 23);
		panel_4.add(btnNewButton_1);
		
		JLabel veg8 = new JLabel("Jalapeno  Php 20");
		veg8.setBounds(149, 304, 88, 14);
		panel_4.add(veg8);
		veg8.setForeground(Color.BLACK);
		veg8.setFont(new Font("Tahoma", Font.PLAIN, 9));
		
		JLabel lblNewLabel_10 = new JLabel("CALCULATE THE TOTAL");
		lblNewLabel_10.setForeground(Color.BLACK);
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_10.setBounds(47, 423, 190, 14);
		panel_4.add(lblNewLabel_10);
		
		btnNewButton_2 = new JButton("Calculate");
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setFocusable(false);
		btnNewButton_2.setEnabled(false);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				btnNewButton.setEnabled(true);
				btnNewButton_1.setEnabled(true);
				btnNewButton_1.setBackground(Color.red);
				if(r1.isSelected()) {
					rmeat1 = 30;
					total += rmeat1;
					Ltotal.setText(""+total);
					btnNewButton_2.setEnabled(false);
				}
				if(r2.isSelected()) {
					rmeat2 = 40;
					total += rmeat2;
					Ltotal.setText(""+total);
					btnNewButton_2.setEnabled(false);
				}
				if(r3.isSelected()) {
					rmeat3 = 50;
					total += rmeat3;
					Ltotal.setText(""+total);
					btnNewButton_2.setEnabled(false);
				}
				if(r4.isSelected()) {
					rmeat4 = 60;
					total += rmeat4;
					Ltotal.setText(""+total);
					btnNewButton_2.setEnabled(false);
				}
				if(m1.isSelected()) {
					cm1 = 10;
					total += cm1;
					Ltotal.setText(""+total);
					btnNewButton_2.setEnabled(false);
				}
				if(m2.isSelected()) {
					cm2 = 10;
					total += cm2;
					Ltotal.setText(""+total);
					btnNewButton_2.setEnabled(false);
				}
				if(m3.isSelected()) {
					cm3 = 20;
					total += cm3;
					Ltotal.setText(""+total);
					btnNewButton_2.setEnabled(false);
				}
				if(m4.isSelected()) {
					cm4 = 20;
					total += cm4;
					Ltotal.setText(""+total);
					btnNewButton_2.setEnabled(false);
				}
				if(m5.isSelected()) {
					cm5 = 20;
					total += cm5;
					Ltotal.setText(""+total);
					btnNewButton_2.setEnabled(false);
				}
				if(m6.isSelected()) {
					cm6 = 20;
					total += cm6;
					Ltotal.setText(""+total);
					btnNewButton_2.setEnabled(false);
				}
				if(r1_1.isSelected()) {
					rr1 = 20;
					total += rr1;
					Ltotal.setText(""+total);
					btnNewButton_2.setEnabled(false);
				}
				if(r3_1.isSelected()) {
					rr3 = 30;
					total += rr3;
					Ltotal.setText(""+total);
					btnNewButton_2.setEnabled(false);
				}
				if(r1_2.isSelected()) {
					crust1 = 10;
					total += crust1;
					Ltotal.setText(""+total);
					btnNewButton_2.setEnabled(false);
				}
				if(r2_2.isSelected()) {
					crust2 = 20;
					total += crust2;
					Ltotal.setText(""+total);
					btnNewButton_2.setEnabled(false);
				}
				if(r3_2.isSelected()) {
					crust3 = 20;
					total += crust3;
					Ltotal.setText(""+total);
					btnNewButton_2.setEnabled(false);
				}
				if(r4_1.isSelected()) {
					crust4 = 20;
					total += crust4;
					Ltotal.setText(""+total);
					btnNewButton_2.setEnabled(false);
				}
				if(r5.isSelected()) {
					crust5 = 30;
					total += crust5;
					Ltotal.setText(""+total);
					btnNewButton_2.setEnabled(false);
				}
				if(r1_3.isSelected()) {
					saucy1 = 10;
					total += saucy1;
					Ltotal.setText(""+total);
					btnNewButton_2.setEnabled(false);
				}
				if(r2_3.isSelected()) {
					saucy2 = 10;
					total += saucy2;
					Ltotal.setText(""+total);
					btnNewButton_2.setEnabled(false);
				}
				if(r3_3.isSelected()) {
					saucy3 = 10;
					total += saucy3;
					Ltotal.setText(""+total);
					btnNewButton_2.setEnabled(false);
				}
				if(v1.isSelected()) {
					cv1 = 10;
					total += cv1;
					Ltotal.setText(""+total);
					btnNewButton_2.setEnabled(false);
				}
				if(v2.isSelected()) {
					cv2 = 10;
					total += cv2;
					Ltotal.setText(""+total);
					btnNewButton_2.setEnabled(false);
				}
				if(v3.isSelected()) {
					cv3 = 10;
					total += cv3;
					Ltotal.setText(""+total);
					btnNewButton_2.setEnabled(false);
				}
				if(v4.isSelected()) {
					cv4 = 10;
					total += cv4;
					Ltotal.setText(""+total);
					btnNewButton_2.setEnabled(false);
				}
				if(v5.isSelected()) {
					cv5 = 20;
					total += cv5;
					Ltotal.setText(""+total);
					btnNewButton_2.setEnabled(false);
				}
				if(v6.isSelected()) {
					cv6 = 20;
					total += cv6;
					Ltotal.setText(""+total);
					btnNewButton_2.setEnabled(false);
				}
				if(v7.isSelected()) {
					cv7 = 20;
					total += cv7;
					Ltotal.setText(""+total);
					btnNewButton_2.setEnabled(false);
				}
				if(v8.isSelected()) {
					cv8 = 20;
					total += cv8;
					Ltotal.setText(""+total);
					btnNewButton_2.setEnabled(false);
				}
			}
		});
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2.setBounds(89, 448, 89, 23);
		panel_4.add(btnNewButton_2);
	}
}
