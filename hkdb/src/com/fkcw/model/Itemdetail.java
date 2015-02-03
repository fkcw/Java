package com.fkcw.model;

public class Itemdetail {
	private int id;
	private String procode;
	private String area;
	private String facode;
	private String classs;
	private String des;
	private String des_cn;
	private String vendor;
	private double price;
	
	public Itemdetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Itemdetail(String procode, String area, String facode,
			String classs, String des, String des_cn, String vendor,
			double price) {
		super();
		this.procode = procode;
		this.area = area;
		this.facode = facode;
		this.classs = classs;
		this.des = des;
		this.des_cn = des_cn;
		this.vendor = vendor;
		this.price = price;
	}
	public String getProcode() {
		return procode;
	}
	public void setProcode(String procode) {
		this.procode = procode;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getFacode() {
		return facode;
	}
	public void setFacode(String facode) {
		this.facode = facode;
	}
	public String getClasss() {
		return classs;
	}
	public void setClasss(String classs) {
		this.classs = classs;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public String getDes_cn() {
		return des_cn;
	}
	public void setDes_cn(String des_cn) {
		this.des_cn = des_cn;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
