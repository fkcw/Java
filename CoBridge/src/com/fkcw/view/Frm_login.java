package com.fkcw.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frm_login extends JFrame {

	private JPanel contentPane;
	private JTextField usernametxt;
	private JPasswordField userpasstxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frm_login frame = new Frm_login();
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
	public Frm_login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCobridge = new JLabel("CoBridge");
		lblCobridge.setBounds(174, 50, 54, 14);
		contentPane.add(lblCobridge);
		
		JLabel lblNewLabel = new JLabel("Username:");
		lblNewLabel.setBounds(79, 111, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password:");
		lblNewLabel_1.setBounds(81, 162, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		usernametxt = new JTextField();
		usernametxt.setBounds(182, 108, 86, 20);
		contentPane.add(usernametxt);
		usernametxt.setColumns(10);
		
		JButton jb_login = new JButton("Login");
		jb_login.setBounds(52, 220, 91, 23);
		contentPane.add(jb_login);
		
		JButton jb_reset = new JButton("Reset");
		jb_reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				usernametxt.setText("");
				userpasstxt.setText("");
			}
		});
		jb_reset.setBounds(274, 218, 91, 23);
		contentPane.add(jb_reset);
		
		userpasstxt = new JPasswordField();
		userpasstxt.setBounds(182, 159, 86, 20);
		contentPane.add(userpasstxt);
	}
}
