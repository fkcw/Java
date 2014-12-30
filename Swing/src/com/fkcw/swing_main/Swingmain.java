package com.fkcw.swing_main;

import java.awt.*;
import javax.swing.*;

public class Swingmain extends JFrame{

	/**
	 * @param args
	 */
	public Swingmain(){
		this.setTitle("Login Window");
		this.setSize(300, 200);
		JLabel jlname = new JLabel("Username:");
		JLabel jlpass = new JLabel("Password:");
		JTextField jtname = new JTextField();
		JTextField jtpass = new JTextField();
		JButton jbok = new JButton("login");
		JButton jbcal = new JButton("cancel");
		jlname.setBounds(60, 40, 60, 20);
		jlpass.setBounds(60, 70, 60, 20);
		
		Container cp = this.getContentPane();
		cp.add(jlname);
		cp.add(jlpass);
		cp.add(jtname);
		cp.add(jtpass);
		cp.add(jbok);
		cp.add(jbcal);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swingmain login = new Swingmain();
		login.setVisible(true);
		
	}

}
