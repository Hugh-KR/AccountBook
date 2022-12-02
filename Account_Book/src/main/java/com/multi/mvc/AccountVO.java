package com.multi.mvc;

public class AccountVO {
	private String paydate;
	private String payselect;
	private String category;
	private int amount;
	private String memo;
	
	public String getPaydate() {
		return paydate;
	}
	public void setPaydate(String paydate) {
		this.paydate = paydate;
	}
	public String getPayselect() {
		return payselect;
	}
	public void setPayselect(String payselect) {
		this.payselect = payselect;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
}