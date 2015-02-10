package com.fkcw.DBUtil;

import java.awt.Font;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class TBUtil {

	public Vector<TableModel> rstotbm(ResultSet rs) throws SQLException{
		TableModel tbm;
		ResultSetMetaData rsmd = rs.getMetaData();
		Vector<String> nameofcol = new Vector<String>();
		Vector<Vector<Object>> rows = new Vector<Vector<Object>>();
		int numofcol = rsmd.getColumnCount();

		for (int i = 0; i < numofcol; i++) {
			nameofcol.addElement(rsmd.getColumnLabel(i+1));
		}
		while(rs.next()){
			Vector<Object> row= new Vector<Object>();
			for (int i = 1; i <= numofcol; i++) {
				row.addElement(rs.getObject(i));
			}
			rows.addElement(row);
		}
		/**
		 * split rows
		 */

		int numofrows = rows.size();
		Vector<TableModel> rowsarr = new Vector<TableModel>();
		if (numofrows>30) {
			int j =0;
			int numofpager = numofrows/30;
			int resetnum = numofrows - numofpager*30;
			for (int p = 0; p < numofpager; p++) {
				Vector<Vector<Object>> subarr = new Vector<Vector<Object>>();
				for (int i = 0; i < 30; i++) {
					subarr.addElement(rows.get(j++));	
				}
				tbm=new DefaultTableModel(subarr,nameofcol);
				rowsarr.addElement(tbm);
			}
			/*
			 * add reset records to the last of array;
			 */
			Vector<Vector<Object>> subarrrest = new Vector<Vector<Object>>();
			System.out.println(resetnum);
			if (resetnum >0) {
				for (int i = 0; i < resetnum; i++) {
					subarrrest.addElement(rows.get(j++));
				}
				tbm = new DefaultTableModel(subarrrest,nameofcol);
				rowsarr.addElement(tbm);
			}
			return rowsarr;
		}else{
			tbm=new DefaultTableModel(rows,nameofcol);
			rowsarr.addElement(tbm);
			return rowsarr;
		}



	}
	/*
	 * this for table format
	 */
	public void tblhandler(JTable tbl) {


		tbl.setRowHeight(25);
		tbl.setFillsViewportHeight(true);
		tbl.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 13));
		//tbl.setBackground(Color.LIGHT_GRAY);
		tbl.setEnabled(false);
		tbl.getTableHeader().setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));

	}
	/*
	 * this for color rows
	 */
	public void tblpainter(JTable tbl){

	}

}
