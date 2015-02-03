package com.fkcw.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		setTitle("Main");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("基本信息维护");
		menuBar.add(mnNewMenu);
		
		JMenuItem jb_cpmaintain = new JMenuItem("产品信息维护");
		mnNewMenu.add(jb_cpmaintain);
		
		JMenuItem jb_dqmaintain = new JMenuItem("地区模板维护");
		mnNewMenu.add(jb_dqmaintain);
		
		JMenuItem jb_exit = new JMenuItem("退出");
		jb_exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int confirm =JOptionPane.showConfirmDialog(null, "是否退出系统？");
				if(confirm==0){
					Main.this.dispose();
				}
			}
		});
		jb_exit.addMouseListener(new MouseAdapter() {
	
		});
		mnNewMenu.add(jb_exit);
		
		JMenu menu = new JMenu("?");
		menuBar.add(menu);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
