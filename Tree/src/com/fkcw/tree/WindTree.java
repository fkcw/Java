package com.fkcw.tree;

import java.io.File;

public class WindTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		list(new File("d:\\bndisk"), 0);

	}

	public static void list(File indir, int tab) {
		if (indir.isDirectory()) {
			File next[] = indir.listFiles();
			for (int i = 0; i < next.length; i++) {
				for (int j = 0; j < tab; j++) {
					System.out.print("--\\");
				}
				System.out.println(next[i].getName());
				if (next[i].isDirectory()) {
					list(next[i], tab+1);
				}
			}
		}

	}

}
