package com.fkcw.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class Ifrm_item_maintain extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ifrm_item_maintain frame = new Ifrm_item_maintain();
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
	public Ifrm_item_maintain() {
		setMaximizable(true);
		setBorder(new LineBorder(new Color(0, 0, 0)));
		setBackground(Color.DARK_GRAY);
		setForeground(Color.WHITE);
		setClosable(true);
		setBounds(100, 100, 450, 300);

	}

}
