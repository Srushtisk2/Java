package com.xworkz.book.dto;

public class Bookstore 
{
	private String name;
	private long income;
	private int stocks;
	private Storeowner details;
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setIncome(long income) {
		this.income=income;
	}
	public long getIncome() {
		return income;
	}
	public void setStocks(int stocks) {
		this.stocks=stocks;
	}
	public int getStocks() {
		return stocks;
	}
	public void setDetails(Storeowner details) {
		this.details=details;
	}
	public Storeowner getDetails() {
		return details;
	}

	public String getAll() {
		return name+"\t"+income+"\t"+stocks+"\t"+details.getAll();
	}
	}



