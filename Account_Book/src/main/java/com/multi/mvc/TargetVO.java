package com.multi.mvc;

public class TargetVO {
	private int food;
	private int trans;
	private int medi;
	private int leis;
	private int ets;
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
	public int getEts() {
		return ets;
	}
	public void setEts(int ets) {
		this.ets = ets;
	}
	@Override
	public String toString() {
		return "TargetVO [food=" + food + ", trans=" + trans + ", medi=" + medi + ", leis=" + leis + ", ets=" + ets
				+ "]";
	}
	
}
