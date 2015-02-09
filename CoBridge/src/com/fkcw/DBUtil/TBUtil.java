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
		ResultSetMetaData rsmd = rs.getMetaData();
		int numofcol = rsmd.getColumnCount();

		Vector<String> nameofcol = new Vector<String>();
		Vector<Vector<Object>> rows = new Vector<Vector<Object>>();
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
		TableModel tbm;
		if (numofrows>30) {
			int j =0;
			int numofpager = numofrows/30;
			for (int k = 0; k < numofpager; k++) {
				Vector<Vector<Object>> subarr = new Vector<Vector<Object>>();
				for (int i = 0; i < 30; i++) {
					subarr.addElement(rows.get(j++));	
				}
				tbm=new DefaultTableModel(subarr,nameofcol);
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
		tbl.getColumn("Date").setPreferredWidth(150);
		tbl.getColumn("StoreName").setPreferredWidth(300);
		tbl.getColumn("OrderNum").setPreferredWidth(100);
		tbl.getColumn("Approved").setPreferredWidth(50);
		tbl.getColumn("Comment").setPreferredWidth(400);

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
		int rownum = tbl.getRowCount();

		for (int i = 1; i <= rownum; i++) {
			System.out.println(i);
		}
	}
}
