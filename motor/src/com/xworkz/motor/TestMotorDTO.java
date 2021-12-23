package com.xworkz.motor;

import com.xworkz.motor.dao.MotorDAO;
import com.xworkz.motor.dto.MotordetailsDTO;
import com.xworkz.motor.dto.SpecificationDTO;

public class TestMotorDTO {
	public static void main(String []args) {
		
		MotordetailsDTO details = new MotordetailsDTO();
		MotordetailsDTO details1 = new MotordetailsDTO();
		
		SpecificationDTO dto = new 	SpecificationDTO();
		SpecificationDTO dto1 = new 	SpecificationDTO();
		
		
		details.setType("dc-Motor");
		details.setCompany("hurst-Motors");
		details.setColor("green");
		details.setWarrenty((byte)2);
		details.setNoofphase((byte)3);
		
		details1.setType("dc-Motor");
		details1.setCompany("bhorzvan-Motors");
		details1.setColor("blue");
		details1.setWarrenty((byte)2);
		details1.setNoofphase((byte)3);
		
		dto.setSpecifictype("dc-stepperMotor");
		dto.setVoltage((short)240);
		dto.setHorsepower((byte)3);
		dto.setCurrent((byte)5);
		dto.setFramesize((byte)35);
		dto.setStepangel(8.56f);
		
		dto.setSpecifictype("dc-stepperMotor");
		dto.setVoltage((short)240);
		dto.setHorsepower((byte)5);
		dto.setCurrent((byte)7);
		dto.setFramesize((byte)55);
		dto.setStepangel(14.56f);
		
		details.setSpecification(dto);
		details1.setSpecification(dto1);
		
		System.out.println(details.getCompany());
		System.out.println(dto.getSpecifictype());
		System.out.println();
		
		MotorDAO dao = new MotorDAO();
		dao.add(details);
		dao.add(details1);
		dao.printAll();
		System.out.println();
		MotordetailsDTO res=dao.deleteByColor("green");
		System.out.println(res);
		dao.printAll();
	}

}

