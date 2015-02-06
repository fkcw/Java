package com.fkcw.view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.Timer;

import net.miginfocom.swing.MigLayout;

import com.fkcw.DBUtil.DBUtil;
import com.fkcw.DBUtil.TBUtil;
import com.fkcw.dao.TblDao;


public class Frm_main_sub extends JFrame {
	private JTable table;
	private JTable table_1;
	private JLabel lblResupply;
	private Connection con=null;
	private DBUtil dbutil= new DBUtil();
	private TBUtil tbutil= new TBUtil();
	private TblDao tbldao = new TblDao();
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

	/**
	 * Create the frame.
	 */
	ActionListener taskRun = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			getContentPane().add(lblResupply, "cell 1 0");
			try {
				con = dbutil.getCon();
				table.setModel(tbutil.rstotbm(tbldao.rtnordrs(con)));
				table_1.setModel(tbutil.rstotbm(tbldao.rtnordrs(con)));
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}finally{
				try {
					dbutil.closeCon(con);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
		}
	};
	public Frm_main_sub() {
		setTitle("Logistic Panel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new MigLayout("wrap2", "[grow][grow]", "[][grow]"));
		
		JLabel lblNsSche = new JLabel("NS Schedule");
		lblNsSche.setFont(new Font("Tahoma", Font.BOLD, 13));
		getContentPane().add(lblNsSche, "cell 0 0");
		
		lblResupply = new JLabel("Resupply");
		lblResupply.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		//table init
		table = new JTable();
		getContentPane().add(lblResupply, "cell 1 0");
		try {
			con = dbutil.getCon();
			table.setModel(tbutil.rstotbm(tbldao.rtnordrs(con)));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				dbutil.closeCon(con);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		table_1 = new JTable();
		getContentPane().add(lblResupply, "cell 1 0");
		try {
			con = dbutil.getCon();
			table_1.setModel(tbutil.rstotbm(tbldao.rtnordrs(con)));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				dbutil.closeCon(con);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		getContentPane().add(table, "cell 0 1,grow");
		getContentPane().add(table_1, "cell 1 1,grow");
		new Timer(1000, taskRun).start();
	}
	
}
