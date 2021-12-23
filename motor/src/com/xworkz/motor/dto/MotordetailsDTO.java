package com.xworkz.motor.dto;

public class MotordetailsDTO 
{
	String type;
	String company;
	String color;
	byte warrenty;
	byte noofphase;
	SpecificationDTO specification;
	
	public MotordetailsDTO() {
		
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public byte getWarrenty() {
		return warrenty;
	}
	public void setWarrenty(byte warrenty) {
		this.warrenty = warrenty;
	}
	public byte getNoofphase() {
		return noofphase;
	}
	public void setNoofphase(byte noofphase) {
		this.noofphase = noofphase;
	}
	public SpecificationDTO getSpecification() {
		return specification;
	}
	public void setSpecification(SpecificationDTO specification) {
		this.specification = specification;
	}


	public String toString() {
		return "MotordetailsDTO [type=" + type + ", company=" + company + ", color=" + color + ", warrenty=" + warrenty
				+ ", noofphase=" + noofphase + ", specification=" + specification + "]";
	}

  
}

	


