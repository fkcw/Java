package com.fkcw.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.sql.Connection;
import java.util.Vector;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.plaf.TableHeaderUI;
import javax.swing.table.JTableHeader;

import net.miginfocom.swing.MigLayout;

import com.fkcw.DBUtil.DBUtil;
import com.fkcw.DBUtil.TBThread;
import com.fkcw.DBUtil.TBThreadTb2;
import com.fkcw.DBUtil.TBUtil;
import com.fkcw.dao.TblDao;


public class Frm_main_sub extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable table;
	private JTable table_1;
	private JLabel lblResupply;
	private TBThread tblthread = new TBThread();
	private TBThreadTb2 tbl2thread = new TBThreadTb2();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frm_main_sub frame = new Frm_main_sub();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Frm_main_sub() {
		
		setFont(new Font("Dialog", Font.BOLD, 12));
		setForeground(Color.WHITE);
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setTitle("Logistic Panel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new MigLayout("wrap2", "[0:0, grow 50,fill][0:0, grow 50,fill]", "[][][grow]"));

		JLabel lblNsSche = new JLabel("NS Schedule");
		lblNsSche.setHorizontalAlignment(SwingConstants.CENTER);
		lblNsSche.setForeground(Color.BLACK);
		lblNsSche.setFont(new Font("Tahoma", Font.BOLD, 21));
		getContentPane().add(lblNsSche, "cell 0 0");

		lblResupply = new JLabel("Resupply");
		lblResupply.setHorizontalAlignment(SwingConstants.CENTER);
		lblResupply.setForeground(Color.BLACK);
		lblResupply.setFont(new Font("Tahoma", Font.BOLD, 21));
		getContentPane().add(lblResupply, "cell 1 0");

		table = new JTable();
		table_1 = new JTable();

//		getContentPane().add(table.getTableHeader(),"cell 0 1,grow 50");
//		getContentPane().add(table_1.getTableHeader(),"cell 1 1,grow 50");
		getContentPane().add(table, "cell 0 2,grow");
//		getContentPane().add(table_1, "cell 1 2,grow");

		tblthread.setTbl(table);
		tblthread.start();
		tbl2thread.setTbl(table_1);
		tbl2thread.start();
	}

}
