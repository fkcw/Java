package com.fkcw.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField usernametxt;
	private JTextField passtxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("HKIDB");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHkiChinaDb = new JLabel("HKI China DB");
		lblHkiChinaDb.setBounds(166, 50, 86, 14);
		contentPane.add(lblHkiChinaDb);
		
		usernametxt = new JTextField();
		usernametxt.setBounds(166, 108, 86, 20);
		contentPane.add(usernametxt);
		usernametxt.setColumns(10);
		
		passtxt = new JTextField();
		passtxt.setBounds(166, 146, 86, 20);
		contentPane.add(passtxt);
		passtxt.setColumns(10);
		
		JLabel lblUser = new JLabel("User:");
		lblUser.setBounds(55, 111, 46, 14);
		contentPane.add(lblUser);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(55, 149, 63, 14);
		contentPane.add(lblPassword);
		
		JButton jb_login = new JButton("Login");
		jb_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		jb_login.setBounds(62, 207, 91, 23);
		contentPane.add(jb_login);
		
		JButton jb_reset = new JButton("Reset");
		jb_reset.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String username = usernametxt.getText();
				String userpass = passtxt.getText();
				System.out.println(username);
			}
		});
		jb_reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		jb_reset.setBounds(281, 207, 91, 23);
		contentPane.add(jb_reset);
	}
}
