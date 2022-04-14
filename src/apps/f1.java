package apps;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class f1 extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					f1 frame = new f1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public f1() {
		getContentPane().setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 200, 709, 395);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBounds(178, 97, 384, 144);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 364, 122);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Your order has been successfully");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBounds(10, 11, 344, 28);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("submitted.");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setBounds(10, 39, 131, 28);
		panel_1.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(10, 88, 109, 23);
		panel_1.add(btnNewButton);
		btnNewButton.setFocusable(false);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(f1.class.getResource("/apps/img2/Annotation 2021-07-18 141012.jpg")));
		lblNewLabel.setBounds(10, 11, 673, 334);
		getContentPane().add(lblNewLabel);
	}

}
