package com.fkcw.tstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Wstream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("test1.txt");
			String outstr = "wtre 123 ÄãºÃ";
			byte outstrb[] = outstr.getBytes("GBK");
			fos.write(outstrb);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
