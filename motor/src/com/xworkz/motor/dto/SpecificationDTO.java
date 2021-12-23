package com.xworkz.motor.dto;

public class SpecificationDTO 
{

	String specifictype;
	short voltage;
	byte horsepower;
	byte current;
	byte framesize;
	float stepangel;
	
	
	public String getSpecifictype() {
		return specifictype;
	}
	public void setSpecifictype(String specifictype) {
		this.specifictype = specifictype;
	}
	public short getVoltage() {
		return voltage;
	}
	public void setVoltage(short voltage) {
		this.voltage = voltage;
	}
	public byte getHorsepower() {
		return horsepower;
	}
	public void setHorsepower(byte horsepower) {
		this.horsepower = horsepower;
	}
	public byte getCurrent() {
		return current;
	}
	public void setCurrent(byte current) {
		this.current = current;
	}
	public byte getFramesize() {
		return framesize;
	}
	public void setFramesize(byte framesize) {
		this.framesize = framesize;
	}
	public float getStepangel() {
		return stepangel;
	}
	public void setStepangel(float stepangel) {
		this.stepangel = stepangel;
	}
	
	public String toString() {
		return "SpecificationDTO [specifictype=" + specifictype + ", voltage=" + voltage + ", horsepower=" + horsepower
				+ ", current=" + current + ", framesize=" + framesize + ", stepangel=" + stepangel + "]";
	}

	
}


