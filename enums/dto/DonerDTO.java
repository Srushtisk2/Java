package com.xworkz.enums.dto;

public class DonerDTO 
{

private String name;
private byte age;
private float weight;
private BloodGroup bloodGroup;
private Gender gender;
private ContactDetails details;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public byte getAge() {
	return age;
}
	
public void setAge(byte age) {
	this.age = age;

}

public float getWeight() {
	return weight;
}

public void setWeight(float weight) {
	this.weight = weight;
}

public BloodGroup getBloodGroup() {
	return bloodGroup;
}

public void setBloodGroup(BloodGroup bloodGroup) {
	this.bloodGroup = bloodGroup;
}

public Gender getGender() {
	return gender;
}

public void setGender(Gender gender) {
	this.gender = gender;
}

public ContactDetails getDetails() {
	return details;
}

public void setDetails(ContactDetails details) {
	this.details = details;
}

public String toString() {
	return getClass().getSimpleName() + "name=" + name + ", age=" + age +", weight=" + weight +", "
			+ "gender=" + gender +", details=" + details;
}

}
