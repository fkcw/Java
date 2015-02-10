package com.fkcw.DBUtil;

import java.awt.Color;
import java.awt.Component;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class TBColor extends DefaultTableCellRenderer{
	/**
	 * 
	 */
	private String v1;
	private String v2;
	private static final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	private static Date date = new Date();
	private static final long serialVersionUID = 1L;
	DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
	public Component getTableCellRendererComponent(JTable table, Object value,  
			boolean isSelected, boolean hasFocus, int row, int column){
		
		if(value.toString()==(dateFormat.format(date)).toString()){
			//System.out.println(dateFormat.format(date));
			dtcr.setBackground(Color.green);
			return dtcr.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
		}else{
			
			return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
		}
	}
}
