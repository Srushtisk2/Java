package com.xworkz.book.dao;

import com.xworkz.book.dto.Bookstore;

public class BookDAO {
	Bookstore[] dtos=new Bookstore[5];
	int index=0;
	public String insert(Bookstore dto) {
		if(dto==null) {
			return "this is null object";
		}
		else
		{
			dtos[index]=dto;
			System.out.println(dtos[index].getName());
			index++;
			return "object added with the company name"+dtos[index-1].getName();
		}            
	}
	public void printAll() {
		for(int index=0;index<dtos.length;index++) {
			if(dtos[index]!=null) {
				System.out.println(dtos[index].getAll());
			}
		}
	}
	public boolean deleteByStocks(int stocks) {
		for(int index=0;index<dtos.length;index++) {
			if(stocks==dtos[index].getStocks()) {
				dtos[index]=null;
				return true;
			}
	}
		return false;
	}
}
