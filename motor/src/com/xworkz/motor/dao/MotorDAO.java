package com.xworkz.motor.dao;


import com.xworkz.motor.dto.MotordetailsDTO;

import com.xworkz.motor.dto.MotordetailsDTO;

public class MotorDAO {
	
	MotordetailsDTO[] details = new MotordetailsDTO[4];
	int index=0;
	
	public void add(MotordetailsDTO name) {
		if(index<details.length) {
			details[index]=name;
			index++;
		}
	}
	
	public void printAll() {
		for(int index=0;index<details.length;index++) {
			if(details[index]!=null) {
			System.out.println(details[index].toString());
			}
		}
	}
	
	public MotordetailsDTO deleteByColor(String color) {
		MotordetailsDTO detail = null;
		if(details[index]!=null) {
		for(int index=0;index<details.length;index++) {
			if(color.equals(details[index].getColor())) {
			details[index]=null; 
			detail=details[index];
			}
		}
		}
	      return detail;
	}
	

}
