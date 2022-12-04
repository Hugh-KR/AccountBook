package com.multi.mvc;

public class AccountVO {
	private String paydate;
	private String payment;
	private String category;
	private String payselect;
	private int amount;
	private String memo;
	private int deposit;
	private int withdraw;
	
	
	
	public String getPayselect() {
		return payselect;
	}
	public void setPayselect(String payselect) {
		this.payselect = payselect;
	}
	public String getPaydate() {
		return paydate;
	}
	public void setPaydate(String paydate) {
		this.paydate = paydate;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
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
	
	public int getDeposit() {
		return deposit;
	}
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	public int getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}
	@Override
	public String toString() {
		return "AccountVO [payment=" + payment + ", category=" + category + ", amount=" + amount
				+ ", memo=" + memo + "]";
	}
	
	
}
