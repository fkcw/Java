package com.fkcw.DBUtil;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class TBUtil {
	
	public TableModel rstotbm(ResultSet rs) throws SQLException{
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
		
		
		return new DefaultTableModel(rows,nameofcol);
	}
}
