package com.fkcw.DBUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.table.TableModel;

import com.fkcw.dao.TblDao;

public class TBThread extends Thread {
	private static Connection con=null;
	private static DBUtil dbutil= new DBUtil();
	private static TBUtil tbutil= new TBUtil();
	private static TblDao tbldao = new TblDao();
	private static JTable tbl;
	private static Vector<?> modelistrs= new Vector<Object>();

	public JTable getTbl() {
		return tbl;
	}

	public void setTbl(JTable tbl) {
		TBThread.tbl = tbl;
	}

	public void run(){
		while (true) {
			try {
				con = dbutil.getCon();
				modelistrs =tbutil.rstotbm(tbldao.rttblnsrs(con));

			} catch (ClassNotFoundException e) {

				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				try {
					dbutil.closeCon(con);
				} catch (SQLException e) {

					e.printStackTrace();
				}
			}
//			for (int i = 0; i < modelistrs.size(); i++) {
//				tbl.setModel((TableModel) modelistrs.get(i));
//				tbutil.tblhandler(tbl);
//				try {
//					Thread.sleep(5500);
//				} catch (InterruptedException e) {
//
//					e.printStackTrace();
//				}
//			}
			for (Object e : modelistrs) {
				tbl.setModel((TableModel) e);
				tbutil.tblhandler(tbl);
				try {
					Thread.sleep(5500);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
	}
}
