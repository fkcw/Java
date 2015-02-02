package com.fkcw.tstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Rstream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("test.txt");
			byte input[]= new byte[12];
			fis.read(input);
			fis.close();
			String instring = new String(input,"GBK");
			System.out.println(instring);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
