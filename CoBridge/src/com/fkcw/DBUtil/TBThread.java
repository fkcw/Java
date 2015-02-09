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
			modelistrs =tbutil.rstotbm(tbldao.rttblrsrs(con));
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
		for (int i = 0; i < modelistrs.size(); i++) {
			tbl.setModel((TableModel) modelistrs.get(i));
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
	}
}
