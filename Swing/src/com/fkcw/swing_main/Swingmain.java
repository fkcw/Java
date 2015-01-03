package com.fkcw.swing_main;

import java.awt.*;
import javax.swing.*;

public class Swingmain extends JFrame{

	/**
	 * @param args
	 */
	public Swingmain(){
		this.setTitle("Login Window");
		this.setSize(500, 400);
		JLabel jlname = new JLabel("U:");
		JLabel jlpass = new JLabel("P:");
		JTextField jtname = new JTextField();
		JTextField jtpass = new JTextField();
		JButton jbok = new JButton("l");
		JButton jbcal = new JButton("c");
		jlname.setBounds(60, 40, 180, 20);
		jlpass.setBounds(60, 70, 180, 20);
		jtname.setBounds(120,40,90,20);
		jtname.setBounds(120,70,90,20);
		jbok. setBounds(70,110,60,20);
		jbcal.setBounds(140,110,60,20);
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
