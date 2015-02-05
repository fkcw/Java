package com.fkcw.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import java.awt.GridBagLayout;
import javax.swing.JTable;

import com.fkcw.dao.OrdDao;
import com.fkcw.dao.UserDao;
import com.fkcw.util.DBUtils;
import com.fkcw.util.Dbcon;

import java.awt.GridBagConstraints;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class Main_Ord extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private Dbcon dbcon = new Dbcon();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_Ord frame = new Main_Ord();
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
//	private TableModel tbm;
//	private TableModel getTbmod() throws Exception{
//		Connection conn;
//		conn = dbcon.getcon();
//		ResultSet rs = new OrdDao().getRs(conn);
//		while (rs.next()) {
//			Vector v = new Vector();
//			v.add(rs.getString("PROCODE"));
//			v.add(rs.getString("AREA"));
//			v.add(rs.getString("FACODE"));
//			v.add(rs.getString("CLASS"));
//			v.add(rs.getString("DES"));
//			v.add(rs.getString("DES_CN"));
//			v.add(rs.getString("VENDOR"));
//			v.add(rs.getString("PRICE"));
//			((DefaultTableModel)tbm).addRow(v);
//		}
//		return tbm;
//	}
	
	public Main_Ord() {
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
		Connection conn;
		TableModel tbm = null;
		try {
			conn = dbcon.getcon();
			ResultSet rs = new OrdDao().getRs(conn);
			tbm = DBUtils.rstotblmod(rs);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		table.setModel(tbm);
		GridBagConstraints gbc_table = new GridBagConstraints();
		gbc_table.fill = GridBagConstraints.BOTH;
		gbc_table.gridx = 0;
		gbc_table.gridy = 0;
		contentPane.add(table, gbc_table);
	}

}
