package com.fkcw.util;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class DBUtils {
	public static TableModel rstotblmod(ResultSet rs){
		try {
			ResultSetMetaData metaData = rs.getMetaData();
			int numofcols = metaData.getColumnCount();
			Vector<String> nameofcol = new Vector<String>();
			for (int i = 0; i < numofcols; i++) {
				nameofcol.add(metaData.getColumnLabel(i+1));
			}
			Vector<Vector<Object>> rows = new Vector<Vector<Object>>();
			while(rs.next()){
				Vector<Object> newrow = new Vector<Object>();
				for (int i = 1; i <=numofcols; i++) {
					newrow.addElement(rs.getObject(i));
				}
				rows.add(newrow);
			}
			return new DefaultTableModel(rows,nameofcol);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
}
