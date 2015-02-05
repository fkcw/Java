package com.fkcw.view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Main extends JFrame {

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
		
		JMenu jmb_cpmaintain = new JMenu("产品信息维护");
		mnNewMenu.add(jmb_cpmaintain);
		
		JMenuItem menuItem = new JMenuItem("添加新产品");
		menuItem.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent arg0) {
				 //Frm_Item_Add itemadd = new Frm_Item_Add();
				 //itemadd.setVisible(true);
				 //new Ifrm_item_add().setVisible(true);
				 Ifrm_item_add itemadd = new Ifrm_item_add();
				 itemadd.setVisible(true);
				 getContentPane().add(itemadd);
				
				 
			}
		});
		jmb_cpmaintain.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("产品信息更新");
		menuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		jmb_cpmaintain.add(menuItem_1);
		
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
		getContentPane().setLayout(null);
	}
}
