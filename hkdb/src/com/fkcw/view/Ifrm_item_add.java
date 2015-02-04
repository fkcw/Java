package com.fkcw.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class Ifrm_item_add extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ifrm_item_add frame = new Ifrm_item_add();
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
	public Ifrm_item_add() {
		setClosable(true);
		setBounds(100, 100, 450, 300);

	}

}
