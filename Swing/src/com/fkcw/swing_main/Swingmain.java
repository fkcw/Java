package com.fkcw.swing_main;

import java.awt.*;
import javax.swing.*;

public class Swingmain extends JFrame {

	public Swingmain() {
		this.setTitle("Login Window");
		this.setSize(1000,900);
		JLabel jlname = new JLabel("Account:");
		JLabel jlpass = new JLabel("Password:");
		JTextField jtname = new JTextField();
		JTextField jtpass = new JTextField();
		JButton jbok = new JButton("OK");
		JButton jbcal = new JButton("Cancel");
		jlname.setBounds(60, 40, 180, 20);
		jlpass.setBounds(60, 70, 180, 20);
		jtname.setBounds(120, 40, 90, 20);
		jtname.setBounds(120, 70, 90, 20);
		jbok.setBounds(70, 110, 60, 20);
		jbcal.setBounds(70, 130, 60, 20);
		Container cp = this.getContentPane();
		cp.setBackground(getBackground());
		cp.add(jlname);
		cp.add(jlpass);
		cp.add(jtname);
		cp.add(jtpass);
		cp.add(jbcal);
		cp.add(jbok);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swingmain sw =new Swingmain();
		sw.setVisible(true);
		
	}
}
