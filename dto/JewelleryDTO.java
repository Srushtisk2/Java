package com.xworkz.customEx.dto;

public class JewelleryDTO {
	
	private String metaltype;
	private String jeweltype;
	private int price;
	private String color;
	private float weight;
	private String materials;
	private String design;
	private float carats;
	
	public String getMetaltype() {
		return metaltype;
	}
	public void setMetaltype(String metaltype) {
		this.metaltype = metaltype;
	}
	public String getJeweltype() {
		return jeweltype;
	}
	public void setJeweltype(String jeweltype) {
		this.jeweltype = jeweltype;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public String getMaterials() {
		return materials;
	}
	public void setMaterials(String materials) {
		this.materials = materials;
	}
	public String getDesign() {
		return design;
	}
	public void setDesign(String design) {
		this.design = design;
	}
	public float getCarats() {
		return carats;
	}
	public void setCarats(float carats) {
		this.carats = carats;
	}
	@Override
	public String toString() {
		return "JewelleryDTO [metaltype=" + metaltype + ", jeweltype=" + jeweltype + ", price=" + price + ", color="
				+ color + ", weight=" + weight + ", materials=" + materials + ", design=" + design + ", carats="
				+ carats + "]";
	}
}
	
	

