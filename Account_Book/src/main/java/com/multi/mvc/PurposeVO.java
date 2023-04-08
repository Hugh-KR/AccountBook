package com.multi.mvc;

public class PurposeVO {
	private int food;
	private int trans;
	private int medi;
	private int leis;
	private int etc;
	private int month;
	
	public int getFood() {
		return food;
	}
	public void setFood(int food) {
		this.food = food;
	}
	public int getTrans() {
		return trans;
	}
	public void setTrans(int trans) {
		this.trans = trans;
	}
	public int getMedi() {
		return medi;
	}
	public void setMedi(int medi) {
		this.medi = medi;
	}
	public int getLeis() {
		return leis;
	}
	public void setLeis(int leis) {
		this.leis = leis;
	}
	public int getEtc() {
		return etc;
	}
	public void setEtc(int etc) {
		this.etc = etc;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	
	@Override
	public String toString() {
		return "PurposeVO [food=" + food + ", trans=" + trans + ", medi=" + medi + ", leis=" + leis + ", etc=" + etc + ", month=" + month
				+ "]";
	}
}
