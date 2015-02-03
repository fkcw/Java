package com.fkcw.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import com.fkcw.dao.UserDao;
import com.fkcw.model.User;
import com.fkcw.util.Dbcon;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JPasswordField;
import java.awt.Font;

public class Login extends JFrame {
	Dbcon conn = new Dbcon();
	UserDao userdao=new UserDao();

	private JPanel contentPane;
	private JTextField usernametxt;
	private JPasswordField passtxt;

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
		//Set frame location
		this.setLocationRelativeTo(null);
		setTitle("HKIDB");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHkiChinaDb = new JLabel("Maintain Center");
		lblHkiChinaDb.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblHkiChinaDb.setBounds(166, 50, 115, 14);
		contentPane.add(lblHkiChinaDb);
		
		usernametxt = new JTextField();
		usernametxt.setBounds(166, 108, 86, 20);
		contentPane.add(usernametxt);
		usernametxt.setColumns(10);
		
		JLabel lblUser = new JLabel("Username:");
		lblUser.setBounds(55, 111, 63, 14);
		contentPane.add(lblUser);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(55, 149, 63, 14);
		contentPane.add(lblPassword);
		
		JButton jb_login = new JButton("Login");
		jb_login.addActionListener(new ActionListener() {
			private Connection cont;

			public void actionPerformed(ActionEvent arg0) {
				String username=new String(usernametxt.getText());
				String userpass=new String(passtxt.getText());
				if (username.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Username must be filled!");
					return;
				}
				
				if (userpass.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Password must be filled!");
				}
				User userin = new User(username,userpass);
				
				try {
					cont = conn.getcon();
					User current = userdao.login(cont, userin);
					if (current != null) {
						
						Login.this.dispose();
						new Main().setVisible(true);
						//JOptionPane.showMessageDialog(null, "Success login");
						
					}else{
						JOptionPane.showMessageDialog(null, "Fail login");
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					conn.closecon(cont);
				}
			}
		});
		jb_login.setBounds(62, 207, 91, 23);
		contentPane.add(jb_login);
		
		JButton jb_reset = new JButton("Reset");
		jb_reset.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				usernametxt.setText("");
				passtxt.setText("");
				
			}
		});
		jb_reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		jb_reset.setBounds(281, 207, 91, 23);
		contentPane.add(jb_reset);
		
		passtxt = new JPasswordField();
		passtxt.setBounds(166, 146, 86, 20);
		contentPane.add(passtxt);
	}
}
