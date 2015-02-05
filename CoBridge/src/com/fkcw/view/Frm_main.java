package com.fkcw.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JTable;

import com.fkcw.DBUtil.DBUtil;
import com.fkcw.DBUtil.TBUtil;
import com.fkcw.dao.TblDao;

import java.awt.GridBagConstraints;
import java.sql.Connection;
import java.sql.SQLException;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import java.awt.Font;

public class Frm_main extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private DBUtil dbutil = new DBUtil();
	private TBUtil tbutil = new TBUtil();
	private TblDao tbdao = new TblDao();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frm_main frame = new Frm_main();
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
	public Frm_main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 18));
		table.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.RED, Color.RED, Color.RED, Color.RED));
		table.setBackground(Color.WHITE);
		Connection conn = null;
		try {
			conn = dbutil.getCon();
			table.setModel(tbutil.rstotbm(tbdao.rtnordrs(conn)));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				dbutil.closeCon(conn);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		GridBagConstraints gbc_table = new GridBagConstraints();
		gbc_table.fill = GridBagConstraints.BOTH;
		gbc_table.gridx = 0;
		gbc_table.gridy = 0;
		contentPane.add(table, gbc_table);
	}

}
