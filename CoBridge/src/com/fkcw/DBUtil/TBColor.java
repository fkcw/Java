package com.fkcw.DBUtil;

import java.awt.Color;
import java.awt.Component;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.tools.JavaCompiler;

public class TBColor extends DefaultTableCellRenderer{
	/**
	 * 
	 */

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	private static Date date = new Date();
	private static final long serialVersionUID = 1L;

	DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
	public Component getTableCellRendererComponent(JTable table, Object value,  
			boolean isSelected, boolean hasFocus, int row, int column){
//		returned = table.getValueAt(row, column);
		if((value instanceof Date)&&(dateFormat.format(value).equals(dateFormat.format(date)))){
			return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
			
		}else{
			if(dateFormat.format(value).equals(dateFormat.format(date))){
			dtcr.setBackground(Color.green);
			return dtcr.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
			}else{
			return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
			}
		}
	}
}
